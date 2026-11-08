package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej04_estudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Centralizar los datos de conexión a la base universidad y abrir conexiones.
 * Concepto: 1. La arquitectura: por qué hay una capa en el medio.
 */
public final class Conexion {

  // Datos de conexión: se modifican solo aquí.
  private static final String URL = "jdbc:mysql://localhost:3306/universidad";
  private static final String USUARIO = "root";
  private static final String CLAVE = "";

  private Conexion() {
  }

  /** Abre una conexión nueva; quien la recibe es responsable de cerrarla (try-with-resources). */
  public static Connection abrir() throws SQLException {
    return DriverManager.getConnection(URL, USUARIO, CLAVE);
  }
}
