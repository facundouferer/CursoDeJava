package CursoJava.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01DividirPorZero {
  public static void main(String[] args) {

    try {
      System.out.println("ingresa un número");
      Scanner leer = new Scanner(System.in);
      int nroUno = leer.nextInt();
      System.out.println("ingresa otro número");
      double nroDos = leer.nextInt();
      double resultado = nroUno / nroDos;
      System.out.println("El resultado de la división es: " + resultado);
      System.out.println("Fin del programa");
      leer.close();
    } catch (ArithmeticException e) {
      System.out.println("No se puede dividir por ZERO!");
    } catch (InputMismatchException e) {
      System.out.println("En serio? Ingresó caracteres en vez de números");
    }

  }
}
