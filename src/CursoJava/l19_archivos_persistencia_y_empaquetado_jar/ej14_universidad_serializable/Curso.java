package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej14_universidad_serializable;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Gestionar los estudiantes de un curso, de modo que el curso completo pueda guardarse.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Curso implements Serializable {

  private static final long serialVersionUID = 1L;

  private final String nombre;
  private final LinkedList<Estudiante> estudiantes = new LinkedList<>();

  public Curso(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public List<Estudiante> getEstudiantes() {
    return estudiantes;
  }

  public void agregarEstudiante(Estudiante estudiante) {
    estudiantes.add(estudiante);
  }

  public boolean eliminarEstudiantePorLegajo(int legajo) {
    return estudiantes.removeIf(estudiante -> estudiante.getLegajo() == legajo);
  }

  public boolean modificarEstudiante(String nuevoNombre, int legajo) {
    for (Estudiante estudiante : estudiantes) {
      if (estudiante.getLegajo() == legajo) {
        estudiante.setNombre(nuevoNombre);
        return true;
      }
    }
    return false;
  }
}
