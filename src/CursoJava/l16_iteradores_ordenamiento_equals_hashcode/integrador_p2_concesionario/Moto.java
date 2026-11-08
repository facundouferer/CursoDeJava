package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_concesionario;

class Moto extends Vehiculo implements Ventas {

  private static final double DEPRECIACION_ANUAL = 0.08;
  private static final double DESCUENTO = 0.1;

  public Moto(String marca, int modelo, String patente, int kilometraje) {
    super(marca, modelo, patente, kilometraje);
  }

  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    double depreciacion = (anioActual - modelo) * DEPRECIACION_ANUAL;
    return precioBase * (1 - depreciacion) * (1 - DESCUENTO);
  }

  @Override
  public String getTipo() {
    return "Moto";
  }
}
