package CursoJava.l23_algoritmia_verificacion_y_complejidad;

import java.util.Arrays;

/**
 * Lección 23 – Algoritmos: Especificación, Verificación y Complejidad
 * Objetivo: Ordenar un arreglo de enteros con burbuja y contar comparaciones e intercambios.
 * Concepto: 4. Complejidad temporal y espacial (mejor caso O(n), peor y caso promedio O(n²), espacio O(1)).
 */
public class Ej01OrdenamientoBurbuja {

  /** Ordena el arreglo de menor a mayor y devuelve la cantidad de comparaciones realizadas. */
  public static long ordenar(int[] arreglo) {
    if (arreglo == null) {
      throw new IllegalArgumentException("El arreglo no puede ser null");
    }
    long comparaciones = 0;
    int n = arreglo.length;
    for (int pasada = 1; pasada < n; pasada++) {
      boolean huboIntercambio = false;
      // Al final de cada pasada, el mayor elemento restante queda en su posición definitiva.
      for (int j = 0; j < n - pasada; j++) {
        comparaciones++;
        if (arreglo[j] > arreglo[j + 1]) {
          int auxiliar = arreglo[j];
          arreglo[j] = arreglo[j + 1];
          arreglo[j + 1] = auxiliar;
          huboIntercambio = true;
        }
      }
      System.out.println("Pasada " + pasada + ": " + Arrays.toString(arreglo));
      if (!huboIntercambio) {
        break; // sin intercambios el arreglo ya está ordenado
      }
    }
    return comparaciones;
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

    long comparaciones = ordenar(arreglo);

    System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    System.out.println("Comparaciones: " + comparaciones);
    System.out.println("Resultado verificado: " + estaOrdenado(arreglo));
  }
}
