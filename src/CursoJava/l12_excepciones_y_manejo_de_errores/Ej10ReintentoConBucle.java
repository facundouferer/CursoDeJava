package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: pedir dos números y repetir la carga hasta que sean válidos y la división sea posible.
 * Concepto: §3 Checked vs unchecked (InputMismatchException deja el texto
 *           inválido en el buffer: hay que descartarlo con nextLine()) y §5 Varios catch.
 */
public class Ej10ReintentoConBucle {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    boolean datosValidos = false;

    while (!datosValidos) {
      try {
        System.out.println("Ingrese el dividendo:");
        int dividendo = leer.nextInt();

        System.out.println("Ingrese el divisor:");
        int divisor = leer.nextInt();

        double resultado = (double) dividendo / divisor;
        System.out.println("El resultado de la división es: " + resultado);
        datosValidos = true;
      } catch (InputMismatchException e) {
        System.out.println("Error: solo se admiten números enteros.");
        leer.nextLine(); // descarta el texto inválido que quedó en el buffer
      } catch (ArithmeticException e) {
        System.out.println("Error: no se puede dividir por cero.");
        leer.nextLine();
      }
    }

    System.out.println("Fin del programa");
    leer.close();
  }
}
