package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class Jefe extends Empleado {
  private final String departamento;
  private final Empleado[] empleados = new Empleado[10];
  private int cantidad = 0;

  public Jefe(String nombre, String apellido, int dni, double sueldo, String departamento) {
    super(nombre, apellido, dni, sueldo);
    this.departamento = departamento;
  }

  // Asociación: el jefe conoce a empleados que existen por su cuenta.
  public void agregarEmpleado(Empleado empleado) {
    if (cantidad == empleados.length) {
      System.out.println("El departamento " + departamento + " no admite más empleados a cargo.");
      return;
    }
    empleados[cantidad++] = empleado;
  }

  @Override
  public String generarInforme(String titulo) {
    StringBuilder informe = new StringBuilder(super.generarInforme(titulo));
    informe.append("\nDepartamento: ").append(departamento);
    informe.append("\nEmpleados a cargo: ").append(cantidad);
    for (int i = 0; i < cantidad; i++) {
      informe.append(empleados[i].generarInforme("Empleado a cargo"));
    }
    return informe.toString();
  }
}
