package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: comprobar que el bloque finally se ejecuta haya o no una excepción.
 * Concepto: §2 try, catch, finally y el orden en que corren.
 */
public class Ej04TryCatchFinally {

  public static void main(String[] args) {
    // Con excepción: el catch y el finally se ejecutan.
    try {
      int resultado = 10 / 0;
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: no se puede dividir por cero.");
    } finally {
      System.out.println("Este bloque se ejecuta siempre.");
    }

    // Con o sin excepción según lo que escriba el usuario: finally cierra el Scanner.
    Scanner leer = new Scanner(System.in);
    try {
      System.out.println("Ingrese un número entero:");
      int numero = leer.nextInt();
      System.out.println("El número ingresado es " + numero);
    } catch (InputMismatchException e) {
      System.out.println("El valor ingresado no es un número entero.");
    } finally {
      leer.close();
      System.out.println("Fin del programa");
    }
  }
}
