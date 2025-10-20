package Practica.AdminUniversidad;

import java.util.Arrays;
import java.util.List;

import Practica.AdminUniversidad.modelos.Estudiante;
import Practica.AdminUniversidad.servicios.Registro;

class AppPrincipal {

  public static void main(String[] args) {
    System.out.println("SISTEMA DE ADMINISTRACIÓN DE UNIVERSIDAD");
    List<Estudiante> estudiantes = Arrays.asList(
        new Estudiante("Ana Perez", "TUP"),
        new Estudiante("Luis Gomez", "TUP"),
        new Estudiante("Maria Lopez", "TUP"));

    Registro registro = new Registro();
    registro.listarEstudiantes(estudiantes);
  }

}
