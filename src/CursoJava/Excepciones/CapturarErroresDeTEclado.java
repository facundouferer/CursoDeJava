package CursoJava.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturarErroresDeTEclado {
  public static void main(String[] args) {

    System.out.println("ingresa un número");
    Scanner leer = new Scanner(System.in);

    try {
      int nroUno = leer.nextInt();
      System.out.println("ingresa otro número");
      double nroDos = leer.nextInt();
      try {
        double resultado = nroUno / nroDos;
        System.out.println("El resultado de la división es: " + resultado);
      } catch (ArithmeticException e) {
        System.out.println("No se puede dividir por ZERO!");
      }
    } catch (InputMismatchException e) {
      System.out.println("Error al ingresar los datos: " + e.toString());
    }
    System.out.println("Fin del programa");
    leer.close();
  }
}
