package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej03_pizzeria;

import java.sql.SQLException;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Agregar un producto al menú de la pizzería y mostrar el listado actualizado.
 * Concepto: 6. El patrón DAO.
 */
public class Main {

  public static void main(String[] args) {
    ProductoDAO dao = new ProductoDAO();
    try {
      int filas = dao.agregar("Tropical", 2500.0, 200);
      System.out.println("Número de filas afectadas: " + filas);

      for (Producto p : dao.listar()) {
        System.out.println(p.id() + "\t" + p.nombre() + "\t" + p.precio() + "\t" + p.stock());
      }
    } catch (SQLException e) {
      System.out.println("Error al acceder a la base de datos: " + e.getMessage());
    }
  }
}
