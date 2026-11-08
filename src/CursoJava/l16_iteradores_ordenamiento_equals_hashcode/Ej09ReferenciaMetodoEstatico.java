package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.Arrays;
import java.util.List;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Reemplazar una lambda por una referencia a un método estático.
 * Concepto: 4. Comparator: todos los otros órdenes (lambdas y referencias a métodos).
 */
public class Ej09ReferenciaMetodoEstatico {

  static class Utilidades {
    static void mostrarEnMayusculas(String texto) {
      System.out.println(texto.toUpperCase());
    }
  }

  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("ana", "luis", "maría", "carlos", "sofia");

    // Versión con lambda.
    nombres.forEach(nombre -> Utilidades.mostrarEnMayusculas(nombre));

    // Versión con referencia a método: Clase::metodoEstatico.
    nombres.forEach(Utilidades::mostrarEnMayusculas);
  }
}
