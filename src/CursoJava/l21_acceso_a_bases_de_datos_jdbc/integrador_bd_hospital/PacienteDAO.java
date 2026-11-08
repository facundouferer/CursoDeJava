package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_hospital;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Acceso a la tabla pacientes: altas, bajas, asignación de doctor y listados. */
public class PacienteDAO {

  public void agregar(Paciente paciente) throws SQLException {
    String sql = "INSERT INTO pacientes (nombre, edad, historial_medico, doctor, fecha_ingreso) "
        + "VALUES (?, ?, ?, ?, ?)";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setString(1, paciente.getNombre());
      sentencia.setInt(2, paciente.getEdad());
      sentencia.setString(3, paciente.getHistorialMedico());
      sentencia.setInt(4, paciente.getDoctorCabecera());
      sentencia.setDate(5, paciente.getFechaIngreso());
      sentencia.executeUpdate();
    }
  }

  public void eliminar(String nombre) throws SQLException {
    String sql = "DELETE FROM pacientes WHERE nombre = ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setString(1, nombre);
      sentencia.executeUpdate();
    }
  }

  public void asignarDoctorCabecera(String nombreDoctor, String nombrePaciente)
      throws SQLException {
    String sql = "UPDATE pacientes SET doctor = (SELECT id FROM doctores WHERE nombre = ?) "
        + "WHERE nombre = ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setString(1, nombreDoctor);
      sentencia.setString(2, nombrePaciente);
      sentencia.executeUpdate();
    }
  }

  public void listar() throws SQLException {
    String sql = "SELECT * FROM pacientes";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      imprimir(resultado);
    }
  }

  public void listarEntreFechas(Date desde, Date hasta) throws SQLException {
    String sql = "SELECT * FROM pacientes WHERE fecha_ingreso BETWEEN ? AND ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setDate(1, desde);
      sentencia.setDate(2, hasta);
      try (ResultSet resultado = sentencia.executeQuery()) {
        imprimir(resultado);
      }
    }
  }

  private void imprimir(ResultSet resultado) throws SQLException {
    System.out.println("Lista de pacientes:");
    System.out.printf("%-10s %-15s %-5s %-20s %-13s %-10s%n", "ID", "Nombre", "Edad",
        "Historial médico", "Fecha ingreso", "Doctor");
    while (resultado.next()) {
      System.out.printf("%-10d %-15s %-5d %-20s %-13s %-10d%n", resultado.getInt("id"),
          resultado.getString("nombre"), resultado.getInt("edad"),
          resultado.getString("historial_medico"), resultado.getDate("fecha_ingreso"),
          resultado.getInt("doctor"));
    }
  }
}
