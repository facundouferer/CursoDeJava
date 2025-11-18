package Parciales.Parcial2025.Segundo.Tecnologia;

class Laptop extends Computadora implements Ventas {

  // Constructor con parámetros
  public Laptop(String marca, int modelo, String numeroSerie, int horasUso) {
    super(marca, modelo, numeroSerie, horasUso);
  }

  // Implementación del método abstracto
  @Override
  public String verTipoDeComputadora() {
    return "💻";
  }

  // Método toString
  @Override
  public String toString() {
    return marca + "'\\t" + modelo + "\\t" + numeroSerie + "\\t" + horasUso + "hrs";
  }
}