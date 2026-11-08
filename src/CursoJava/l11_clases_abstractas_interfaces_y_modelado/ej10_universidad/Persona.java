package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class Persona implements Informe {
  private final String nombre;
  private final String apellido;
  private final int dni;

  public Persona(String nombre, String apellido, int dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  @Override
  public String generarInforme(String titulo) {
    return "\n" + titulo + "\n"
        + "Nombre: " + nombre + " " + apellido + "\n"
        + "DNI: " + dni;
  }
}
