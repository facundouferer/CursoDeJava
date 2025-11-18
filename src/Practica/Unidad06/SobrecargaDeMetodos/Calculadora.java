package Practica.Unidad06.SobrecargaDeMetodos;

class Calculadora {
  public int sumar(int a, int b) {
    return a + b;
  }

  public int sumar(int a, int b, int c) {
    return a + b + c;
  }

  public int sumar(int a, int b, int c, int d) {
    return a + b + c;
  }

  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    System.out.print(calculadora.sumar(1, 2));
    System.out.print(calculadora.sumar(1, 2, 3));
    System.out.print(calculadora.sumar(1, 2, 3, 4));
  }
}
