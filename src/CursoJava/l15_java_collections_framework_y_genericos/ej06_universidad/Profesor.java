/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Representar a un profesor con su sueldo.
 * Concepto: Familia List: colaborador del curso, que guarda una lista de estudiantes.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej06_universidad;

public class Profesor extends Persona {
  private final double montoSueldo;

  public Profesor(String nombre, String apellido, String dni, double montoSueldo) {
    super(nombre, apellido, dni);
    this.montoSueldo = montoSueldo;
  }

  public double getMontoSueldo() {
    return montoSueldo;
  }

  @Override
  public String toString() {
    return super.toString() + ", Sueldo: " + montoSueldo;
  }
}
