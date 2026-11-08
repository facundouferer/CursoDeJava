package CursoJava.l23_algoritmia_verificacion_y_complejidad;

import java.util.Arrays;

/**
 * Lección 23 – Algoritmos: Especificación, Verificación y Complejidad
 * Objetivo: Ordenar un arreglo de enteros por mezcla (merge sort) y contar las comparaciones.
 * Concepto: 4. Complejidad temporal y espacial (O(n log n) en todos los casos, espacio O(n)).
 */
public class Ej02OrdenamientoPorMezcla {

  private static long comparaciones;

  /** Ordena el arreglo de menor a mayor y devuelve la cantidad de comparaciones realizadas. */
  public static long ordenar(int[] arreglo) {
    if (arreglo == null) {
      throw new IllegalArgumentException("El arreglo no puede ser null");
    }
    comparaciones = 0;
    if (arreglo.length > 1) {
      ordenar(arreglo, new int[arreglo.length], 0, arreglo.length - 1);
    }
    return comparaciones;
  }

  private static void ordenar(int[] arreglo, int[] auxiliar, int inicio, int fin) {
    if (inicio >= fin) {
      return;
    }
    int medio = inicio + (fin - inicio) / 2;
    ordenar(arreglo, auxiliar, inicio, medio);
    ordenar(arreglo, auxiliar, medio + 1, fin);
    mezclar(arreglo, auxiliar, inicio, medio, fin);
    System.out.println("Mezcla de " + inicio + " a " + fin + ": " + Arrays.toString(arreglo));
  }

  // Mezcla dos mitades ya ordenadas: [inicio, medio] y [medio + 1, fin].
  private static void mezclar(int[] arreglo, int[] auxiliar, int inicio, int medio, int fin) {
    System.arraycopy(arreglo, inicio, auxiliar, inicio, fin - inicio + 1);

    int i = inicio;
    int j = medio + 1;
    int k = inicio;
    while (i <= medio && j <= fin) {
      comparaciones++;
      if (auxiliar[i] <= auxiliar[j]) { // <= mantiene el orden de los elementos iguales (estable)
        arreglo[k++] = auxiliar[i++];
      } else {
        arreglo[k++] = auxiliar[j++];
      }
    }
    // Lo que queda de la mitad derecha ya está en su lugar; solo se copia lo que quede de la izquierda.
    while (i <= medio) {
      arreglo[k++] = auxiliar[i++];
    }
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
