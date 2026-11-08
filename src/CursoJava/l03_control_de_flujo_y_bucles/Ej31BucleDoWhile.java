package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: contar los caracteres de cada texto ingresado hasta que el usuario escriba "salir".
 * Concepto: 3. Bucles e iteración: do-while.
 */
public class Ej31BucleDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa cuenta los caracteres de la palabra o frase ingresada.");
        System.out.println("Para terminar, escriba salir.");

        String texto;
        // do-while garantiza que el bloque se ejecute al menos una vez.
        do {
            texto = entrada.nextLine();
            System.out.println("El texto contiene " + texto.length() + " caracteres.");
        } while (!texto.equals("salir"));

        System.out.println("Fin del programa");
        entrada.close();
    }
}
