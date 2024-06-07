package CursoJava.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionPorCero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numerador: ");
    try {
      int numerador = sc.nextInt();
      System.out.println("Introduce un denominador: ");
      int denominador = sc.nextInt();

      int resultado = numerador / denominador;
      System.out.println("El resultado es: " + resultado);

    } catch (InputMismatchException e) {
      System.out.println("No se puede dividir letras!!!!");
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
    sc.close();
  }
}
