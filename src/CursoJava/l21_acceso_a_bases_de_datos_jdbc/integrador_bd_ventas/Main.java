package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_ventas;

import java.sql.Date;
import java.sql.SQLException;

/**
 * Integrador – Examen final: Sistema de ventas (Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro)
 * Enunciado: Modelar productos y vendedores y consultarlos en una base MySQL: obtener un vendedor
 * por ID, informe de productos en stock con su valor total, producto por ID, producto más vendido
 * y listado de vendedores.
 * Concepto: 2. PreparedStatement, 3. Recorrer resultados y modificar datos, 6. El patrón DAO.
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Modelos:");
    System.out.println(new Producto(1, "Producto 1", 10, 100));
    System.out.println(new Vendedor(1, "Vendedor 1", "Apellido 1", "12345678A",
        Date.valueOf("1990-01-01"), Date.valueOf("2010-01-01")));

    VentasDAO dao = new VentasDAO();
    try {
      System.out.println("\nVendedor 2:");
      System.out.println(dao.obtenerVendedor(2));

      System.out.println();
      dao.generarInforme();

      System.out.println("\nProducto 1:");
      System.out.println(dao.obtenerProducto(1));

      System.out.println("\nProducto más vendido:");
      System.out.println(dao.obtenerProductoMasVendido());

      System.out.println("\nListado de vendedores:");
      for (Vendedor vendedor : dao.listarVendedores()) {
        System.out.println(vendedor);
      }
    } catch (SQLException e) {
      System.out.println("No se pudo consultar la base de datos: " + e.getMessage());
    }
  }
}
