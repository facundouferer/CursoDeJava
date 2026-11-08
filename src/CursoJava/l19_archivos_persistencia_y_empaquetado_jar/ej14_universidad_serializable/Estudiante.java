package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej14_universidad_serializable;

import java.io.Serializable;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Representar a un estudiante de la universidad como objeto serializable.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Estudiante implements Serializable {

  private static final long serialVersionUID = 1L;

  private String nombre;
  private final int legajo;

  public Estudiante(String nombre, int legajo) {
    this.nombre = nombre;
    this.legajo = legajo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getLegajo() {
    return legajo;
  }

  @Override
  public String toString() {
    return "Estudiante{nombre='" + nombre + "', legajo=" + legajo + "}";
  }
}
