/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Asociar claves con valores usando las tres implementaciones principales de Map.
 * Concepto: Map: las claves son únicas; put sobrescribe, get devuelve null si la clave no está,
 * getOrDefault evita ese null y merge simplifica los contadores.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ej16MapBasico {

  public static void main(String[] args) {
    Map<String, Integer> stock = new HashMap<>();
    stock.put("yerba", 12);
    stock.put("café", 5);
    stock.put("yerba", 20); // sobrescribe: las claves son únicas

    System.out.println("get(\"yerba\") = " + stock.get("yerba"));
    System.out.println("get(\"azúcar\") = " + stock.get("azúcar") + " (no está)");
    System.out.println("getOrDefault(\"azúcar\", 0) = " + stock.getOrDefault("azúcar", 0));

    System.out.println("\nRecorrido con entrySet:");
    for (Map.Entry<String, Integer> entrada : new TreeMap<>(stock).entrySet()) {
      System.out.println(entrada.getKey() + " → " + entrada.getValue());
    }

    // Métodos modernos que reemplazan a los if escritos a mano
    String[] compras = { "yerba", "café", "yerba", "azúcar" };
    Map<String, Integer> contador = new TreeMap<>();
    for (String compra : compras) {
      contador.merge(compra, 1, Integer::sum);
    }
    System.out.println("\nmerge (contador): " + contador);

    stock.putIfAbsent("yerba", 99); // ya estaba: no cambia
    stock.putIfAbsent("azúcar", 7); // no estaba: se agrega
    System.out.println("putIfAbsent: yerba=" + stock.get("yerba") + ", azúcar=" + stock.get("azúcar"));

    // Las tres implementaciones con los mismos datos
    String[] claves = { "pera", "manzana", "uva", "banana" };
    Map<String, Integer> hash = new HashMap<>();
    Map<String, Integer> linked = new LinkedHashMap<>();
    Map<String, Integer> tree = new TreeMap<>();
    for (int i = 0; i < claves.length; i++) {
      hash.put(claves[i], i);
      linked.put(claves[i], i);
      tree.put(claves[i], i);
    }
    System.out.println("\nLinkedHashMap (orden de inserción): " + linked);
    System.out.println("TreeMap (orden de clave): " + tree);
    System.out.println("HashMap (sin orden garantizado), mismos pares: " + hash.equals(tree));
  }
}
