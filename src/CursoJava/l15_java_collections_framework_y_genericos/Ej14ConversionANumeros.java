/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Convertir una lista de textos numéricos en listas de enteros y de decimales.
 * Concepto: Lambdas sobre colecciones: mapToInt y mapToDouble sobre un Stream<String>.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.List;

public class Ej14ConversionANumeros {

  public static void main(String[] args) {
    List<String> textos = List.of("1", "7", "3");

    List<Integer> enteros = textos.stream()
        .mapToInt(Integer::parseInt)
        .boxed() // IntStream -> Stream<Integer>
        .toList();
    System.out.println("Enteros: " + enteros);

    List<Double> decimales = textos.stream()
        .mapToDouble(Double::parseDouble)
        .boxed() // DoubleStream -> Stream<Double>
        .toList();
    System.out.println("Decimales: " + decimales);
  }
}
