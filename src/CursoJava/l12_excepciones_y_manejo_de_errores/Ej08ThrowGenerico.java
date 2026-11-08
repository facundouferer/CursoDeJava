package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: validar que un número sea al menos 100 lanzando una excepción.
 * Concepto: §3 Checked vs unchecked (throw vs throws) y §8 antipatrones:
 *           lanzar Exception genérica no dice qué pasó; ver Ej12ExcepcionPropia.
 */
public class Ej08ThrowGenerico {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese un número:");
    try {
      evaluarNumero(leer.nextInt());
      System.out.println("El número es válido.");
    } catch (Exception e) {
      System.out.println("Número rechazado: " + e.getMessage());
    } finally {
      leer.close();
    }
  }

  // throw lanza la excepción dentro del método; throws la declara en la firma.
  static void evaluarNumero(int numero) throws Exception {
    if (numero < 100) {
      throw new Exception("el número es demasiado chico");
    }
  }
}
