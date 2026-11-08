package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej02_transportes;

public class Terrestre extends Vehiculo {
  private final int ruedas;

  public Terrestre(double hp, int stock, double precio, int ruedas) {
    super(hp, stock, precio);
    this.ruedas = ruedas;
  }

  @Override
  public String verCaracteristicas() {
    return "Ruedas: " + ruedas;
  }
}
