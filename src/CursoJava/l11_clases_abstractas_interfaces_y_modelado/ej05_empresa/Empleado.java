package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej05_empresa;

public class Empleado extends Persona {
  @Override
  public void hablar() {
    System.out.println("Hola, soy empleado de la empresa.");
  }
}
