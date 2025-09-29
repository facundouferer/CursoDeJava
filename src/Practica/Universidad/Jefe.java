package Practica.Universidad;

public class Jefe extends Empleado implements Informe {
  private String departamento;
  private Empleado[] empleados;

  public Jefe(String nombre, String apellido, int DNI, double sueldo, String departamento) {
    super(nombre, apellido, DNI, sueldo);
    this.departamento = departamento;
    this.empleados = new Empleado[10];
  }

  public void agregarEmpleado(Empleado e) {
    for (int i = 0; i < empleados.length; i++) {
      if (empleados[i] == null) {
        empleados[i] = e;
        break;
      }
    }
  }

  @Override
  public String generarInforme(String titulo) {
    return "Informe";
  }

}
