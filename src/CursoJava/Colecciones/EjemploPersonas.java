package CursoJava.Colecciones;

import java.util.*;
import java.util.stream.*;

/**
 * Ejemplo que combina varias operaciones con colecciones y streams en Java.
 * 
 * 1️⃣ Mostrar todos los elementos con forEach.
 * 2️⃣ Filtrar y crear una lista de mayores de edad.
 * 3️⃣ Verificar si hay algún menor de edad con anyMatch.
 * 4️⃣ Verificar si todos son adultos con allMatch.
 */

class Persona {
  String nombre;
  int edad;

  Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  @Override
  public String toString() {
    return nombre + " (" + edad + ")";
  }
}

class EjemploPersonas {
  public static void main(String[] args) {
    List<Persona> personas = Arrays.asList(
        new Persona("Ana", 15),
        new Persona("Luis", 22),
        new Persona("María", 19),
        new Persona("Pedro", 17));

    // 1️⃣ Mostrar todos con forEach
    personas.forEach(p -> System.out.println(p));

    // 2️⃣ Crear una lista de mayores de edad
    List<Persona> mayores = personas.stream()
        .filter(p -> p.edad >= 18)
        .toList();

    System.out.println("\nMayores de edad:");
    mayores.forEach(p -> System.out.println(p.nombre));

    // 3️⃣ Ver si hay menores
    boolean hayMenores = personas.stream()
        .anyMatch(p -> p.edad < 18);

    System.out.println("\n¿Hay menores? " + hayMenores);

    // 4️⃣ Ver si todos son adultos
    boolean todosAdultos = personas.stream()
        .allMatch(p -> p.edad >= 18);

    System.out.println("¿Todos adultos? " + todosAdultos);
  }
}
