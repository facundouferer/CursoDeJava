/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Unir dos listas de números sin que queden repetidos.
 * Concepto: Familia Set: un HashSet descarta duplicados al agregar.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.HashSet;
import java.util.Set;

public class Ej09UnionDeListas {

  public static void main(String[] args) {
    int[] lista1 = { 1, 2, 3, 3, 4 };
    int[] lista2 = { 5, 6, 7, 3, 8 };

    Set<Integer> union = new HashSet<>();
    for (int numero : lista1) {
      union.add(numero);
    }
    for (int numero : lista2) {
      union.add(numero);
    }

    System.out.println("Unión de las listas sin números repetidos:");
    for (Integer numero : union) {
      System.out.print(numero + " ");
    }
    System.out.println();
  }
}
