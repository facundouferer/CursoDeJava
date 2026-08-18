package exam.Parcial2025.Segundo.Tecnologia;

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

  // Implementación de la interface Ventas
  @Override
  public double calcularPrecioVenta(double precioBase, int anioActual) {
    // Calcular depreciación por años (las laptops se deprecian más rápido que
    // escritorio)
    int aniosDeUso = anioActual - this.modelo;
    double depreciacion = aniosDeUso * 0.12; // 12% por año para laptops

    // Las laptops tienen un descuento adicional por su portabilidad limitada en el
    // tiempo
    double descuentoPortabilidad = 0.15; // 15% de descuento por desgaste de batería/pantalla

    // Calcular precio final
    double precioConDepreciacion = precioBase * (1 - depreciacion);
    return precioConDepreciacion * (1 - descuentoPortabilidad);
  }

  // Método toString
  @Override
  public String toString() {
    return marca + "'\\t" + modelo + "\\t" + numeroSerie + "\\t" + horasUso + "hrs";
  }
}