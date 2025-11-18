package Practica.Unidad06.UsoDeThis;

class Rectangulo {
  int ancho;
  int alto;

  public Rectangulo(int ancho, int alto) {
    this.ancho = ancho;
    this.alto = alto;
  }

  public int calcularArea() {
    return ancho * alto;
  }

  public static void main(String[] args) {
    Rectangulo rectangulo = new Rectangulo(3, 3);
    System.out.println("Área: " + rectangulo.calcularArea());
  }
}
