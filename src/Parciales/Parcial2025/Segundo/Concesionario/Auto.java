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