package CursoJava.ClasesAbstractas;

abstract class Figura {
  String color;

  public Figura(String color) {
    this.color = color;
  }

  abstract double calcularArea();

  public String getColor() {
    return color;
  }

  public void mostrarInformacion() {
    System.out.println("Color: " + color);
    System.out.println("Área: " + calcularArea());
  }
}

class Circulo extends Figura {
  double radio;

  public Circulo(String color, double radio) {
    super(color);
    this.radio = radio;
  }

  @Override
  double calcularArea() {
    return Math.PI * radio * radio;
  }
}

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
}

public class FigurasAbstractas {
  public static void main(String[] args) {
    Figura circulo = new Circulo("Rojo", 5);
    Figura rectangulo = new Rectangulo("Azul", 4, 6);

    circulo.mostrarInformacion();
    rectangulo.mostrarInformacion();
  }
}
