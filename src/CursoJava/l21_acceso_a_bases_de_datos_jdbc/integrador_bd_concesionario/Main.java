package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_concesionario;

import java.sql.Date;
import java.sql.SQLException;

/**
 * Integrador – Examen final: Concesionario (Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro)
 * Enunciado: Modelar autos, personas y ventas de un concesionario y consultarlos en una base MySQL:
 * obtener una persona por ID, informe de autos, auto por ID, auto más vendido y listado de vendedores.
 * Concepto: 2. PreparedStatement, 3. Recorrer resultados y modificar datos, 6. El patrón DAO.
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Modelos:");
    System.out.println(new Auto(1, "Toyota", "Corolla", 2022));
    System.out.println(new Persona(1, "Juan", "Perez", "12345678", Date.valueOf("1990-01-15"),
        Date.valueOf("2021-03-01")));
    System.out.println(new VentaAuto(1, 1, 1, 1, Date.valueOf("2021-10-01")));

    ConcesionarioDAO dao = new ConcesionarioDAO();
    try {
      System.out.println("\nPersona 2:");
      System.out.println(dao.obtenerPersona(2));

      System.out.println();
      dao.generarInforme();

      System.out.println("\nAuto 1:");
      System.out.println(dao.obtenerAuto(1));

      System.out.println("\nAuto más vendido:");
      System.out.println(dao.obtenerAutoMasVendido());

      System.out.println("\nListado de vendedores:");
      for (Persona vendedor : dao.listarVendedores()) {
        System.out.println(vendedor);
      }
    } catch (SQLException e) {
      System.out.println("No se pudo consultar la base de datos: " + e.getMessage());
    }
  }
}
