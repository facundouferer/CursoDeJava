package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.Arrays;
import java.util.List;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Crear objetos Persona a partir de nombres usando una referencia a constructor.
 * Concepto: 4. Comparator: todos los otros órdenes (lambdas y referencias a métodos).
 */
public class Ej12ReferenciaConstructor {

  static class Persona {
    private final String nombre;

    Persona(String nombre) {
      this.nombre = nombre;
    }

    @Override
    public String toString() {
      return "Persona: " + nombre;
    }
  }

  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("Ana", "Luis", "María");

    // Versión con lambda.
    List<Persona> conLambda = nombres.stream()
        .map(nombre -> new Persona(nombre))
        .toList();
    conLambda.forEach(System.out::println);

    // Versión con referencia a constructor: Clase::new.
    List<Persona> conReferencia = nombres.stream()
        .map(Persona::new)
        .toList();
    conReferencia.forEach(System.out::println);
  }
}
