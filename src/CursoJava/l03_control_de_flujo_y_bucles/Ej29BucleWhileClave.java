package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: solicitar una clave hasta que el usuario ingrese la correcta.
 * Concepto: 3. Bucles e iteración: while.
 */
public class Ej29BucleWhileClave {

    private static final String CLAVE = "facu";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la clave:");
        String claveIngresada = entrada.nextLine();

        // while evalúa la condición antes de ejecutar el bloque: se repite mientras la clave sea incorrecta.
        while (!claveIngresada.equals(CLAVE)) {
            System.out.println("Clave incorrecta, vuelva a ingresar:");
            claveIngresada = entrada.nextLine();
        }

        System.out.println("Clave correcta");
        entrada.close();
    }
}
