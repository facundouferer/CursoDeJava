package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.Arrays;
import java.util.List;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Imprimir una lista usando una referencia a un método de un objeto concreto.
 * Concepto: 4. Comparator: todos los otros órdenes (lambdas y referencias a métodos).
 */
public class Ej10ReferenciaMetodoInstancia {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("Ana", "Luis", "María");

    // objeto::metodo, con System.out como objeto PrintStream.
    nombres.forEach(System.out::println);
  }
}
