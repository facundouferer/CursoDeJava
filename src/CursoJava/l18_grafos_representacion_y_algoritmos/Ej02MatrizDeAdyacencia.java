package CursoJava.l18_grafos_representacion_y_algoritmos;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Representar el grafo A–B, A–C, B–C, C–D con una matriz de adyacencia y consultarla.
 * Concepto: 2. Las dos formas de representarlo (matriz de adyacencia).
 */
public class Ej02MatrizDeAdyacencia {

  public static void main(String[] args) {
    String[] vertices = {"A", "B", "C", "D"};
    int[][] matriz = new int[vertices.length][vertices.length];

    // No dirigido: la arista se agrega en los dos sentidos.
    agregarArista(matriz, 0, 1); // A–B
    agregarArista(matriz, 0, 2); // A–C
    agregarArista(matriz, 1, 2); // B–C
    agregarArista(matriz, 2, 3); // C–D

    System.out.println("Matriz de adyacencia:");
    System.out.print("    ");
    for (String v : vertices) {
      System.out.print(v + " ");
    }
    System.out.println();
    for (int i = 0; i < vertices.length; i++) {
      System.out.print(vertices[i] + " | ");
      for (int j = 0; j < vertices.length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }

    // Consultar una arista es O(1): una sola celda.
    System.out.println();
    System.out.println("¿Existe la arista A–D? " + (matriz[0][3] == 1));
    System.out.println("¿Existe la arista C–D? " + (matriz[2][3] == 1));

    // Recorrer los vecinos exige mirar toda la fila: O(V).
    System.out.print("Vecinos de C:");
    for (int j = 0; j < vertices.length; j++) {
      if (matriz[2][j] == 1) {
        System.out.print(" " + vertices[j]);
      }
    }
    System.out.println();

    // La memoria es O(V²) siempre, aunque casi no haya aristas.
    System.out.println("Celdas usadas: " + (vertices.length * vertices.length));
  }

  private static void agregarArista(int[][] matriz, int i, int j) {
    matriz[i][j] = 1;
    matriz[j][i] = 1;
  }
}
