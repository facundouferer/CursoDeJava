package Practica.UTN;

import Practica.UTN.modelos.Estudiante;
import Practica.UTN.servicios.Administracion;
import java.util.List;

class Principal {
  public static void main(String[] args) {
    System.out.println("Listado de Estudiantes");
    List<Estudiante> estudiantes = List.of(
        new Estudiante("Ana Gomez", 12345678, "ISI"),
        new Estudiante("Luis Perez", 87654321, "IQ"),
        new Estudiante("Maria Lopez", 11223344, "TUP"),
        new Estudiante("Carlos Sanchez", 44332211, "LAR"));

    Administracion admin = new Administracion();
    admin.listarEstudiantes(estudiantes);
  }
}
