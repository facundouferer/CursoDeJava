package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: rechazar los números positivos menores o iguales a 50 con una excepción propia.
 * Concepto: §7 Excepciones personalizadas (extends Exception = checked) combinadas
 *           con varios catch y finally.
 */
public class Ej12ExcepcionPropia {

  /** Excepción checked: quien llama debe decidir qué hacer con el número rechazado. */
  static class NumeroPositivoInferiorA51Exception extends Exception {

    private final int numero;

    NumeroPositivoInferiorA51Exception(int numero) {
      super("El número " + numero + " no puede ser positivo e inferior a 51.");
      this.numero = numero;
    }

    int getNumero() {
      return numero;
    }
  }

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un número:");

    try {
      int numero = leer.nextInt();
      evaluarNumero(numero);
      System.out.println("El número " + numero + " es válido.");
    } catch (NumeroPositivoInferiorA51Exception e) {
      System.err.println("Número rechazado: " + e.getMessage());
    } catch (InputMismatchException e) {
      System.err.println("Error: debe ingresar un número entero.");
    } finally {
      leer.close();
      System.out.println("Fin del programa");
    }
  }

  static void evaluarNumero(int numero) throws NumeroPositivoInferiorA51Exception {
    if (numero > 0 && numero < 51) {
      throw new NumeroPositivoInferiorA51Exception(numero);
    }
  }
}
