package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej04_estudiantes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Concentrar todo el acceso a la tabla estudiantes: consultas, alta, edición y baja.
 * Concepto: 6. El patrón DAO (con PreparedStatement en todas las consultas).
 */
public class EstudianteDAO {

  private static final String COLUMNAS =
      "id, nombre, apellido, legajo, dni, fecha_nacimiento, direccion, telefono, email";

  public List<Estudiante> listar() throws SQLException {
    return consultar("SELECT " + COLUMNAS + " FROM estudiantes");
  }

  public List<Estudiante> buscarPorNombre(String nombre) throws SQLException {
    return consultar("SELECT " + COLUMNAS + " FROM estudiantes WHERE nombre = ?", nombre);
  }

  /** Estudiantes cuya edad es al menos la indicada. La fecha límite se calcula en Java y viaja como parámetro. */
  public List<Estudiante> listarConEdadMinima(int edad) throws SQLException {
    Date fechaLimite = Date.valueOf(LocalDate.now().minusYears(edad));
    return consultar("SELECT " + COLUMNAS + " FROM estudiantes WHERE fecha_nacimiento <= ?", fechaLimite);
  }

  public boolean existe(int id) throws SQLException {
    return !consultar("SELECT " + COLUMNAS + " FROM estudiantes WHERE id = ?", id).isEmpty();
  }

  public boolean agregar(Estudiante e) throws SQLException {
    String sql = "INSERT INTO estudiantes (nombre, apellido, legajo, dni, fecha_nacimiento, direccion, telefono, email) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    return actualizar(sql, e.nombre(), e.apellido(), e.legajo(), e.dni(),
        e.fechaNacimiento(), e.direccion(), e.telefono(), e.email()) > 0;
  }

  public boolean editar(Estudiante e) throws SQLException {
    String sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, legajo = ?, dni = ?, "
        + "fecha_nacimiento = ?, direccion = ?, telefono = ?, email = ? WHERE id = ?";
    return actualizar(sql, e.nombre(), e.apellido(), e.legajo(), e.dni(),
        e.fechaNacimiento(), e.direccion(), e.telefono(), e.email(), e.id()) > 0;
  }

  public boolean eliminar(int id) throws SQLException {
    return actualizar("DELETE FROM estudiantes WHERE id = ?", id) > 0;
  }

  // Ejecuta una consulta parametrizada y convierte cada fila en un Estudiante.
  private List<Estudiante> consultar(String sql, Object... parametros) throws SQLException {
    List<Estudiante> estudiantes = new ArrayList<>();
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      asignar(sentencia, parametros);
      try (ResultSet resultado = sentencia.executeQuery()) {
        while (resultado.next()) {
          estudiantes.add(new Estudiante(
              resultado.getInt("id"),
              resultado.getString("nombre"),
              resultado.getString("apellido"),
              resultado.getString("legajo"),
              resultado.getString("dni"),
              resultado.getString("fecha_nacimiento"),
              resultado.getString("direccion"),
              resultado.getString("telefono"),
              resultado.getString("email")));
        }
      }
    }
    return estudiantes;
  }

  // Ejecuta INSERT, UPDATE o DELETE y devuelve la cantidad de filas afectadas.
  private int actualizar(String sql, Object... parametros) throws SQLException {
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      asignar(sentencia, parametros);
      return sentencia.executeUpdate();
    }
  }

  private void asignar(PreparedStatement sentencia, Object[] parametros) throws SQLException {
    for (int i = 0; i < parametros.length; i++) {
      sentencia.setObject(i + 1, parametros[i]);
    }
  }
}
