package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class Empleado extends Persona {
  private final double sueldo;

  public Empleado(String nombre, String apellido, int dni, double sueldo) {
    super(nombre, apellido, dni);
    this.sueldo = sueldo;
  }

  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String generarInforme(String titulo) {
    return super.generarInforme(titulo) + "\nSueldo: " + sueldo;
  }
}
