/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Cargar los mismos nombres en tres conjuntos y comparar el orden en que se recorren.
 * Concepto: Familia Set: sin duplicados; HashSet no garantiza orden, LinkedHashSet conserva el de
 * inserción y TreeSet mantiene el orden natural.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ej07FamiliaSet {

  public static void main(String[] args) {
    String[] nombres = { "Juan", "María", "Pedro", "Carolina", "Zorro", "Pedro", "María", "Carlos", "Carlos" };

    Set<String> hashSet = new HashSet<>();
    Set<String> linkedHashSet = new LinkedHashSet<>();
    Set<String> treeSet = new TreeSet<>();
    for (String nombre : nombres) {
      hashSet.add(nombre); // los repetidos se ignoran
      linkedHashSet.add(nombre);
      treeSet.add(nombre);
    }

    mostrar("HashSet (sin orden garantizado)", hashSet);
    mostrar("LinkedHashSet (orden de inserción)", linkedHashSet);
    mostrar("TreeSet (orden natural)", treeSet);
  }

  private static void mostrar(String titulo, Set<String> nombres) {
    System.out.println("\n" + titulo);
    System.out.println("Nombres: " + nombres);

    nombres.remove("Pedro");
    System.out.println("Nombres: " + nombres);

    System.out.println("Listado de nombres:");
    nombres.forEach(nombre -> System.out.println("- " + nombre.toUpperCase()));
  }
}
