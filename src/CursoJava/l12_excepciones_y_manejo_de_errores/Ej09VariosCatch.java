package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: dividir dos números distinguiendo entrada inválida, divisor cero y otros errores.
 * Concepto: §5 Varios catch, y el orden importa (de lo más específico a lo más general).
 */
public class Ej09VariosCatch {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    try {
      System.out.println("Ingrese el dividendo:");
      int dividendo = leer.nextInt();

      System.out.println("Ingrese el divisor:");
      int divisor = leer.nextInt();

      int resultado = dividendo / divisor;
      System.out.println("El resultado es: " + resultado);
    } catch (InputMismatchException e) {
      System.out.println("Solo se admiten números enteros.");
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Ocurrió un error inesperado.");
    } finally {
      leer.close();
    }
  }
}
