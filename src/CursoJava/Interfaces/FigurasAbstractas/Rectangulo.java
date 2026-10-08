package CursoJava.Interfaces.FigurasAbstractas;

class Rectangulo extends Figura implements ParaMostrar {
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

  @Override
  public String mostrarCantLados() {
    return "4";
  }

}
