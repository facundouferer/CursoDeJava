package CursoJava.l23_algoritmia_verificacion_y_complejidad;

import java.util.Arrays;

/**
 * Lección 23 – Algoritmos: Especificación, Verificación y Complejidad
 * Objetivo: Ordenar un arreglo de enteros con quicksort y contar las comparaciones.
 * Concepto: 4. Complejidad temporal y espacial (caso promedio O(n log n), peor caso O(n²)).
 */
public class Ej03OrdenamientoRapido {

  private static long comparaciones;

  /** Ordena el arreglo de menor a mayor y devuelve la cantidad de comparaciones realizadas. */
  public static long ordenar(int[] arreglo) {
    if (arreglo == null) {
      throw new IllegalArgumentException("El arreglo no puede ser null");
    }
    comparaciones = 0;
    ordenar(arreglo, 0, arreglo.length - 1);
    return comparaciones;
  }

  private static void ordenar(int[] arreglo, int inicio, int fin) {
    if (inicio >= fin) {
      return;
    }
    int pivote = arreglo[inicio + (fin - inicio) / 2];
    int corte = particionar(arreglo, inicio, fin, pivote);
    System.out.println("Pivote " + pivote + ": " + Arrays.toString(arreglo)
        + " | izquierda [" + inicio + ", " + (corte - 1) + "], derecha [" + corte + ", " + fin + "]");
    ordenar(arreglo, inicio, corte - 1);
    ordenar(arreglo, corte, fin);
  }

  // Deja a la izquierda del índice devuelto los elementos <= pivote y a la derecha los >= pivote.
  private static int particionar(int[] arreglo, int inicio, int fin, int pivote) {
    int i = inicio;
    int j = fin;
    while (i <= j) {
      while (arreglo[i] < pivote) {
        comparaciones++;
        i++;
      }
      comparaciones++; // comparación que detuvo el avance de i
      while (arreglo[j] > pivote) {
        comparaciones++;
        j--;
      }
      comparaciones++; // comparación que detuvo el retroceso de j
      if (i <= j) {
        int auxiliar = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = auxiliar;
        i++;
        j--;
      }
    }
    return i;
  }

  /** Postcondición: cada elemento es menor o igual que el siguiente. */
  static boolean estaOrdenado(int[] arreglo) {
    for (int i = 1; i < arreglo.length; i++) {
      if (arreglo[i - 1] > arreglo[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };
    System.out.println("Arreglo original: " + Arrays.toString(arreglo));

    long total = ordenar(arreglo);

    System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    System.out.println("Comparaciones: " + total);
    System.out.println("Resultado verificado: " + estaOrdenado(arreglo));
  }
}
