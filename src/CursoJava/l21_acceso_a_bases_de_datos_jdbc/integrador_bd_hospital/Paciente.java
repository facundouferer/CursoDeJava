package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_hospital;

import java.sql.Date;

/** Paciente con su historial médico, doctor de cabecera y fecha de ingreso. */
public class Paciente extends Persona {

  private final String historialMedico;
  private final int doctorCabecera;
  private final Date fechaIngreso;

  public Paciente(String nombre, int edad, String historialMedico, int doctorCabecera,
      Date fechaIngreso) {
    super(nombre, edad);
    this.historialMedico = historialMedico;
    this.doctorCabecera = doctorCabecera;
    this.fechaIngreso = fechaIngreso;
  }

  public String getHistorialMedico() {
    return historialMedico;
  }

  public int getDoctorCabecera() {
    return doctorCabecera;
  }

  public Date getFechaIngreso() {
    return fechaIngreso;
  }
}
