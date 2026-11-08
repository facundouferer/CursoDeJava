package CursoJava.l18_grafos_representacion_y_algoritmos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Calcular las distancias mínimas desde un origen en un grafo dirigido con pesos no negativos.
 * Concepto: 4. Dijkstra: el camino más barato.
 */
public class Ej06DijkstraConPriorityQueue {

  record Arista<V>(V destino, int peso) {}

  static class GrafoPonderado<V> {
    private final Map<V, List<Arista<V>>> adyacencia = new HashMap<>();

    public void agregarArista(V origen, V destino, int peso) {
      adyacencia.computeIfAbsent(origen, k -> new ArrayList<>()).add(new Arista<>(destino, peso));
      adyacencia.computeIfAbsent(destino, k -> new ArrayList<>());
    }

    public List<Arista<V>> aristasDe(V v) {
      return adyacencia.getOrDefault(v, List.of());
    }

    public Map<V, Integer> dijkstra(V origen) {
      Map<V, Integer> distancia = new HashMap<>();
      Set<V> visitados = new HashSet<>();

      // La cola de prioridad siempre saca el vértice más barato
      PriorityQueue<V> cola = new PriorityQueue<>(
        Comparator.comparingInt(v -> distancia.getOrDefault(v, Integer.MAX_VALUE))
      );

      distancia.put(origen, 0);
      cola.offer(origen);

      while (!cola.isEmpty()) {
        V actual = cola.poll();
        if (!visitados.add(actual)) continue; // ya lo procesamos

        for (Arista<V> arista : aristasDe(actual)) {
          int nueva = distancia.get(actual) + arista.peso();
          // "Relajar": si por acá sale más barato, actualizamos
          if (nueva < distancia.getOrDefault(arista.destino(), Integer.MAX_VALUE)) {
            distancia.put(arista.destino(), nueva);
            cola.offer(arista.destino());
          }
        }
      }
      return distancia;
    }
  }

  public static void main(String[] args) {
    GrafoPonderado<String> grafo = new GrafoPonderado<>();
    grafo.agregarArista("A", "B", 4);
    grafo.agregarArista("A", "C", 2);
    grafo.agregarArista("C", "B", 1);
    grafo.agregarArista("B", "D", 5);
    grafo.agregarArista("C", "D", 8);
    grafo.agregarArista("D", "E", 3);

    Map<String, Integer> distancia = grafo.dijkstra("A");
    System.out.println("Distancias mínimas desde A:");
    for (String v : List.of("A", "B", "C", "D", "E")) {
      System.out.println("  " + v + " = " + distancia.get(v));
    }
    System.out.println("La arista directa A -> B cuesta 4, pero A -> C -> B cuesta 2 + 1 = " + distancia.get("B"));
  }
}
