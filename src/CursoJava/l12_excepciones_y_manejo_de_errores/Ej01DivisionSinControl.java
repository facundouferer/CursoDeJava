package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: dividir dos números ingresados por teclado sin ningún control de errores.
 * Concepto: §1 Una excepción es un objeto y §3 Checked vs unchecked
 *           (InputMismatchException y ArithmeticException son RuntimeException).
 *
 * Con texto en lugar de un número, o con divisor cero, el programa se detiene
 * y la JVM imprime el stack trace: nadie atrapó la excepción.
 */
public class Ej01DivisionSinControl {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese el dividendo:");
    int dividendo = leer.nextInt();

    System.out.println("Ingrese el divisor:");
    int divisor = leer.nextInt();

    int resultado = dividendo / divisor;
    System.out.println("El resultado de la división es: " + resultado);

    System.out.println("Fin del programa");
    leer.close();
  }
}
