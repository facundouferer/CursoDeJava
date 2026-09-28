package CursoJava.ClasesAbstractas.FigurasAbstractas;

abstract class Figura {
  String color;

  public Figura(String color) {
    this.color = color;
  }

  abstract double calcularArea();

  abstract String mostrarInformacion();

  public String getColor() {
    return color;
  }

}
