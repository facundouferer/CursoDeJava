package Parciales.Unidad06.ClasesyObjetos;

class Coche {
  String marca;
  String modelo;
  int año;

  public Coche(String marca, String modelo, int año) {
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
  }

  public void verAtributos() {
    System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
  }

  public static void main(String[] args) {
    Coche coche = new Coche("Toyota", "Corolla", 2020);
    coche.verAtributos();
  }
}
