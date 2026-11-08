package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_concesionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/** Consultas del concesionario: personas, autos y ventas. */
public class ConcesionarioDAO {

  public Persona obtenerPersona(int personaId) throws SQLException {
    String sql = "SELECT * FROM personas WHERE persona_id = ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setInt(1, personaId);
      try (ResultSet resultado = sentencia.executeQuery()) {
        return resultado.next() ? mapearPersona(resultado) : null;
      }
    }
  }

  public List<Persona> listarVendedores() throws SQLException {
    List<Persona> vendedores = new ArrayList<>();
    String sql = "SELECT * FROM personas";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      while (resultado.next()) {
        vendedores.add(mapearPersona(resultado));
      }
    }
    return vendedores;
  }

  public Auto obtenerAuto(int autoId) throws SQLException {
    String sql = "SELECT * FROM autos WHERE auto_id = ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setInt(1, autoId);
      try (ResultSet resultado = sentencia.executeQuery()) {
        return resultado.next() ? mapearAuto(resultado) : null;
      }
    }
  }

  public void generarInforme() throws SQLException {
    String sql = "SELECT * FROM autos";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      System.out.println("Informe de autos:");
      System.out.printf("%-10s%-20s%-20s%-5s%n", "AutoID", "Marca", "Modelo", "Año");
      System.out.println("---------------------------------------------");
      while (resultado.next()) {
        Auto auto = mapearAuto(resultado);
        System.out.printf("%-10d%-20s%-20s%-5d%n", auto.getAutoId(), auto.getMarca(),
            auto.getModelo(), auto.getAnio());
      }
      System.out.println("---------------------------------------------");
    }
  }

  /** Devuelve el auto con más unidades vendidas, o null si no hay ventas. */
  public Auto obtenerAutoMasVendido() throws SQLException {
    String sql = "SELECT auto_id, SUM(cantidad_vendida) AS total_vendido FROM ventas_autos "
        + "GROUP BY auto_id ORDER BY total_vendido DESC LIMIT 1";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      return resultado.next() ? obtenerAuto(resultado.getInt("auto_id")) : null;
    }
  }

  private Persona mapearPersona(ResultSet resultado) throws SQLException {
    return new Persona(resultado.getInt("persona_id"), resultado.getString("nombre"),
        resultado.getString("apellido"), resultado.getString("dni"),
        resultado.getDate("fecha_nacimiento"), resultado.getDate("fecha_contratacion"));
  }

  private Auto mapearAuto(ResultSet resultado) throws SQLException {
    return new Auto(resultado.getInt("auto_id"), resultado.getString("marca"),
        resultado.getString("modelo"), resultado.getInt("anio"));
  }
}
