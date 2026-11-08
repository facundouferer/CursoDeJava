package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: sumar o restar dos números expresados en base 3 validando la entrada.
 * Concepto: §7 Excepciones personalizadas (una por cada regla del dominio) y §5 Varios catch.
 */
public class Ej13CalculadoraBaseTres {

  static class NumeroBaseTresInvalidoException extends Exception {
    NumeroBaseTresInvalidoException(String mensaje) {
      super(mensaje);
    }
  }

  static class OperacionInvalidaException extends Exception {
    OperacionInvalidaException(String mensaje) {
      super(mensaje);
    }
  }

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.print("Operación (1 o 2): ");

    try {
      String opcion = leer.nextLine().trim();
      validarOperacion(opcion);

      System.out.print("Primer número: ");
      String primero = leer.nextLine().trim();
      validarNumero(primero);

      System.out.print("Segundo número: ");
      String segundo = leer.nextLine().trim();
      validarNumero(segundo);

      int decimal1 = baseTresADecimal(primero);
      int decimal2 = baseTresADecimal(segundo);
      int resultadoDecimal = opcion.equals("1") ? decimal1 + decimal2 : decimal1 - decimal2;

      System.out.println("\nResultado: " + decimalABaseTres(resultadoDecimal));
    } catch (OperacionInvalidaException | NumeroBaseTresInvalidoException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      leer.close();
    }
  }

  static int baseTresADecimal(String numero) {
    boolean negativo = numero.startsWith("-");
    int inicio = (negativo || numero.startsWith("+")) ? 1 : 0;
    int decimal = 0;

    for (int i = inicio; i < numero.length(); i++) {
      decimal = decimal * 3 + (numero.charAt(i) - '0');
    }

    return negativo ? -decimal : decimal;
  }

  static String decimalABaseTres(int decimal) {
    if (decimal == 0) {
      return "0";
    }

    int n = Math.abs(decimal);
    StringBuilder resultado = new StringBuilder();

    while (n > 0) {
      resultado.insert(0, n % 3);
      n /= 3;
    }

    return decimal < 0 ? "-" + resultado : resultado.toString();
  }

  static void validarOperacion(String opcion) throws OperacionInvalidaException {
    if (!opcion.equals("1") && !opcion.equals("2")) {
      throw new OperacionInvalidaException("Solo puede ingresar '1' para sumar o '2' para restar.");
    }
  }

  static void validarNumero(String numero) throws NumeroBaseTresInvalidoException {
    if (numero.isEmpty()) {
      throw new NumeroBaseTresInvalidoException("El número no puede estar vacío.");
    }

    int inicio = (numero.startsWith("-") || numero.startsWith("+")) ? 1 : 0;
    if (inicio == 1 && numero.length() == 1) {
      throw new NumeroBaseTresInvalidoException("Debe ingresar al menos un dígito después del signo.");
    }

    for (int i = inicio; i < numero.length(); i++) {
      char c = numero.charAt(i);
      if (c != '0' && c != '1' && c != '2') {
        throw new NumeroBaseTresInvalidoException(
            "El carácter '" + c + "' no es válido en base 3 (solo se permiten 0, 1 y 2).");
      }
    }
  }
}
