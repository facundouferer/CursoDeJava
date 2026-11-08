package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej01_empresa;

import java.sql.SQLException;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Registrar un empleado nuevo y mostrar el personal de la empresa.
 * Concepto: 6. El patrón DAO.
 */
public class Main {

  public static void main(String[] args) {
    EmpleadoDAO dao = new EmpleadoDAO();
    // Área 2 = Sistemas, según empresa.sql
    Empleado nuevo = new Empleado(35897456, "Pepe", "Grillo", 2);

    try {
      if (dao.agregar(nuevo)) {
        System.out.println("Empleado agregado exitosamente.");
        System.out.println("DNI: " + nuevo.dni());
        System.out.println("Nombre completo: " + nuevo.nombre() + " " + nuevo.apellido());
        System.out.println("Área ID: " + nuevo.area());
      } else {
        System.out.println("No se pudo agregar el empleado.");
      }

      System.out.println();
      for (Empleado empleado : dao.listar()) {
        System.out.println(empleado.dni() + " " + empleado.nombre() + " " + empleado.apellido());
      }
    } catch (SQLException e) {
      System.out.println("Error al acceder a la base de datos: " + e.getMessage());
    }
  }
}
