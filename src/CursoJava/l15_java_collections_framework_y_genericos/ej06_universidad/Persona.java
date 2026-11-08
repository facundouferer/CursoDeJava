/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Definir los datos comunes de las personas de la universidad.
 * Concepto: Familia List: superclase de los elementos que se guardan en las listas del curso.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej06_universidad;

public abstract class Persona {
  private String nombre;
  private String apellido;
  private final String dni;

  protected Persona(String nombre, String apellido, String dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni;
  }
}
