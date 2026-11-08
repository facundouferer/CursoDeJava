package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: dividir dos números ingresados por teclado y avisar si el divisor es cero.
 * Concepto: §2 try, catch, finally y el orden en que corren
 *           (el catch se saltea si no hay excepción; el programa continúa después).
 */
public class Ej03TryCatchDivision {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese el dividendo:");
    int dividendo = leer.nextInt();

    System.out.println("Ingrese el divisor:");
    int divisor = leer.nextInt();

    try {
      int resultado = dividendo / divisor;
      System.out.println("El resultado de la división es: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("No se puede dividir por cero.");
    }

    System.out.println("Fin del programa");
    leer.close();
  }
}
