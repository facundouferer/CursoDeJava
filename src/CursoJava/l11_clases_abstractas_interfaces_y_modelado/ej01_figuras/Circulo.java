package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej01_figuras;

public class Circulo extends Figura implements ConLados {
  private final double radio;

  public Circulo(String color, double radio) {
    super(color);
    this.radio = radio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * radio * radio;
  }

  @Override
  public String mostrarInformacion() {
    return "Círculo: " + color + " radio: " + radio;
  }

  @Override
  public int cantidadDeLados() {
    return 0;
  }
}
