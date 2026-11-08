package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.io.IOException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: dividir dos números en un método que declara una excepción checked.
 * Concepto: §3 Checked vs unchecked y §4 La propagación (throws en la firma
 *           obliga a quien llama a manejar la excepción o a volver a declararla).
 */
public class Ej07ThrowsObligatorio {

  public static void main(String[] args) {
    try {
      realizarDivision();
    } catch (IOException e) {
      System.err.println("Error de entrada/salida: " + e.getMessage());
    }
    System.out.println("Fin del programa");
  }

  // Al declarar IOException (checked), main está obligado a atraparla.
  static void realizarDivision() throws IOException {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese el dividendo:");
    int dividendo = leer.nextInt();

    System.out.println("Ingrese el divisor:");
    int divisor = leer.nextInt();

    int resultado = dividendo / divisor;
    System.out.println("El resultado es " + resultado);
  }
}
