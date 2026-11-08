package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej01_empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Consultar y registrar el personal de la empresa sin mezclar SQL con el resto del programa.
 * Concepto: 6. El patrón DAO.
 */
public class EmpleadoDAO {

  /** Lista todo el personal. La consulta no tiene parámetros, por eso alcanza con un Statement. */
  public List<Empleado> listar() throws SQLException {
    List<Empleado> empleados = new ArrayList<>();
    String sql = "SELECT dni, nombre, apellido, area FROM personal";
    try (Connection conexion = Conexion.abrir();
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql)) {
      while (resultado.next()) {
        empleados.add(new Empleado(
            resultado.getInt("dni"),
            resultado.getString("nombre"),
            resultado.getString("apellido"),
            resultado.getInt("area")));
      }
    }
    return empleados;
  }

  /** Inserta un empleado con una consulta parametrizada; devuelve true si se agregó la fila. */
  public boolean agregar(Empleado empleado) throws SQLException {
    String sql = "INSERT INTO personal (dni, nombre, apellido, area) VALUES (?, ?, ?, ?)";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setInt(1, empleado.dni());
      sentencia.setString(2, empleado.nombre());
      sentencia.setString(3, empleado.apellido());
      sentencia.setInt(4, empleado.area());
      return sentencia.executeUpdate() > 0;
    }
  }
}
