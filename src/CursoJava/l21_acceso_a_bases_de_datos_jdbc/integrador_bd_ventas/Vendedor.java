package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_ventas;

import java.sql.Date;

/** Vendedor de la empresa. */
public class Vendedor {

  private final int vendedorId;
  private final String nombre;
  private final String apellido;
  private final String dni;
  private final Date fechaNacimiento;
  private final Date fechaContratacion;

  public Vendedor(int vendedorId, String nombre, String apellido, String dni,
      Date fechaNacimiento, Date fechaContratacion) {
    this.vendedorId = vendedorId;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.fechaNacimiento = fechaNacimiento;
    this.fechaContratacion = fechaContratacion;
  }

  @Override
  public String toString() {
    return "Vendedor{vendedorId=" + vendedorId + ", nombre='" + nombre + "', apellido='"
        + apellido + "', dni='" + dni + "', fechaNacimiento=" + fechaNacimiento
        + ", fechaContratacion=" + fechaContratacion + "}";
  }
}
