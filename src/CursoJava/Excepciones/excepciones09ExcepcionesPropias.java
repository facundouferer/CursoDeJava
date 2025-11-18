package CursoJava.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase de excepción personalizada para números positivos inferiores a 50.
 * Al heredar de Exception, es una excepción comprobada (checked exception).
 */
class NumeroPositivoInferiorA50Exception extends Exception {

  public NumeroPositivoInferiorA50Exception() {
  }

  public NumeroPositivoInferiorA50Exception(String mensajeError) {
    super(mensajeError);
  }
}

public class excepciones09ExcepcionesPropias {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Introduce un número:");

    try {
      int numero = leer.nextInt();
      evaluarNumero(numero);
      System.out.println("El número " + numero + " es válido.");

    } catch (NumeroPositivoInferiorA50Exception e) {
      System.err.println("Se ha producido un error personalizado.");
      e.printStackTrace();
    } catch (InputMismatchException e) {
      System.err.println("Error: Debes introducir un número entero.");
    } finally {
      leer.close();
      System.out.println("Fin del programa.");
    }
  }

  static void evaluarNumero(int numero) throws NumeroPositivoInferiorA50Exception {
    if (numero > 0 && numero < 50) {
      throw new NumeroPositivoInferiorA50Exception("Error: el número no puede ser positivo e inferior a 50.");
    }
  }
}