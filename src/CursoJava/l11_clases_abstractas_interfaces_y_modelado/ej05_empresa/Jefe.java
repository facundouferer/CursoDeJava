package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej05_empresa;

public class Jefe extends Empleado implements ParaJefes {
  @Override
  public String tomarDecisiones(String decision) {
    return "Decisión aprobada por el jefe: " + decision;
  }

  // Método estático propio de la clase, independiente del de la interfaz.
  public static String tomarDecisiones() {
    return "Decisión postergada hasta la próxima reunión de equipo.";
  }
}
