package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.Arrays;
import java.util.List;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Convertir una lista de nombres a mayúsculas con una referencia a un método de instancia de tipo arbitrario.
 * Concepto: 4. Comparator: todos los otros órdenes (lambdas y referencias a métodos).
 */
public class Ej11ReferenciaMetodoArbitrario {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("ana", "luis", "maría");

    // Clase::metodoDeInstancia se aplica a cada elemento de la lista.
    List<String> nombresEnMayusculas = nombres.stream()
        .map(String::toUpperCase)
        .toList();

    System.out.println(nombresEnMayusculas);
  }
}
