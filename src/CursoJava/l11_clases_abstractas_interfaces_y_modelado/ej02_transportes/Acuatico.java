package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej02_transportes;

public class Acuatico extends Vehiculo {
  private final String tipoCasco;

  public Acuatico(double hp, int stock, double precio, String tipoCasco) {
    super(hp, stock, precio);
    this.tipoCasco = tipoCasco;
  }

  @Override
  public String verCaracteristicas() {
    return "Tipo de casco: " + tipoCasco;
  }
}
