package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: dividir dos números donde la lectura ocurre en un método y el control de errores en main.
 * Concepto: §4 La propagación (la excepción abandona realizarDivision y sube
 *           hasta el catch de main, que es quien sabe qué hacer con ella).
 */
public class Ej06PropagacionUnchecked {

  public static void main(String[] args) {
    try {
      realizarDivision();
    } catch (InputMismatchException e) {
      System.out.println("El valor ingresado no es un número entero.");
      e.printStackTrace();
    }

    System.out.println("Fin del programa");
  }

  // InputMismatchException es unchecked: declararla en throws es opcional, solo documenta.
  static void realizarDivision() throws InputMismatchException {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese el dividendo:");
    int dividendo = leer.nextInt();

    System.out.println("Ingrese el divisor:");
    int divisor = leer.nextInt();

    int resultado = dividendo / divisor;
    System.out.println("El resultado es " + resultado);

    leer.close();
  }
}
