package CursoJava.Colecciones;

import java.util.*;
import java.util.stream.*;

/**
 * map() transforma cada elemento en otro.
 * Por ejemplo: pasar todos los nombres a mayúsculas o duplicar números.
 */

class EjemploMap {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("ana", "luis", "maría");

    // Convierte cada nombre a mayúsculas
    List<String> nombresMayus = nombres.stream()
        .map(nombre -> nombre.toUpperCase())
        .toList();

    System.out.println(nombresMayus);
  }
}
