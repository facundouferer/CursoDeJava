package Practica.ClaseAbstracta;

abstract class Figura {
  String color;

  Figura(String color) {
    this.color = color;
  }

  abstract double calcularArea();
}

class Circulo extends Figura {
  double radio;

  Circulo(String color, double radio) {
    super(color);
    this.radio = radio;
  }

  double calcularArea() {
    return Math.PI * radio * radio;
  }
}

class Rectangulo extends Figura {
  double base, altura;

  Rectangulo(String color, double base, double altura) {
    super(color);
    this.base = base;
    this.altura = altura;
  }

  double calcularArea() {
    return base * altura;
  }
}

class Triangulo extends Figura {
  double base;
  double altura;

  Triangulo(String color, double base, double altura) {
    super(color);
    this.base = base;
    this.altura = altura;
  }

  double calcularArea() {
    System.out.println("Calculando area del triangulo");
    return (base * altura) / 2;
  }
}

class Practica07 {
  public static void main(String[] args) {
    Triangulo triangulo = new Triangulo("Rojo", 3, 4);
    double area = triangulo.calcularArea();
    System.out.println(area);
  }
}
