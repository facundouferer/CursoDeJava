package CursoJava.Excepciones;

import java.util.Scanner;

class NumeroBaseTresInvalidoException extends Exception {
    public NumeroBaseTresInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class OperacionInvalidaException extends Exception {
    public OperacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class BaseTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Operación (1 o 2): ");

        try {
            String opcion = scanner.nextLine().trim();
            validarOperacion(opcion);

            System.out.print("Primer número: ");
            String num1 = scanner.nextLine().trim();
            validarNumero(num1);

            System.out.print("Segundo número: ");
            String num2 = scanner.nextLine().trim();
            validarNumero(num2);
              
            int decimal1 = baseTresADecimal(num1);
            int decimal2 = baseTresADecimal(num2);
            int resultadoDecimal;

            if (opcion.equals("1")) {
                resultadoDecimal = decimal1 + decimal2;
            } else {
                resultadoDecimal = decimal1 - decimal2;
            }

            String resultadoBaseTres = decimalABaseTres(resultadoDecimal);
            System.out.println("\nResultado: " + resultadoBaseTres);

        } catch (OperacionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumeroBaseTresInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    public static int baseTresADecimal(String num) {
        boolean negativo = num.startsWith("-");
        int inicio = (negativo || num.startsWith("+")) ? 1 : 0;
        int decimal = 0;

        for (int i = inicio; i < num.length(); i++) {
            int digito = num.charAt(i) - '0';
            decimal = decimal * 3 + digito;
        }

        return negativo ? -decimal : decimal;
    }


    public static String decimalABaseTres(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        boolean negativo = decimal < 0;
        int n = Math.abs(decimal);
        String resultado = "";

        while (n > 0) {
            int resto = n % 3;
            resultado = resto + resultado;
            n = n / 3;
        }

        return negativo ? "-" + resultado : resultado;
    }

    public static void validarOperacion(String opcion) throws OperacionInvalidaException {
        if (!opcion.equals("1") && !opcion.equals("2")) {
throw new OperacionInvalidaException("Solo puede ingresar '1' para sumar o '2' para restar.");
        }
    }

    public static void validarNumero(String num) throws NumeroBaseTresInvalidoException {
        if (num == null || num.isEmpty()) {
            throw new NumeroBaseTresInvalidoException("El número no puede estar vacío.");
        }

        int inicio = (num.startsWith("-") || num.startsWith("+")) ? 1 : 0;
        if (inicio == 1 && num.length() == 1) {
            throw new NumeroBaseTresInvalidoException("Debe ingresar al menos un dígito después del signo.");
        }

        for (int i = inicio; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c != '0' && c != '1' && c != '2') {
                throw new NumeroBaseTresInvalidoException("El carácter '" + c + "' no es válido en base 3 (solo se permiten 0, 1 y 2).");
            }
        }
    }
}
