package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_hospital;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Integrador – Examen final: Hospital (Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro)
 * Enunciado: Modelar pacientes y doctores a partir de una clase abstracta Persona y gestionar los
 * pacientes en una base MySQL: alta, baja, asignación de doctor de cabecera y listados, incluido
 * el listado de ingresos entre dos fechas.
 * Concepto: 2. PreparedStatement, 3. Recorrer resultados y modificar datos, 6. El patrón DAO.
 */
public class Main {

  public static void main(String[] args) {
    PacienteDAO pacientes = new PacienteDAO();
    Date desde = Date.valueOf(LocalDate.of(2023, 1, 1));
    Date hasta = Date.valueOf(LocalDate.of(2023, 1, 10));
    try {
      pacientes.listarEntreFechas(desde, hasta);
    } catch (SQLException e) {
      System.out.println("No se pudo consultar la base de datos: " + e.getMessage());
    }
  }
}
