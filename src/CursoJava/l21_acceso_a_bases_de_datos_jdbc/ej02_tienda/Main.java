package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej02_tienda;

import java.sql.SQLException;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Mostrar las prendas de talle XXL disponibles en la tienda.
 * Concepto: 2. Statement vs PreparedStatement: la vulnerabilidad más famosa del mundo.
 */
public class Main {

  public static void main(String[] args) {
    RopaDAO dao = new RopaDAO();
    try {
      for (String nombre : dao.nombresPorTalle("XXL")) {
        System.out.println(nombre);
      }
    } catch (SQLException e) {
      System.out.println("Error al acceder a la base de datos: " + e.getMessage());
    }
  }
}
