package CursoJava.Colecciones;

import java.util.*;

/**
 * Una colección en Java es una estructura que guarda varios elementos, como una
 * lista (ArrayList), un conjunto (HashSet), o un mapa (HashMap).
 */

class Estudiante {
  String nombre;
  int edad;

  Estudiante(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  @Override
  public String toString() {
    return "\n" + nombre + " (" + edad + ")";
  }

}

class EjemploColeccion {
  public static void main(String[] args) {

    List<Estudiante> personas = Arrays.asList(
        new Estudiante("Ana", 15),
        new Estudiante("Luis", 22),
        new Estudiante("María", 19),
        new Estudiante("Pedro", 17));
    System.out.println(personas);
  }
}
