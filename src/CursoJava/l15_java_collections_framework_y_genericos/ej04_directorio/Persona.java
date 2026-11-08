/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Representar a una persona del directorio telefónico.
 * Concepto: Familia List: elemento almacenado en una List<Persona>.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej04_directorio;

public class Persona {
  private final String nombre;
  private final int dni;
  private final int telefono;

  public Persona(String nombre, int dni, int telefono) {
    this.nombre = nombre;
    this.dni = dni;
    this.telefono = telefono;
  }

  public String getNombre() {
    return nombre;
  }

  public int getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono;
  }
}
