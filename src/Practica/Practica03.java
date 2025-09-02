package Practica;

import java.util.Scanner;

class Auto {
  private String color;
  private String marca;
  private int anio;
  private String traccion;

  public Auto(String color, String marca, int anio, String traccion) {
    this.color = color;
    this.marca = marca;
    this.anio = anio;
    this.traccion = traccion;
  }

  public String toString() {
    // String mensaje = String.format("Color: %s\nMarca: %s\nAño: %d\nTracción: %s",
    // color, marca, anio, traccion);
    return "--------------------------\nColor: " + color + "\nMarca: " + marca + "\nAño: " + anio + "\nTracción: "
        + traccion;
  }

}

class Garage {

  Scanner teclado = new Scanner(System.in);
  Auto[] estacionamiento = new Auto[3];

  Garage(Scanner teclado) {
    this.teclado = teclado;
  }

  public void agregarAuto(int lugar) {

    System.out.println("ingrese el Color");
    String color = teclado.nextLine();

    System.out.println("ingrese la Marca");
    String marca = teclado.nextLine();

    System.out.println("ingrese el Año");
    int anio = teclado.nextInt();

    teclado.nextLine(); // Limpiar el buffer

    System.out.println("ingrese la Tracción");
    String traccion = teclado.nextLine();

    Auto auto = new Auto(color, marca, anio, traccion);
    this.estacionamiento[lugar] = auto;
  }

  public void listarAutos() {
    for (Auto auto : estacionamiento) {
      if (auto != null) {
        System.out.println(auto.toString());
      }
    }
  }
}

class Practica03 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    Garage garage = new Garage(teclado);
    garage.agregarAuto(0);
    garage.listarAutos();
    teclado.close();
  }

}
