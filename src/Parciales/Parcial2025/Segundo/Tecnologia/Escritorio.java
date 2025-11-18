package Parciales.Parcial2025.Segundo.Tecnologia;

class Escritorio extends Computadora implements Ventas {
  private int cantidadPuertos;

  public Escritorio(String marca, int modelo, String numeroSerie, int horasUso, int cantidadPuertos)
      throws PuertosInsuficientesException {
    super(marca, modelo, numeroSerie, horasUso);

    // Validar que el escritorio tenga al menos 5 puertos
    if (cantidadPuertos < 5) {
      throw new PuertosInsuficientesException(
          "Error: Un escritorio debe tener al menos 5 puertos. Puertos recibidos: " + cantidadPuertos);
    }

    this.cantidadPuertos = cantidadPuertos;
  }

  // Getter
  public int getCantidadPuertos() {
    return cantidadPuertos;
  }

  // Setter
  public void setCantidadPuertos(int cantidadPuertos) throws PuertosInsuficientesException {
    // Validar que el escritorio tenga al menos 5 puertos
    if (cantidadPuertos < 5) {
      throw new PuertosInsuficientesException(
          "Error: Un escritorio debe tener al menos 5 puertos. Puertos recibidos: " + cantidadPuertos);
    }
    this.cantidadPuertos = cantidadPuertos;
  }

  // Implementación de la interface Ventas
  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    // Calcular depreciación por años (las computadoras de escritorio se deprecian
    // más lento)
    int aniosDeUso = anioActual - this.modelo;
    double depreciacion = aniosDeUso * 0.06; // 6% por año

    // Calcular porcentaje adicional según cantidad de puertos
    double porcentajePuertos;
    if (cantidadPuertos <= 4) {
      porcentajePuertos = 0.1; // 10% para pocos puertos
    } else if (cantidadPuertos <= 8) {
      porcentajePuertos = 0.25; // 25% para cantidad media
    } else {
      porcentajePuertos = 0.4; // 40% para muchos puertos (gaming/workstation)
    }

    // Calcular precio final
    double precioConDepreciacion = precioBase * (1 - depreciacion);
    return precioConDepreciacion * (1 + porcentajePuertos);
  }

  // Implementación del método abstracto
  @Override
  public String verTipoDeComputadora() {
    return "🖥️";
  }

  // Método toString
  @Override
  public String toString() {
    return marca + "\\t" + modelo + "\\t" + numeroSerie + "\\t" + horasUso + "hrs\\t" + cantidadPuertos
        + " puertos";
  }
}