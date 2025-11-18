package Practica.Unidad06.Abstraccion;

import CursoJava.ArreglosMultidimensionales.rellenarAregloBisConMath;

abstract class Figura {
  public abstract double calcularArea();
}

class Circulo extends Figura {
  double radio;

  Circulo(double r) {
    radio = r;
  }

  public double calcularArea() {
    return 3.14 * radio * radio;
  }
}

class Cuadrado extends Figura {
  double lado;

  Cuadrado(double l) {
    lado = l;
  }

  public double calcularArea() {
    return lado * lado;
  }

  public static void main(String[] args) {
    Figura f1 = new Circulo(3);
    Figura f2 = new Cuadrado(4);
    System.out.print(" Cuadrado: " + f2.calcularArea());
    System.out.print(" Círculo: " + f1.calcularArea());
  }
}
