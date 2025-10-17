package CursoJava.Colecciones;

import java.util.*;

/**
 * anyMatch() verifica si algún elemento cumple una condición.
 * Devuelve true si al menos uno la cumple, false si ninguno.
 */

class EjemploAnyMatch {
  public static void main(String[] args) {
    List<Integer> edades = Arrays.asList(12, 17, 22, 30);

    boolean hayAdultos = edades.stream()
        .anyMatch(edad -> edad >= 18);

    System.out.println("¿Hay algún adulto? " + hayAdultos);
  }
}
