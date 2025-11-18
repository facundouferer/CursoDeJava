package Practica.Unidad06.ClasesyObjetos;

class Coche {
  String marca;
  String modelo;
  int anio;

  public Coche(String marca, String modelo, int anio) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }

  public void verAtributos() {
    System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio);
  }

  public static void main(String[] args) {
    Coche coche = new Coche("Toyota", "Corolla", 2020);
    coche.verAtributos();
  }
}
