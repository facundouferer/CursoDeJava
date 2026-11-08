/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Quedarse con los números pares de una lista y con las personas mayores de edad.
 * Concepto: Lambdas sobre colecciones: filter para seleccionar elementos de un Stream.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.List;

public class Ej12Filter {

  private record Persona(String nombre, int edad) {
    @Override
    public String toString() {
      return nombre + " (" + edad + ")";
    }
  }

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    List<Integer> pares = numeros.stream()
        .filter(numero -> numero % 2 == 0)
        .toList();
    System.out.println("Números pares: " + pares);

    List<Persona> personas = List.of(
        new Persona("Ana", 15),
        new Persona("Luis", 22),
        new Persona("María", 19),
        new Persona("Pedro", 17));

    List<Persona> mayores = personas.stream()
        .filter(persona -> persona.edad() >= 18)
        .toList();

    System.out.println("\nMayores de edad:");
    mayores.forEach(persona -> System.out.println(persona.nombre()));
  }
}
