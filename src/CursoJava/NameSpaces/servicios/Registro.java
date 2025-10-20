package CursoJava.NameSpaces.servicios;

import java.util.List;

import CursoJava.NameSpaces.modelos.Estudiante;

public class Registro {

  public void listarEstudiantes(List<Estudiante> estudiantes) {
    estudiantes.forEach(estudiante -> System.out
        .println("Estudiante: " + estudiante.getNombre() + ", Carrera: " + estudiante.getCarrera()));
  }

}