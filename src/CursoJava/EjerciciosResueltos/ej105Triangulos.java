package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej105Triangulos {
  /**
   * 5) Dados los lados de un triángulo donde los lados son ingresados por el
   * usuario,
   * informar qué tipo es: isósceles, escaleno o equilátero.
   */
  public static void main(String[] args) {
    // pedido al usuario de los lados del triángulo
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el primer lado del triángulo: ");
    int lado1 = scanner.nextInt();
    System.out.println("Ingrese el segundo lado del triángulo: ");
    int lado2 = scanner.nextInt();
    System.out.println("Ingrese el tercer lado del triángulo: ");
    int lado3 = scanner.nextInt();
    // comparación de lados y determinación del tipo de triángulo
    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("El triángulo es equilátero.");
    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
      System.out.println("El triángulo es isósceles.");
    } else {
      System.out.println("El triángulo es escaleno.");
    }
  }
}
