/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Gestionar el profesor y la lista de estudiantes de un curso.
 * Concepto: Familia List: List<Estudiante> con alta, edición y baja por DNI.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej06_universidad;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private final List<Estudiante> estudiantes = new ArrayList<>();
  private Profesor profesor;

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

  public void agregarEstudiante(Estudiante estudiante) {
    estudiantes.add(estudiante);
  }

  /** Quita al estudiante con ese DNI; devuelve false si no estaba inscripto. */
  public boolean eliminarEstudiante(String dni) {
    return estudiantes.removeIf(estudiante -> estudiante.getDni().equals(dni));
  }

  /** Modifica los datos del estudiante con ese DNI; devuelve false si no estaba inscripto. */
  public boolean editarEstudiante(String dni, String nuevoNombre, String nuevoApellido, String nuevoLegajo) {
    for (Estudiante estudiante : estudiantes) {
      if (estudiante.getDni().equals(dni)) {
        estudiante.setNombre(nuevoNombre);
        estudiante.setApellido(nuevoApellido);
        estudiante.setLegajo(nuevoLegajo);
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder detalle = new StringBuilder();
    detalle.append("Profesor: ").append(profesor != null ? profesor : "sin asignar").append("\nEstudiantes:\n");
    for (Estudiante estudiante : estudiantes) {
      detalle.append(estudiante).append("\n");
    }
    return detalle.toString();
  }
}
