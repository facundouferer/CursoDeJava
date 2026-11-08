package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej09_namespaces.servicios;

import java.util.List;

import CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej09_namespaces.modelos.Estudiante;

public class Registro {
  public void listarEstudiantes(List<Estudiante> estudiantes) {
    for (Estudiante estudiante : estudiantes) {
      System.out.println("Estudiante: " + estudiante.getNombre()
          + ", DNI: " + estudiante.getDni()
          + ", Carrera: " + estudiante.getCarrera());
    }
  }
}
