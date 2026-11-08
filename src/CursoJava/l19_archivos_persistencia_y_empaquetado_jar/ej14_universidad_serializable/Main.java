package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej14_universidad_serializable;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Serializar un curso con sus estudiantes y mostrar el curso recuperado.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Main {

  public static void main(String[] args) {
    Curso curso = new Curso("Programación 1");
    curso.agregarEstudiante(new Estudiante("Juan", 123));
    curso.agregarEstudiante(new Estudiante("Pedro", 456));
    curso.agregarEstudiante(new Estudiante("María", 789));
    curso.agregarEstudiante(new Estudiante("José", 101112));

    Serializador serializador = new Serializador(Path.of("curso.ser"));
    try {
      serializador.serializar(curso);
      Curso recuperado = serializador.deserializar();
      System.out.println("Curso: " + recuperado.getNombre());
      System.out.println(recuperado.getEstudiantes());
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("No se pudo completar la operación: " + e.getMessage());
    }
  }
}
