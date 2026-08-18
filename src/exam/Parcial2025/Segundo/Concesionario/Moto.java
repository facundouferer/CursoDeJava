package exam.Parcial2025.Segundo.Concesionario;

class Moto extends Vehiculo implements Ventas {

  // Constructor con parámetros
  public Moto(String marca, int modelo, String patente, int kilometraje) {
    super(marca, modelo, patente, kilometraje);
  }

  // Implementación de la interface Ventas
  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    // Calcular depreciación por años (las motos se deprecian más rápido)
    int aniosDeUso = anioActual - this.modelo;
    double depreciacion = aniosDeUso * 0.08; // 8% por año para motos

    // Las motos no tienen porcentaje adicional por puertas
    // pero podrían tener un descuento por ser vehículo de dos ruedas
    double descuentoMoto = 0.1; // 10% de descuento

    // Calcular precio final
    double precioConDepreciacion = precioBase * (1 - depreciacion);
    return precioConDepreciacion * (1 - descuentoMoto);
  }

  // Implementación del método abstracto
  @Override
  public String verTipoDeVehiculo() {
    return "🏍️";
  }

  // Método toString
  @Override
  public String toString() {
    return marca + "'\t" + modelo + "\t" + patente + "\t" + kilometraje + "Km";
  }
}