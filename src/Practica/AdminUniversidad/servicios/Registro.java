package Practica.AdminUniversidad.servicios;

import Practica.AdminUniversidad.modelos.Estudiante;
import java.util.List;

public class Registro {

  public void listarEstudiantes(List<Estudiante> estudiantes) {
    estudiantes.forEach(estudiante -> System.out
        .println("Estudiante: " + estudiante.getNombre() + ", Carrera: " + estudiante.getCarrera()));
  }

}