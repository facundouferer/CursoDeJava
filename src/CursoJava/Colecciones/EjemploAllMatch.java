package CursoJava.Colecciones;

import java.util.*;
import java.util.stream.*;

/**
 * allMatch() verifica si todos los elementos cumplen una condición.
 * Devuelve true si todos la cumplen, false si alguno no.
 * Por ejemplo, verificar si todos son adultos (edad >= 18).
 */

class EjemploAllMatch {
  public static void main(String[] args) {
    List<Integer> edades = Arrays.asList(18, 25, 30, 40);

    boolean todosAdultos = edades.stream()
        .allMatch(edad -> edad >= 18);

    System.out.println("¿Todos son adultos? " + todosAdultos);
  }
}
