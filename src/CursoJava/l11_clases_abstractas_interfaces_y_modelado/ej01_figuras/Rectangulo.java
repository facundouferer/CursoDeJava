package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej01_figuras;

public class Rectangulo extends Figura implements ConLados {
  private final double ancho;
  private final double alto;

  public Rectangulo(String color, double ancho, double alto) {
    super(color);
    this.ancho = ancho;
    this.alto = alto;
  }

  @Override
  public double calcularArea() {
    return ancho * alto;
  }

  @Override
  public String mostrarInformacion() {
    return "Rectángulo: " + color + " de " + ancho + " x " + alto;
  }

  @Override
  public int cantidadDeLados() {
    return 4;
  }
}
