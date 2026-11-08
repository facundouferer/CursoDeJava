package CursoJava.l11_clases_abstractas_interfaces_y_modelado.integrador_p1_universidad;

public class Persona {
  private final String nombre;
  private final String apellido;
  private final int dni;

  public Persona(String nombre, String apellido, int dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  @Override
  public String toString() {
    return "- " + apellido + ", " + nombre + " (DNI: " + dni + ")";
  }
}
