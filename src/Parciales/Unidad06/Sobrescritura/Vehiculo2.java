package Parciales.Unidad06.Sobrescritura;

class Vehiculo2 {
  public void mover() {
    System.out.print("El vehículo se está moviendo. ");
  }
}

class Coches extends Vehiculo2 {
  @Override
  public void mover() {
    System.out.print("El coche se está moviendo. ");
  }

  static void main(String[] args) {
    Vehiculo2 vehiculo = new Vehiculo2();
    Vehiculo2 coche = new Coches();

    vehiculo.mover();
    coche.mover();
  }
}
