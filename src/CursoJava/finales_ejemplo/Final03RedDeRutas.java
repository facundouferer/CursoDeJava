package CursoJava.finales_ejemplo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Final de ejemplo 03 – Red de rutas
 *
 * Enunciado:
 * 1. Modele una red de ciudades como grafo ponderado (lista de adyacencia) con Map y List.
 * 2. Implemente un recorrido en anchura (BFS) y el camino mínimo de Dijkstra desde una ciudad.
 * 3. Calcule en paralelo, con un ExecutorService de 3 hilos, las distancias mínimas desde
 *    cada ciudad hacia una ciudad destino, y espere los resultados con Future.
 * 4. Guarde los resultados en un repositorio (interfaz RepositorioDistancias). Provea una
 *    implementación en memoria y otra JDBC (PreparedStatement) que solo se usa si se pasa
 *    una URL JDBC como argumento.
 * 5. Escriba un reporte en un archivo de texto, usando manejo de excepciones.
 *
 * Unidades cubiertas: l15, l18, l19, l20 y l21, más herencia de interfaces y excepciones
 * de l11 y l12 (ver README.md).
 *
 * Uso: java CursoJava.finales_ejemplo.Final03RedDeRutas [jdbc:url usuario clave]
 */
public class Final03RedDeRutas {

    // ---- l18: grafo ponderado dirigido ----
    static class Grafo {
        private final Map<String, Map<String, Integer>> adyacentes = new LinkedHashMap<>();

        void agregarRuta(String origen, String destino, int km) {
            adyacentes.computeIfAbsent(origen, k -> new LinkedHashMap<>()).put(destino, km);
            adyacentes.computeIfAbsent(destino, k -> new LinkedHashMap<>()).put(origen, km);
        }

        Iterable<String> ciudades() {
            return adyacentes.keySet();
        }

        List<String> bfs(String inicio) {
            List<String> orden = new ArrayList<>();
            java.util.Set<String> visitadas = new java.util.HashSet<>();
            java.util.Queue<String> cola = new java.util.ArrayDeque<>();
            cola.add(inicio);
            visitadas.add(inicio);
            while (!cola.isEmpty()) {
                String actual = cola.poll();
                orden.add(actual);
                for (String vecino : adyacentes.get(actual).keySet()) {
                    if (visitadas.add(vecino)) {
                        cola.add(vecino);
                    }
                }
            }
            return orden;
        }

        Map<String, Integer> dijkstra(String origen) {
            Map<String, Integer> distancia = new HashMap<>();
            for (String ciudad : adyacentes.keySet()) {
                distancia.put(ciudad, Integer.MAX_VALUE);
            }
            distancia.put(origen, 0);
            PriorityQueue<Map.Entry<String, Integer>> cola =
                    new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
            cola.add(Map.entry(origen, 0));
            while (!cola.isEmpty()) {
                Map.Entry<String, Integer> actual = cola.poll();
                if (actual.getValue() > distancia.get(actual.getKey())) {
                    continue;
                }
                for (Map.Entry<String, Integer> arista : adyacentes.get(actual.getKey()).entrySet()) {
                    int nueva = actual.getValue() + arista.getValue();
                    if (nueva < distancia.get(arista.getKey())) {
                        distancia.put(arista.getKey(), nueva);
                        cola.add(Map.entry(arista.getKey(), nueva));
                    }
                }
            }
            return distancia;
        }
    }

    // ---- l21: acceso a datos detrás de una interfaz ----
    interface RepositorioDistancias {
        void guardar(String origen, String destino, int km) throws RepositorioException;

        Map<String, Integer> distanciasHacia(String destino) throws RepositorioException;
    }

    // ---- l12: excepción propia que envuelve el error técnico ----
    static class RepositorioException extends Exception {
        RepositorioException(String mensaje, Throwable causa) {
            super(mensaje, causa);
        }
    }

    static class RepositorioEnMemoria implements RepositorioDistancias {
        private final Map<String, Map<String, Integer>> datos = new HashMap<>();

        @Override
        public synchronized void guardar(String origen, String destino, int km) {
            datos.computeIfAbsent(destino, k -> new LinkedHashMap<>()).put(origen, km);
        }

        @Override
        public synchronized Map<String, Integer> distanciasHacia(String destino) {
            return new LinkedHashMap<>(datos.getOrDefault(destino, new LinkedHashMap<>()));
        }
    }

    // Requiere una base con: CREATE TABLE distancia(origen VARCHAR(50), destino VARCHAR(50), km INT)
    static class RepositorioJdbc implements RepositorioDistancias {
        private final String url;
        private final String usuario;
        private final String clave;

        RepositorioJdbc(String url, String usuario, String clave) {
            this.url = url;
            this.usuario = usuario;
            this.clave = clave;
        }

        @Override
        public void guardar(String origen, String destino, int km) throws RepositorioException {
            String sql = "INSERT INTO distancia (origen, destino, km) VALUES (?, ?, ?)";
            try (Connection con = DriverManager.getConnection(url, usuario, clave);
                    PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, origen);
                ps.setString(2, destino);
                ps.setInt(3, km);
                ps.executeUpdate();
            } catch (SQLException e) {
                throw new RepositorioException("No se pudo guardar " + origen + "->" + destino, e);
            }
        }

        @Override
        public Map<String, Integer> distanciasHacia(String destino) throws RepositorioException {
            String sql = "SELECT origen, km FROM distancia WHERE destino = ? ORDER BY origen";
            Map<String, Integer> resultado = new LinkedHashMap<>();
            try (Connection con = DriverManager.getConnection(url, usuario, clave);
                    PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, destino);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        resultado.put(rs.getString("origen"), rs.getInt("km"));
                    }
                }
            } catch (SQLException e) {
                throw new RepositorioException("No se pudo consultar el destino " + destino, e);
            }
            return resultado;
        }
    }

    // ---- l20: cálculo en paralelo con pool de hilos ----
    static void calcularEnParalelo(Grafo grafo, String destino, RepositorioDistancias repo)
            throws InterruptedException, ExecutionException, RepositorioException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        try {
            Map<String, Future<Integer>> pendientes = new LinkedHashMap<>();
            for (String ciudad : grafo.ciudades()) {
                Callable<Integer> tarea = () -> grafo.dijkstra(ciudad).get(destino);
                pendientes.put(ciudad, pool.submit(tarea));
            }
            for (Map.Entry<String, Future<Integer>> e : pendientes.entrySet()) {
                repo.guardar(e.getKey(), destino, e.getValue().get());
            }
        } finally {
            pool.shutdown();
        }
    }

    // ---- l19: reporte en archivo ----
    static void escribirReporte(Path ruta, String destino, Map<String, Integer> distancias) throws IOException {
        List<String> lineas = new ArrayList<>();
        lineas.add("Distancias hacia " + destino);
        for (Map.Entry<String, Integer> e : distancias.entrySet()) {
            lineas.add(e.getKey() + ": " + e.getValue() + " km");
        }
        Files.write(ruta, lineas);
    }

    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo();
        grafo.agregarRuta("Rosario", "Córdoba", 400);
        grafo.agregarRuta("Rosario", "Buenos Aires", 300);
        grafo.agregarRuta("Buenos Aires", "La Plata", 60);
        grafo.agregarRuta("Córdoba", "Mendoza", 650);
        grafo.agregarRuta("Buenos Aires", "Mendoza", 1050);
        grafo.agregarRuta("La Plata", "Mar del Plata", 330);

        System.out.println("BFS desde Rosario: " + grafo.bfs("Rosario"));
        System.out.println("Dijkstra desde Rosario: " + grafo.dijkstra("Rosario"));

        RepositorioDistancias repo = args.length == 3
                ? new RepositorioJdbc(args[0], args[1], args[2])
                : new RepositorioEnMemoria();

        String destino = "Mendoza";
        try {
            calcularEnParalelo(grafo, destino, repo);
            Map<String, Integer> guardadas = repo.distanciasHacia(destino);
            System.out.println("Distancias hacia " + destino + ": " + guardadas);

            Path reporte = Files.createTempFile("reporte", ".txt");
            escribirReporte(reporte, destino, guardadas);
            System.out.println("Reporte escrito con " + Files.readAllLines(reporte).size() + " líneas");
            Files.delete(reporte);
        } catch (RepositorioException e) {
            System.out.println("Error de persistencia: " + e.getMessage() + " (" + e.getCause().getMessage() + ")");
        }
    }
}
