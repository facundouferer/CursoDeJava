/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Representar a un estudiante con su legajo.
 * Concepto: Familia List: tipo del elemento de List<Estudiante>.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej06_universidad;

public class Estudiante extends Persona {
  private String legajo;

  public Estudiante(String nombre, String apellido, String dni, String legajo) {
    super(nombre, apellido, dni);
    this.legajo = legajo;
  }

  public String getLegajo() {
    return legajo;
  }

  public void setLegajo(String legajo) {
    this.legajo = legajo;
  }

  @Override
  public String toString() {
    return super.toString() + ", Legajo: " + legajo;
  }
}
