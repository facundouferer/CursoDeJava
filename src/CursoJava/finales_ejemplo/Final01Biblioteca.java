package CursoJava.finales_ejemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/*
 * Final de ejemplo 01 – Biblioteca
 *
 * Enunciado:
 * Una biblioteca administra ítems (libros y revistas). Cada ítem tiene código, título y año.
 * 1. Modele la jerarquía con una clase abstracta Item y las subclases Libro y Revista.
 *    Los ítems prestables implementan la interfaz Prestable.
 * 2. No se pueden cargar dos ítems con el mismo código (equals/hashCode).
 * 3. Un préstamo sobre un ítem ya prestado, o sobre un código inexistente, debe lanzar una
 *    excepción propia (ItemNoDisponibleException).
 * 4. Liste los ítems ordenados por título (Comparable) y recórralos con un Iterator,
 *    eliminando los anteriores a un año dado.
 * 5. Guarde el catálogo en un archivo de texto y vuelva a cargarlo.
 * 6. Calcule el promedio de años, el título más largo y cuántas vocales tiene el catálogo
 *    (arreglos, Strings y métodos con sobrecarga).
 *
 * Unidades cubiertas: l01 a l12, l15, l16 y l19 (ver README.md).
 */
public class Final01Biblioteca {

    // ---- l12: excepción propia ----
    static class ItemNoDisponibleException extends Exception {
        ItemNoDisponibleException(String mensaje) {
            super(mensaje);
        }
    }

    // ---- l11: interfaz ----
    interface Prestable {
        void prestar() throws ItemNoDisponibleException;

        void devolver();

        boolean estaPrestado();
    }

    // ---- l06 a l11: clase abstracta, encapsulamiento, herencia, polimorfismo ----
    static abstract class Item implements Comparable<Item> {
        private final String codigo;
        private final String titulo;
        private final int anio;

        Item(String codigo, String titulo, int anio) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.anio = anio;
        }

        String getCodigo() {
            return codigo;
        }

        String getTitulo() {
            return titulo;
        }

        int getAnio() {
            return anio;
        }

        abstract String tipo();

        // l16: equals/hashCode por código, para que HashSet rechace duplicados
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Item)) {
                return false;
            }
            return codigo.equals(((Item) o).codigo);
        }

        @Override
        public int hashCode() {
            return Objects.hash(codigo);
        }

        // l16: orden natural por título
        @Override
        public int compareTo(Item otro) {
            return titulo.compareToIgnoreCase(otro.titulo);
        }

        @Override
        public String toString() {
            return tipo() + "[" + codigo + ", " + titulo + ", " + anio + "]";
        }
    }

    static class Libro extends Item implements Prestable {
        private boolean prestado;

        Libro(String codigo, String titulo, int anio) {
            super(codigo, titulo, anio);
        }

        @Override
        String tipo() {
            return "Libro";
        }

        @Override
        public void prestar() throws ItemNoDisponibleException {
            if (prestado) {
                throw new ItemNoDisponibleException("El libro " + getCodigo() + " ya está prestado");
            }
            prestado = true;
        }

        @Override
        public void devolver() {
            prestado = false;
        }

        @Override
        public boolean estaPrestado() {
            return prestado;
        }
    }

    // La revista no es prestable: solo consulta en sala.
    static class Revista extends Item {
        Revista(String codigo, String titulo, int anio) {
            super(codigo, titulo, anio);
        }

        @Override
        String tipo() {
            return "Revista";
        }
    }

    // ---- l13/l15: colección con genéricos, sin duplicados ----
    static class Catalogo {
        private final List<Item> items = new ArrayList<>();
        private final Set<Item> vistos = new HashSet<>();

        boolean agregar(Item item) {
            if (!vistos.add(item)) {
                return false;
            }
            items.add(item);
            return true;
        }

        Item buscar(String codigo) throws ItemNoDisponibleException {
            for (Item item : items) {
                if (item.getCodigo().equals(codigo)) {
                    return item;
                }
            }
            throw new ItemNoDisponibleException("No existe el código " + codigo);
        }

        void prestar(String codigo) throws ItemNoDisponibleException {
            Item item = buscar(codigo);
            if (!(item instanceof Prestable)) {
                throw new ItemNoDisponibleException(item.tipo() + " " + codigo + " no es prestable");
            }
            ((Prestable) item).prestar();
        }

        List<Item> ordenados() {
            List<Item> copia = new ArrayList<>(items);
            Collections.sort(copia);
            return copia;
        }

        // l16: Iterator con remove
        int eliminarAnterioresA(int anio) {
            int eliminados = 0;
            Iterator<Item> it = items.iterator();
            while (it.hasNext()) {
                Item item = it.next();
                if (item.getAnio() < anio) {
                    it.remove();
                    vistos.remove(item);
                    eliminados++;
                }
            }
            return eliminados;
        }

        List<Item> getItems() {
            return items;
        }
    }

    // ---- l19: persistencia en archivo de texto ----
    static void guardar(Catalogo catalogo, Path ruta) throws IOException {
        try (BufferedWriter out = Files.newBufferedWriter(ruta)) {
            for (Item item : catalogo.getItems()) {
                out.write(item.tipo() + ";" + item.getCodigo() + ";" + item.getTitulo() + ";" + item.getAnio());
                out.newLine();
            }
        }
    }

    static Catalogo cargar(Path ruta) throws IOException {
        Catalogo catalogo = new Catalogo();
        try (BufferedReader in = Files.newBufferedReader(ruta)) {
            String linea;
            while ((linea = in.readLine()) != null) {
                String[] partes = linea.split(";");
                int anio = Integer.parseInt(partes[3]);
                if (partes[0].equals("Libro")) {
                    catalogo.agregar(new Libro(partes[1], partes[2], anio));
                } else {
                    catalogo.agregar(new Revista(partes[1], partes[2], anio));
                }
            }
        }
        return catalogo;
    }

    // ---- l04/l05: arreglos, Strings y sobrecarga ----
    static double promedio(int[] valores) {
        int suma = 0;
        for (int v : valores) {
            suma += v;
        }
        return valores.length == 0 ? 0 : (double) suma / valores.length;
    }

    static int contarVocales(String texto) {
        int cantidad = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    static int contarVocales(List<Item> items) {
        int total = 0;
        for (Item item : items) {
            total += contarVocales(item.getTitulo());
        }
        return total;
    }

    static String tituloMasLargo(List<Item> items) {
        String mayor = "";
        for (Item item : items) {
            if (item.getTitulo().length() > mayor.length()) {
                mayor = item.getTitulo();
            }
        }
        return mayor;
    }

    public static void main(String[] args) throws IOException {
        Catalogo catalogo = new Catalogo();
        catalogo.agregar(new Libro("L1", "Estructuras de Datos", 2015));
        catalogo.agregar(new Libro("L2", "Algoritmos", 1999));
        catalogo.agregar(new Revista("R1", "Ciencia Hoy", 2020));
        System.out.println("Duplicado agregado: " + catalogo.agregar(new Libro("L1", "Otro título", 2001)));

        // l12: manejo de errores
        String[] intentos = {"L1", "L1", "R1", "X9"};
        for (String codigo : intentos) {
            try {
                catalogo.prestar(codigo);
                System.out.println("Prestado " + codigo);
            } catch (ItemNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Ordenados por título:");
        for (Item item : catalogo.ordenados()) {
            System.out.println("  " + item);
        }

        int[] anios = new int[catalogo.getItems().size()];
        for (int i = 0; i < anios.length; i++) {
            anios[i] = catalogo.getItems().get(i).getAnio();
        }
        System.out.printf("Promedio de años: %.1f%n", promedio(anios));
        System.out.println("Título más largo: " + tituloMasLargo(catalogo.getItems()));
        System.out.println("Vocales en el catálogo: " + contarVocales(catalogo.getItems()));

        Path archivo = Files.createTempFile("catalogo", ".txt");
        guardar(catalogo, archivo);
        Catalogo recargado = cargar(archivo);
        Files.delete(archivo);
        System.out.println("Recargados desde archivo: " + recargado.getItems().size());

        System.out.println("Eliminados anteriores a 2010: " + recargado.eliminarAnterioresA(2010));
        System.out.println("Quedan: " + recargado.getItems());
    }
}
