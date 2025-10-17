package MetodosReferencia;

import java.util.*;

/** Podés usarlo para crear objetos dentro de Streams o colecciones. */

class Persona {
  String nombre;

  Persona(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Persona: " + nombre;
  }
}

class EjemploConstructorRef {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("Ana", "Luis", "María");

    // Versión lambda:
    List<Persona> personas1 = nombres.stream()
        .map(nombre -> new Persona(nombre))
        .toList();

    // Versión con método de referencia:
    List<Persona> personas2 = nombres.stream()
        .map(Persona::new)
        .toList();

    personas2.forEach(System.out::println);
  }
}
