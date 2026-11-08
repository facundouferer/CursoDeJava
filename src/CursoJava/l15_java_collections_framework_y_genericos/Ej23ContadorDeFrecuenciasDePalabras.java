/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Contar cuántas veces aparece cada palabra de un texto y mostrar el resultado ordenado.
 * Concepto: Desafío integrador: Map con merge para contar, Set para las palabras vacías y las
 * distintas, ordenamiento por frecuencia descendente y computeIfAbsent para agrupar por longitud.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ej23ContadorDeFrecuenciasDePalabras {

  private static final Set<String> VACIAS = Set.of(
      "de", "la", "el", "y", "que", "en", "a", "los", "las", "un", "una", "es");

  public static Map<String, Integer> contar(String texto) {
    Map<String, Integer> frecuencias = new HashMap<>();

    // [^\\p{L}]+ separa por todo lo que no sea una letra, incluidas las acentuadas
    for (String palabra : texto.toLowerCase().split("[^\\p{L}]+")) {
      if (palabra.isBlank() || VACIAS.contains(palabra)) {
        continue;
      }
      // merge: si no está, guarda 1; si está, aplica Integer::sum
      frecuencias.merge(palabra, 1, Integer::sum);
    }
    return frecuencias;
  }

  public static void main(String[] args) {
    String texto = """
        La programación orientada a objetos organiza el software en objetos.
        Cada objeto combina estado y comportamiento, y el estado de un objeto
        se protege con encapsulamiento. La herencia y el polimorfismo permiten
        que el software crezca sin reescribir el software existente.
        """;

    Map<String, Integer> frecuencias = contar(texto);

    // Un Set nos da las palabras distintas sin escribir una sola línea de lógica
    Set<String> distintas = frecuencias.keySet();
    System.out.println("Palabras distintas (sin contar vacías): " + distintas.size());
    System.out.println("Total de apariciones: "
        + frecuencias.values().stream().mapToInt(Integer::intValue).sum());
    System.out.println();

    // Primero por frecuencia descendente, después alfabéticamente
    List<Map.Entry<String, Integer>> ordenadas = new ArrayList<>(frecuencias.entrySet());
    ordenadas.sort(
        Map.Entry.<String, Integer>comparingByValue().reversed()
            .thenComparing(Map.Entry.comparingByKey()));

    System.out.println("Top 8:");
    for (Map.Entry<String, Integer> e : ordenadas.subList(0, Math.min(8, ordenadas.size()))) {
      System.out.printf("  %-16s %s%n", e.getKey(), "▮".repeat(e.getValue()) + " " + e.getValue());
    }

    // Bonus: agrupar palabras por su longitud, con computeIfAbsent
    Map<Integer, List<String>> porLongitud = new TreeMap<>();
    for (String palabra : distintas) {
      porLongitud.computeIfAbsent(palabra.length(), k -> new ArrayList<>()).add(palabra);
    }
    List<String> diezLetras = new ArrayList<>(porLongitud.getOrDefault(10, List.of()));
    java.util.Collections.sort(diezLetras);
    System.out.println("\nPalabras de 10 letras: " + diezLetras);
  }
}
