package Parciales.Parcial2025.Segundo.Concesionario;

public interface Ventas {

  /**
   * Calcula el precio de venta del vehículo basado en el precio base y el año
   * actual
   * 
   */
  double calcularPrecioVenta(double precioBase, int anioActual);
}