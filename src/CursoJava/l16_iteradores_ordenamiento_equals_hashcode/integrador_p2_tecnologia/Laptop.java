package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_tecnologia;

class Laptop extends Computadora implements Ventas {

  private static final double DEPRECIACION_ANUAL = 0.12;
  private static final double DESCUENTO = 0.15;

  public Laptop(String marca, int modelo, String numeroSerie, int horasUso) {
    super(marca, modelo, numeroSerie, horasUso);
  }

  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    double depreciacion = (anioActual - modelo) * DEPRECIACION_ANUAL;
    return precioBase * (1 - depreciacion) * (1 - DESCUENTO);
  }

  @Override
  public String getTipo() {
    return "Laptop";
  }
}
