package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_concesionario;

import java.sql.Date;

/** Persona que trabaja como vendedor en el concesionario. */
public class Persona {

  private final int personaId;
  private final String nombre;
  private final String apellido;
  private final String dni;
  private final Date fechaNacimiento;
  private final Date fechaContratacion;

  public Persona(int personaId, String nombre, String apellido, String dni,
      Date fechaNacimiento, Date fechaContratacion) {
    this.personaId = personaId;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.fechaNacimiento = fechaNacimiento;
    this.fechaContratacion = fechaContratacion;
  }

  @Override
  public String toString() {
    return "Persona{personaId=" + personaId + ", nombre='" + nombre + "', apellido='"
        + apellido + "', dni='" + dni + "', fechaNacimiento=" + fechaNacimiento
        + ", fechaContratacion=" + fechaContratacion + "}";
  }
}
