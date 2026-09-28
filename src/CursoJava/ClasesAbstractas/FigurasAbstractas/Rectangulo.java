package CursoJava.ClasesAbstractas.FigurasAbstractas;

class Rectangulo extends Figura {
  double ancho, alto;

  public Rectangulo(String color, double ancho, double alto) {
    super(color);
    this.ancho = ancho;
    this.alto = alto;
  }

  @Override
  double calcularArea() {
    return ancho * alto;
  }

  @Override
  String mostrarInformacion() {
    return "Rectángulo: " + color + " de " + ancho + " x " + alto;
  }

}
