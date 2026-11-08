package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class NoDocente extends Empleado {
  private final String area;

  public NoDocente(String nombre, String apellido, int dni, double sueldo, String area) {
    super(nombre, apellido, dni, sueldo);
    this.area = area;
  }

  @Override
  public String generarInforme(String titulo) {
    return super.generarInforme(titulo) + "\nÁrea: " + area;
  }
}
