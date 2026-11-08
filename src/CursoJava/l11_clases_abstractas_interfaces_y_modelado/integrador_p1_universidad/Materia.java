package CursoJava.l11_clases_abstractas_interfaces_y_modelado.integrador_p1_universidad;

public class Materia {
  private final String nombre;

  public Materia(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "- " + nombre;
  }
}
