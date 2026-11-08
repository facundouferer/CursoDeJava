package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.Arrays;
import java.util.List;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Listar personas y filtrar las mayores de edad con un Stream y una lambda.
 * Concepto: 4. Comparator: todos los otros órdenes (interfaz funcional y lambdas).
 */
public class Ej08FiltradoDePersonas {
  private static final int ANIO_ACTUAL = 2025;
  private static final int MAYORIA_DE_EDAD = 18;

  static class Persona {
    private final String nombre;
    private final int anioNacimiento;

    Persona(String nombre, int anioNacimiento) {
      this.nombre = nombre;
      this.anioNacimiento = anioNacimiento;
    }

    int getAnioNacimiento() {
      return anioNacimiento;
    }

    @Override
    public String toString() {
      return "- " + nombre + " (" + anioNacimiento + ")";
    }
  }

  public static void main(String[] args) {
    List<Persona> personas = Arrays.asList(
        new Persona("Ana", 2010),
        new Persona("Carlos", 2000),
        new Persona("María", 1995),
        new Persona("Pedro", 2008),
        new Persona("Laura", 1990),
        new Persona("Juan", 2005),
        new Persona("Sofía", 2012));

    System.out.println("=== PERSONAS ===");
    personas.forEach(System.out::println);

    List<Persona> mayores = personas.stream()
        .filter(persona -> ANIO_ACTUAL - persona.getAnioNacimiento() >= MAYORIA_DE_EDAD)
        .toList();

    System.out.println("\n=== MAYORES DE 18 AÑOS ===");
    mayores.forEach(System.out::println);

    System.out.println("\nTotal de personas mayores de edad: " + mayores.size());
  }
}
