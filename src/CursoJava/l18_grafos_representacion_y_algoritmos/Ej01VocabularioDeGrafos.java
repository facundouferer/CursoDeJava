package CursoJava.l18_grafos_representacion_y_algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Reconocer vértices, aristas, vecinos y grado en un grafo no dirigido y en uno dirigido con pesos.
 * Concepto: 1. Vocabulario.
 */
public class Ej01VocabularioDeGrafos {

  private record Arista(String origen, String destino, int peso) {}

  public static void main(String[] args) {
    // No dirigido: "A es amigo de B" implica "B es amigo de A".
    String[] vertices = {"A", "B", "C", "D", "E"};
    String[][] aristasNoDirigidas = {
      {"A", "B"}, {"B", "C"}, {"C", "D"}, {"D", "E"}, {"E", "A"}, {"A", "C"}
    };

    System.out.println("== Grafo no dirigido ==");
    System.out.println("Vértices: " + String.join(", ", vertices));
    System.out.println("Cantidad de aristas: " + aristasNoDirigidas.length);
    for (String v : vertices) {
      List<String> vecinos = new ArrayList<>();
      for (String[] arista : aristasNoDirigidas) {
        if (arista[0].equals(v)) {
          vecinos.add(arista[1]);
        } else if (arista[1].equals(v)) {
          vecinos.add(arista[0]);
        }
      }
      System.out.println("Vecinos de " + v + ": " + vecinos + " (grado " + vecinos.size() + ")");
    }

    // Dirigido con pesos: "A sigue a B" no implica "B sigue a A".
    List<Arista> aristasDirigidas = List.of(
      new Arista("A", "B", 4),
      new Arista("B", "C", 2),
      new Arista("C", "D", 5),
      new Arista("D", "E", 1),
      new Arista("E", "A", 7)
    );

    System.out.println();
    System.out.println("== Grafo dirigido con pesos ==");
    for (Arista a : aristasDirigidas) {
      System.out.println(a.origen() + " -> " + a.destino() + " (peso " + a.peso() + ")");
    }
    System.out.println("¿Existe A -> B? " + existe(aristasDirigidas, "A", "B"));
    System.out.println("¿Existe B -> A? " + existe(aristasDirigidas, "B", "A"));
  }

  private static boolean existe(List<Arista> aristas, String origen, String destino) {
    for (Arista a : aristas) {
      if (a.origen().equals(origen) && a.destino().equals(destino)) {
        return true;
      }
    }
    return false;
  }
}
