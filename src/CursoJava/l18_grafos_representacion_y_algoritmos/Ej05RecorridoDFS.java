package CursoJava.l18_grafos_representacion_y_algoritmos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Recorrer en profundidad el mismo grafo del BFS, de forma recursiva y con una pila explícita (ArrayDeque).
 * Concepto: 3. BFS y DFS (DFS) y 5. Errores frecuentes (DFS recursivo sobre un grafo enorme).
 */
public class Ej05RecorridoDFS {

  static class Grafo<V> {
    private final Map<V, List<V>> adyacencia = new HashMap<>();

    public void agregarArista(V origen, V destino) {
      adyacencia.computeIfAbsent(origen, k -> new ArrayList<>()).add(destino);
      adyacencia.computeIfAbsent(destino, k -> new ArrayList<>()).add(origen);
    }

    public List<V> vecinos(V v) {
      return adyacencia.getOrDefault(v, List.of());
    }

    // DFS — recursivo: la pila de llamadas de la JVM hace de pila
    public List<V> dfs(V inicio) {
      List<V> orden = new ArrayList<>();
      dfs(inicio, new HashSet<>(), orden);
      return orden;
    }

    private void dfs(V actual, Set<V> visitados, List<V> orden) {
      if (!visitados.add(actual)) return; // ya lo visitamos: cortar
      orden.add(actual);
      for (V vecino : vecinos(actual)) {
        dfs(vecino, visitados, orden);
      }
    }

    // DFS iterativo: pila explícita, sin riesgo de StackOverflowError
    public List<V> dfsIterativo(V inicio) {
      List<V> orden = new ArrayList<>();
      Set<V> visitados = new HashSet<>();
      Deque<V> pila = new ArrayDeque<>();

      pila.push(inicio);
      while (!pila.isEmpty()) {
        V actual = pila.pop();
        if (!visitados.add(actual)) continue; // en DFS se marca al desapilar
        orden.add(actual);

        // Se apila en orden inverso para visitar primero al primer vecino.
        List<V> vecinos = vecinos(actual);
        for (int i = vecinos.size() - 1; i >= 0; i--) {
          if (!visitados.contains(vecinos.get(i))) {
            pila.push(vecinos.get(i));
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

    System.out.println("DFS recursivo desde A: " + String.join(" · ", grafo.dfs("A")));
    System.out.println("DFS iterativo desde A: " + String.join(" · ", grafo.dfsIterativo("A")));
  }
}
