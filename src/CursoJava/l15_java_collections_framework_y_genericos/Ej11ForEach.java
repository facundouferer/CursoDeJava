/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Recorrer listas de números, autos y estudiantes ejecutando una acción sobre cada elemento.
 * Concepto: Lambdas sobre colecciones: forEach con expresión lambda y con referencia a método.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.List;

public class Ej11ForEach {

  private static final int ANIO_ACTUAL = 2025;

  private record Auto(String marca, int anio) {
    String descripcionConAntiguedad() {
      return marca + " - " + (ANIO_ACTUAL - anio) + " años";
    }

    @Override
    public String toString() {
      return marca + " - " + anio;
    }
  }

  private record Estudiante(String nombre, int edad) {
    @Override
    public String toString() {
      return nombre + " (" + edad + ")";
    }
  }

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3, 4);

    System.out.println("Números:");
    numeros.forEach(numero -> System.out.println(numero));

    System.out.println("\nSuma de cada número consigo mismo:");
    numeros.forEach(numero -> System.out.println(numero + " + " + numero + " = " + (numero + numero)));

    List<Auto> autos = List.of(
        new Auto("Ford", 2015),
        new Auto("Chevrolet", 2018),
        new Auto("Toyota", 2020));

    System.out.println("\nAntigüedad de cada auto (lambda):");
    autos.forEach(auto -> System.out.println(auto.marca() + " " + (ANIO_ACTUAL - auto.anio())));

    System.out.println("\nListado de autos (referencia a método):");
    autos.forEach(System.out::println);

    System.out.println("\nAntigüedad de cada auto (método del objeto):");
    autos.forEach(auto -> System.out.println(auto.descripcionConAntiguedad()));

    List<Estudiante> estudiantes = List.of(
        new Estudiante("Ana", 15),
        new Estudiante("Luis", 22),
        new Estudiante("María", 19),
        new Estudiante("Pedro", 17));

    System.out.println("\nEstudiantes inscriptos:");
    estudiantes.forEach(System.out::println);
  }
}
