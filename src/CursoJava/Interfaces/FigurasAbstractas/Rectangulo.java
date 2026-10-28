package CursoJava.Interfaces.FigurasAbstractas;

class Rectangulo extends Figura implements ParaMostrar {
  double ancho, alto;

  @Override
  public String mostrarNombre() {
    return "Rectángulo";
  }

  public Rectangulo(String color, double ancho, double alto) {
    super(color);
    this.ancho = ancho;
    this.alto = alto;
  }

  @Override
  double calcularArea() {
    return ancho * alto;
  }

  public String mostrarInformacion() {
    return "Rectángulo: " + color + " de " + ancho + " x " + alto;
  }

  @Override
  public String mostrarCantLados() {
    return "4";
  }

}
