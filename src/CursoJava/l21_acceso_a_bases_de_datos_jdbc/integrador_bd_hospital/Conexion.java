package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Datos de conexión a la base hospital_db y apertura de conexiones. */
public final class Conexion {

  private static final String URL = "jdbc:mysql://localhost:3306/hospital_db";
  private static final String USUARIO = "root";
  private static final String CLAVE = "";

  private Conexion() {
  }

  /** Abre una conexión nueva; quien la recibe debe cerrarla (try-with-resources). */
  public static Connection abrir() throws SQLException {
    return DriverManager.getConnection(URL, USUARIO, CLAVE);
  }
}
