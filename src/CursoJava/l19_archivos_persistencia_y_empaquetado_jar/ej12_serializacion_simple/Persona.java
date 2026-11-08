package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej12_serializacion_simple;

import java.io.Serializable;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Definir un objeto simple que puede guardarse en un archivo.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Persona implements Serializable {

  // Se declara a mano para que el formato guardado no cambie al modificar la clase.
  private static final long serialVersionUID = 1L;

  private final String nombre;
  private final int dni;

  public Persona(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  @Override
  public String toString() {
    return nombre + " (" + dni + ")";
  }
}
