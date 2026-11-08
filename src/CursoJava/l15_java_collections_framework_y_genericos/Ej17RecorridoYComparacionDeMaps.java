/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Recorrer un Map de varias formas y comparar el orden de HashMap, LinkedHashMap y TreeMap.
 * Concepto: keySet, values y entrySet; TreeMap ordena por clave y ofrece firstKey/lastKey,
 * LinkedHashMap conserva el orden de inserción.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ej17RecorridoYComparacionDeMaps {

  public static void main(String[] args) {
    Map<String, Integer> hash = new HashMap<>();
    Map<String, Integer> linked = new LinkedHashMap<>();
    TreeMap<String, Integer> tree = new TreeMap<>();

    String[] frutas = { "pera", "manzana", "uva", "banana", "cereza" };
    int[] precios = { 300, 250, 500, 180, 700 };
    for (int i = 0; i < frutas.length; i++) {
      hash.put(frutas[i], precios[i]);
      linked.put(frutas[i], precios[i]);
      tree.put(frutas[i], precios[i]);
    }

    System.out.println("== keySet ==");
    for (String clave : linked.keySet()) {
      System.out.println(clave);
    }

    System.out.println("\n== values ==");
    int total = 0;
    for (int precio : linked.values()) {
      total += precio;
    }
    System.out.println("Suma de precios: " + total);

    System.out.println("\n== entrySet ==");
    for (Map.Entry<String, Integer> e : linked.entrySet()) {
      System.out.println(e.getKey() + " → " + e.getValue());
    }

    System.out.println("\n== forEach con lambda (TreeMap) ==");
    tree.forEach((clave, valor) -> System.out.println(clave + " = " + valor));

    System.out.println("\n== Comparación de implementaciones ==");
    System.out.println("LinkedHashMap (inserción): " + linked.keySet());
    System.out.println("TreeMap (orden natural):   " + tree.keySet());
    System.out.println("HashMap (según el hash):   cantidad = " + hash.size());

    System.out.println("\n== Operaciones propias de TreeMap ==");
    System.out.println("firstKey: " + tree.firstKey());
    System.out.println("lastKey: " + tree.lastKey());
    System.out.println("headMap(\"c\"): " + tree.headMap("c"));
  }
}
