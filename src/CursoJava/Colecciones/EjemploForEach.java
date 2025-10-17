package CursoJava.Colecciones;

import java.util.*;

/**
 * Ejecuta una acción sobre cada elemento de la colección.
 * Equivale a un for, pero más limpio.
 */

class Auto {
  String marca;
  int anio;

  Auto(String marca, int anio) {
    this.marca = marca;
    this.anio = anio;
  }

  @Override
  public String toString() {
    return marca + " - " + anio;
  }

  public String verAnio() {
    return marca + " - " + (2025 - anio);
  }

}

class EjemploForEach {
  public static void main(String[] args) {
    List<Auto> autos = Arrays.asList(
        new Auto("Ford", 2015),
        new Auto("Chevrolet", 2018),
        new Auto("Toyota", 2020));

    // Versión con lambda:
    System.out.println("\nVersión con lambda:");
    autos.forEach(auto -> System.out.println(auto.marca + " " + (2025 - auto.anio)));

    // Método de referencia:
    System.out.println("\nMétodo de referencia:");
    autos.forEach(System.out::println);

    // Método con lambda:
    System.out.println("\nMétodo con lambda:");
    autos.forEach(auto -> System.out.println(auto.verAnio()));

  }
}
