package Practica.Unidad05;

public class ConfusionVariables {
  static int contador = 10;

  public static void main(String[] args) {
    incrementarContador();
    System.out.println("El valor del contador es: " + contador);
  }

  public static void incrementarContador() {
    int contador = 5;
    contador++;
    System.out.println("El valor del contador local es: " + contador);
  }
}
