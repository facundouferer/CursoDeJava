package CursoJava.Colecciones;

import java.util.*;

/**
 * Ejecuta una acción sobre cada elemento de la colección.
 * Equivale a un for, pero más limpio.
 */

class EjemploForEach {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("Ana", "Luis", "María", "Pedro");

    // Recorre la lista y muestra cada nombre
    nombres.forEach(nombre -> System.out.println("Hola " + nombre));
  }
}
