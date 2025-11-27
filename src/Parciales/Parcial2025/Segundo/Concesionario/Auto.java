package Parciales.Parcial2025.Segundo.Concesionario;

class Auto extends Vehiculo implements Ventas {
  private int cantPuertas;

  public Auto(String marca, int modelo, String patente, int kilometraje, int cantPuertas)
      throws PuertasInsuficientesException {
    super(marca, modelo, patente, kilometraje);

    // Validar que el auto tenga al menos 3 puertas
    if (cantPuertas < 3) {
      throw new PuertasInsuficientesException(
          "Error: Un auto debe tener al menos 3 puertas. Puertas recibidas: " + cantPuertas);
    }

    this.cantPuertas = cantPuertas;
  }

  // Getter
  public int getCantPuertas() {
    return cantPuertas;
  }

  // Implementación de la interface Ventas
  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    // Calcular depreciación por años
    int aniosDeUso = anioActual - this.modelo;
    double depreciacion = aniosDeUso * 0.05; // 5% por año

    // Calcular porcentaje adicional según cantidad de puertas
    double porcentajePuertas;
    if (cantPuertas == 3) {
      porcentajePuertas = 0.3;
    } else if (cantPuertas == 4) {
      porcentajePuertas = 0.4;
    } else {
      porcentajePuertas = 0.35; // Valor por defecto para otros casos
    }

    // Calcular precio final
    double precioConDepreciacion = precioBase * (1 - depreciacion);
    return precioConDepreciacion * (1 + porcentajePuertas);
  }

  // Setter
  public void setCantPuertas(int cantPuertas) throws PuertasInsuficientesException {
    // Validar que el auto tenga al menos 3 puertas
    if (cantPuertas < 3) {
      throw new PuertasInsuficientesException(
          "Error: Un auto debe tener al menos 3 puertas. Puertas recibidas: " + cantPuertas);
    }
    this.cantPuertas = cantPuertas;
  }

  // Implementación del método abstracto
  @Override
  public String verTipoDeVehiculo() {
    return "🚗";
  }

  // Método toString
  @Override
  public String toString() {
    return marca + "\t" + modelo + "\t" + patente + "\t" + kilometraje + "Km\t" + cantPuertas
        + " puertas";
  }
}