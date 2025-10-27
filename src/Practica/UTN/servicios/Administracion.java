package Practica.UTN.servicios;

import java.util.List;
import Practica.UTN.modelos.Estudiante;

public class Administracion {

  public void listarEstudiantes(List<Estudiante> estudiantes) {
    for (Estudiante estudiante : estudiantes) {
      System.out.println(estudiante.toString());
    }
  }

}
