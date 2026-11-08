/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Verificar si todos o alguno de los elementos de una lista cumplen una condición.
 * Concepto: Lambdas sobre colecciones: allMatch (todos cumplen) y anyMatch (al menos uno cumple).
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.List;

public class Ej15AllMatchYAnyMatch {

  private record Persona(String nombre, int edad) {
  }

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3);

    boolean todosMayoresQueUno = numeros.stream().allMatch(numero -> numero > 1);
    System.out.println(todosMayoresQueUno
        ? "Todos los números son mayores que 1"
        : "No todos los números son mayores que 1");

    boolean hayMenorQueTres = numeros.stream().anyMatch(numero -> numero < 3);
    System.out.println(hayMenorQueTres
        ? "Hay por lo menos un número menor que 3"
        : "No hay números menores que 3");

    List<Persona> personas = List.of(
        new Persona("Ana", 15),
        new Persona("Luis", 22),
        new Persona("María", 19),
        new Persona("Pedro", 17));

    boolean hayMenores = personas.stream().anyMatch(persona -> persona.edad() < 18);
    System.out.println("\n¿Hay menores de edad? " + hayMenores);

    boolean todosAdultos = personas.stream().allMatch(persona -> persona.edad() >= 18);
    System.out.println("¿Son todos mayores de edad? " + todosAdultos);

    List<Integer> edades = List.of(18, 25, 30, 40);
    System.out.println("¿Todos los clientes son adultos? " + edades.stream().allMatch(edad -> edad >= 18));

    List<Integer> edadesVisitantes = List.of(12, 17, 22, 30);
    System.out.println("¿Hay algún adulto entre los visitantes? "
        + edadesVisitantes.stream().anyMatch(edad -> edad >= 18));
  }
}
