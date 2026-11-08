package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_concesionario;

class Auto extends Vehiculo implements Ventas {

  private static final int MINIMO_PUERTAS = 3;
  private static final double DEPRECIACION_ANUAL = 0.05;

  private int cantPuertas;

  public Auto(String marca, int modelo, String patente, int kilometraje, int cantPuertas)
      throws PuertasInsuficientesException {
    super(marca, modelo, patente, kilometraje);
    validarPuertas(cantPuertas);
    this.cantPuertas = cantPuertas;
  }

  public int getCantPuertas() {
    return cantPuertas;
  }

  public void setCantPuertas(int cantPuertas) throws PuertasInsuficientesException {
    validarPuertas(cantPuertas);
    this.cantPuertas = cantPuertas;
  }

  private static void validarPuertas(int cantPuertas) throws PuertasInsuficientesException {
    if (cantPuertas < MINIMO_PUERTAS) {
      throw new PuertasInsuficientesException(
          "Un auto debe tener al menos " + MINIMO_PUERTAS + " puertas. Puertas recibidas: "
              + cantPuertas);
    }
  }

  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    double depreciacion = (anioActual - modelo) * DEPRECIACION_ANUAL;
    double adicionalPorPuertas;
    if (cantPuertas == 3) {
      adicionalPorPuertas = 0.3;
    } else if (cantPuertas == 4) {
      adicionalPorPuertas = 0.4;
    } else {
      adicionalPorPuertas = 0.35;
    }
    return precioBase * (1 - depreciacion) * (1 + adicionalPorPuertas);
  }

  @Override
  public String getTipo() {
    return "Auto";
  }

  @Override
  public String toString() {
    return super.toString() + "\t" + cantPuertas + " puertas";
  }
}
