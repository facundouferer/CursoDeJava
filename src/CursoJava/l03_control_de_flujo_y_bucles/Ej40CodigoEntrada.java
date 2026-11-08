package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: pedir código de usuario y contraseña numérica hasta que sean 1024 y 4567.
 * Concepto: 3. Bucles e iteración: while.
 */
public class Ej40CodigoEntrada {

    private static final int CODIGO_VALIDO = 1024;
    private static final int CONTRASENA_VALIDA = 4567;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo = 0;
        int contrasena = 0;

        while (codigo != CODIGO_VALIDO || contrasena != CONTRASENA_VALIDA) {
            System.out.println("Ingrese su código de usuario:");
            codigo = entrada.nextInt();
            System.out.println("Ingrese su contraseña numérica:");
            contrasena = entrada.nextInt();
        }

        System.out.println("Bienvenido.");
        entrada.close();
    }
}
