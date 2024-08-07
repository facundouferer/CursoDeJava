package Parciales.Unidad06.Sobrescritura;

class Vehiculo {
  public void arrancar() {
    System.out.println("El vehículo está arrancando");
  }
}

class Coche extends Vehiculo {
  @Override
  public void arrancar() {
    System.out.println("El coche está arrancando");
  }

  public void acelerar() {
    System.out.println("El coche está acelerando");
  }
}

class Main {
  public static void main(String[] args) {
    Vehiculo miVehiculo = new Coche();
    miVehiculo.arrancar();
    miVehiculo.acelerar();
  }
}
