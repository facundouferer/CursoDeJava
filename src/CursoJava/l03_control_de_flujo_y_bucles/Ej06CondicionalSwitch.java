package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: comentar la cantidad de hijos ingresada evaluando múltiples valores de una misma variable.
 * Concepto: 2. La estructura switch.
 */
public class Ej06CondicionalSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de hijos:");
        int hijos = entrada.nextInt();

        switch (hijos) {
            case 0:
                System.out.println("No tiene hijos");
                break;
            case 1:
                System.out.println("Creo que está bien tener un hijo");
                break;
            case 2:
                System.out.println("Y bueno, 2 no son nada");
                break;
            case 3:
                System.out.println("Tal vez ya son muchos.");
                break;
            default:
                System.out.println("Usted tiene " + hijos + " hijos.");
                break;
        }
        entrada.close();
    }
}
