package Parciales.Parcial2025.Segundo.Tecnologia;

public interface Ventas {

  /**
   * Calcula el precio de venta de la computadora basado en el precio base y el
   * año actual
   * 
   * @param precioBase El precio base de la computadora
   * @param anioActual El año actual para calcular la depreciación
   * @return El precio de venta calculado
   */
  double calcularPrecioVenta(double precioBase, int anioActual);
}