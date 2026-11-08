package CursoJava.l18_grafos_representacion_y_algoritmos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Recorrer un grafo por capas con una cola y un Set de visitados, marcando al encolar.
 * Concepto: 3. BFS y DFS: el mismo algoritmo con distinta memoria (BFS).
 */
public class Ej04RecorridoBFS {

  static class Grafo<V> {
    private final Map<V, List<V>> adyacencia = new HashMap<>();

    public void agregarArista(V origen, V destino) {
      adyacencia.computeIfAbsent(origen, k -> new ArrayList<>()).add(destino);
      adyacencia.computeIfAbsent(destino, k -> new ArrayList<>()).add(origen);
    }

    public List<V> vecinos(V v) {
      return adyacencia.getOrDefault(v, List.of());
    }

    // BFS — cola: primero en entrar, primero en salir
    public List<V> bfs(V inicio) {
      List<V> orden = new ArrayList<>();
      Set<V> visitados = new HashSet<>();
      Queue<V> pendientes = new ArrayDeque<>();

      visitados.add(inicio); // ← marcar AL ENCOLAR, no al desencolar
      pendientes.offer(inicio);

      while (!pendientes.isEmpty()) {
        V actual = pendientes.poll();
        orden.add(actual);

        for (V vecino : vecinos(actual)) {
          if (visitados.add(vecino)) { // add devuelve false si ya estaba
            pendientes.offer(vecino);
          }
        }
      }
      return orden;
    }
  }

  public static void main(String[] args) {
    Grafo<String> grafo = new Grafo<>();
    grafo.agregarArista("A", "B");
    grafo.agregarArista("A", "D");
    grafo.agregarArista("B", "C");
    grafo.agregarArista("B", "E");
    grafo.agregarArista("D", "E");
    grafo.agregarArista("C", "E");
    grafo.agregarArista("E", "F");

    // Hay ciclos (A–B–E–D–A): el Set de visitados evita el bucle infinito.
    System.out.println("BFS desde A: " + String.join(" · ", grafo.bfs("A")));
  }
}
