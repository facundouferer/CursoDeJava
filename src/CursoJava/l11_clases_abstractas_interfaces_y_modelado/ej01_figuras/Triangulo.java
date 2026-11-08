package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej01_figuras;

public class Triangulo extends Figura implements ConLados {
  private final double base;
  private final double altura;

  public Triangulo(String color, double base, double altura) {
    super(color);
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double calcularArea() {
    return (base * altura) / 2;
  }

  @Override
  public String mostrarInformacion() {
    return "Triángulo: " + color + " de base " + base + " y altura " + altura;
  }

  @Override
  public int cantidadDeLados() {
    return 3;
  }
}
