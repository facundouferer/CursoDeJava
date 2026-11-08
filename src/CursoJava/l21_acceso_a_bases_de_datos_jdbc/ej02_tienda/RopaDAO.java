package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej02_tienda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Consultar las prendas de la tienda por talle.
 * Concepto: 6. El patrón DAO.
 */
public class RopaDAO {

  /** Devuelve los nombres de las prendas del talle indicado. */
  public List<String> nombresPorTalle(String talle) throws SQLException {
    List<String> nombres = new ArrayList<>();
    String sql = "SELECT nombre FROM ropas WHERE talle = ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setString(1, talle);
      try (ResultSet resultado = sentencia.executeQuery()) {
        while (resultado.next()) {
          nombres.add(resultado.getString("nombre"));
        }
      }
    }
    return nombres;
  }
}
