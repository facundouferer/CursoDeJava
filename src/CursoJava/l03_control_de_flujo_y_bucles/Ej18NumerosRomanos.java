package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar el equivalente en números romanos de un entero del 1 al 10.
 * Concepto: 2. La estructura switch (switch expressions).
 */
public class Ej18NumerosRomanos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entero del 1 al 10:");
        int numero = entrada.nextInt();

        String numeroRomano = switch (numero) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "Número no válido.";
        };

        System.out.println("El número " + numero + " en números romanos es: " + numeroRomano + ".");
        entrada.close();
    }
}
