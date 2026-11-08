package CursoJava.l18_grafos_representacion_y_algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Implementar la clase genérica Grafo con un Map<V, List<V>> y mostrar el mismo grafo del ejemplo de la matriz.
 * Concepto: 2. Las dos formas de representarlo (lista de adyacencia).
 */
public class Ej03ListaDeAdyacencia {

  static class Grafo<V> {
    private final Map<V, List<V>> adyacencia = new HashMap<>();

    public void agregarVertice(V v) {
      adyacencia.putIfAbsent(v, new ArrayList<>());
    }

    // No dirigido: la arista se agrega en los dos sentidos
    public void agregarArista(V origen, V destino) {
      adyacencia.computeIfAbsent(origen, k -> new ArrayList<>()).add(destino);
      adyacencia.computeIfAbsent(destino, k -> new ArrayList<>()).add(origen);
    }

    public List<V> vecinos(V v) {
      return adyacencia.getOrDefault(v, List.of());
    }
  }

  public static void main(String[] args) {
    Grafo<String> grafo = new Grafo<>();
    grafo.agregarArista("A", "B");
    grafo.agregarArista("A", "C");
    grafo.agregarArista("B", "C");
    grafo.agregarArista("C", "D");
    grafo.agregarVertice("E"); // vértice aislado

    for (String v : List.of("A", "B", "C", "D", "E")) {
      System.out.println(v + " -> " + grafo.vecinos(v));
    }

    // getOrDefault evita el null para un vértice que no existe.
    System.out.println("Z -> " + grafo.vecinos("Z"));
  }
}
