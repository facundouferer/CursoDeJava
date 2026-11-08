package CursoJava.l18_grafos_representacion_y_algoritmos;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Calcular los caminos mínimos entre todos los pares de vértices, con INF seguro y detección de ciclos negativos.
 * Concepto: 8. Floyd–Warshall: caminos mínimos entre todos los pares.
 */
public class Ej08FloydWarshall {

  public static final long INF = Long.MAX_VALUE / 4;

  public record Resultado(long[][] distancias, boolean tieneCicloNegativo) {}

  public static Resultado calcular(long[][] pesos) {
    validarMatriz(pesos);
    int vertices = pesos.length;
    long[][] dist = new long[vertices][vertices];

    for (int i = 0; i < vertices; i++) {
      for (int j = 0; j < vertices; j++) {
        long peso = pesos[i][j];
        dist[i][j] = i == j ? Math.min(0, peso) : peso;
      }
    }

    for (int k = 0; k < vertices; k++) {
      for (int i = 0; i < vertices; i++) {
        if (dist[i][k] == INF) continue;
        for (int j = 0; j < vertices; j++) {
          if (dist[k][j] == INF) continue;
          long pasandoPorK = dist[i][k] + dist[k][j];
          if (pasandoPorK < dist[i][j]) {
            dist[i][j] = pasandoPorK;
          }
        }
      }
    }

    boolean cicloNegativo = false;
    for (int v = 0; v < vertices; v++) {
      if (dist[v][v] < 0) {
        cicloNegativo = true;
        break;
      }
    }
    return new Resultado(copiar(dist), cicloNegativo);
  }

  private static void validarMatriz(long[][] pesos) {
    if (pesos == null || pesos.length == 0) {
      throw new IllegalArgumentException("la matriz es obligatoria y no puede estar vacía");
    }
    int vertices = pesos.length;
    for (int i = 0; i < vertices; i++) {
      if (pesos[i] == null || pesos[i].length != vertices) {
        throw new IllegalArgumentException("se requiere una matriz cuadrada");
      }
      for (long peso : pesos[i]) {
        if (peso < -INF || peso > INF) {
          throw new IllegalArgumentException("peso fuera del rango seguro");
        }
      }
    }
  }

  private static long[][] copiar(long[][] matriz) {
    long[][] copia = new long[matriz.length][];
    for (int i = 0; i < matriz.length; i++) {
      copia[i] = matriz[i].clone();
    }
    return copia;
  }

  private static void imprimir(String titulo, String[] nombres, long[][] matriz) {
    System.out.println(titulo);
    System.out.print("    ");
    for (String n : nombres) {
      System.out.printf("%4s", n);
    }
    System.out.println();
    for (int i = 0; i < matriz.length; i++) {
      System.out.printf("%-4s", nombres[i]);
      for (long d : matriz[i]) {
        // Un par inalcanzable no se imprime como una distancia real.
        System.out.printf("%4s", d == INF ? "∞" : String.valueOf(d));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    String[] nombres = {"A", "B", "C"};

    // Aristas A→B=4, B→C=-2 y A→C=5; el resto es inalcanzable.
    long[][] pesos = {
      {0, 4, 5},
      {INF, 0, -2},
      {INF, INF, 0}
    };
    imprimir("Matriz inicial:", nombres, pesos);
    Resultado resultado = calcular(pesos);
    imprimir("Distancias mínimas:", nombres, resultado.distancias());
    System.out.println("A→C baja de 5 a " + resultado.distancias()[0][2] + " pasando por B.");
    System.out.println("¿Ciclo negativo? " + resultado.tieneCicloNegativo());

    // Ciclo negativo: A→B=1, B→A=-3 suma -2 en cada vuelta.
    long[][] conCiclo = {
      {0, 1},
      {-3, 0}
    };
    Resultado negativo = calcular(conCiclo);
    System.out.println();
    System.out.println("Grafo con ciclo A→B→A (1 + -3 = -2)");
    System.out.println("¿Ciclo negativo? " + negativo.tieneCicloNegativo());

    // Entrada inválida: matriz no cuadrada.
    try {
      calcular(new long[][] {{0, 1}, {0}});
    } catch (IllegalArgumentException e) {
      System.out.println("Entrada rechazada: " + e.getMessage());
    }
  }
}
