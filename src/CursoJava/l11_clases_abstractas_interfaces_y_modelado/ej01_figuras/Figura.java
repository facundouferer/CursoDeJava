package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej01_figuras;

/** Molde incompleto: guarda el color y obliga a las subclases a calcular el área y describirse. */
public abstract class Figura {
  protected final String color;

  protected Figura(String color) {
    this.color = color;
  }

  public abstract double calcularArea();

  public abstract String mostrarInformacion();

  public String getColor() {
    return color;
  }
}
