package CursoJava.Interfaces.FigurasAbstractas;

class Circulo extends Figura implements ParaMostrar {
  double radio;

  public Circulo(String color, double radio) {
    super(color);
    this.radio = radio;
  }

  @Override
  double calcularArea() {
    return Math.PI * radio * radio;
  }

  @Override
  String mostrarInformacion() {
    return "Círculo: " + color + " radio: " + radio;
  }
 
  @Override
  public String mostrarCantLados() {
    return "0";
  }

}
