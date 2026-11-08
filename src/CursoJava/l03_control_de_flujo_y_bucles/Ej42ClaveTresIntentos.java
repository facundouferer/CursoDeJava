package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: pedir una clave con un máximo de 3 intentos; se informa si se acertó o si se agotaron los intentos.
 * Concepto: 3. Bucles e iteración: do-while.
 */
public class Ej42ClaveTresIntentos {

    private static final String CLAVE = "111MIL";
    private static final int INTENTOS_MAXIMOS = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String intento;
        int intentosRestantes = INTENTOS_MAXIMOS;

        do {
            System.out.println("Ingrese la clave:");
            intento = entrada.nextLine();
            intentosRestantes--;
        } while (!intento.equals(CLAVE) && intentosRestantes > 0);

        if (intento.equals(CLAVE)) {
            System.out.println("¡Clave correcta!");
        } else {
            System.out.println("Se agotaron los " + INTENTOS_MAXIMOS + " intentos.");
        }
        entrada.close();
    }
}
