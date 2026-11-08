/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Listar los estudiantes inscriptos de la universidad.
 * Concepto: Paquetes como namespaces: import, nombre completo (FQCN) y clases package-private.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej09_namespaces;

import java.util.List;

import CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej09_namespaces.modelos.Estudiante;
import CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej09_namespaces.servicios.Registro;

public class Main {
  public static void main(String[] args) {
    System.out.println("SISTEMA DE ADMINISTRACIÓN DE UNIVERSIDAD");
    List<Estudiante> estudiantes = List.of(
        new Estudiante("Ana Gomez", 12345678, "ISI"),
        new Estudiante("Luis Perez", 87654321, "IQ"),
        new Estudiante("Maria Lopez", 11223344, "TUP"),
        new Estudiante("Carlos Sanchez", 44332211, "LAR"));

    new Registro().listarEstudiantes(estudiantes);

    // La identidad de la clase para la JVM es su nombre completo (FQCN).
    System.out.println("Clase de los registros: " + estudiantes.get(0).getClass().getName());
  }
}
