package Practica;

class Matematica {
  private int a, b;

  Matematica(int nro1, int nro2) {
    this.a = nro1;
    this.b = nro2;
  }

  public int sumar() {
    return a + b;
  }

  public int restar() {
    return a - b;
  }

  public int multiplicar() {
    return a * b;
  }

  public int dividir() {
    int resultdo = 0;
    if (b != 0) {
      resultdo = a / b;
    } else {
      System.out.println("Error: Division por cero");
    }
    return resultdo;
  }

  public void setA(int nro1) {
    this.a = nro1;
  }

  public int getA() {
    return a;
  }

}

class Practica02 {

  public static void main(String[] args) { // acá inicia todo
    int nro1 = 5;
    int nro2 = 5;

    Matematica mat = new Matematica(nro1, nro2);

    System.out.println("El resultado es: " + mat.sumar());
  }// acá termina todo

}
