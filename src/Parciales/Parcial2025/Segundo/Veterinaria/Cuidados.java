package Parciales.Parcial2025.Segundo.Veterinaria;

public interface Cuidados {

  /**
   * Calcula el costo de cuidado del animal basado en el costo base y la edad
   * actual
   * 
   */
  double calcularCostoCuidado(double costoBase, int edadAnimal);
}