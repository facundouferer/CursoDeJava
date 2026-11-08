package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_tecnologia;

class Escritorio extends Computadora implements Ventas {

  private static final int MINIMO_PUERTOS = 5;
  private static final double DEPRECIACION_ANUAL = 0.06;

  private int cantPuertos;

  public Escritorio(String marca, int modelo, String numeroSerie, int horasUso, int cantPuertos)
      throws PuertosInsuficientesException {
    super(marca, modelo, numeroSerie, horasUso);
    validarPuertos(cantPuertos);
    this.cantPuertos = cantPuertos;
  }

  public int getCantPuertos() {
    return cantPuertos;
  }

  public void setCantPuertos(int cantPuertos) throws PuertosInsuficientesException {
    validarPuertos(cantPuertos);
    this.cantPuertos = cantPuertos;
  }

  private static void validarPuertos(int cantPuertos) throws PuertosInsuficientesException {
    if (cantPuertos < MINIMO_PUERTOS) {
      throw new PuertosInsuficientesException(
          "Un escritorio debe tener al menos " + MINIMO_PUERTOS + " puertos. Puertos recibidos: "
              + cantPuertos);
    }
  }

  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    double depreciacion = (anioActual - modelo) * DEPRECIACION_ANUAL;
    double adicionalPorPuertos;
    if (cantPuertos <= 8) {
      adicionalPorPuertos = 0.25;
    } else {
      adicionalPorPuertos = 0.4;
    }
    return precioBase * (1 - depreciacion) * (1 + adicionalPorPuertos);
  }

  @Override
  public String getTipo() {
    return "Escritorio";
  }

  @Override
  public String toString() {
    return super.toString() + "\t" + cantPuertos + " puertos";
  }
}
