package viejes.parteYpracticaNro07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Crea un programa que pida al usuario introducir un n�mero. El programa debe
         * devolver un mensaje
         * especificando si el n�mero introducido por el usuario es par o impar.
         * Adem�s, el programa debe controlar la excepci�n si el usuario introduce texto
         * en lugar de un valor num�rico.
         * En caso de introducir texto, se debe advertir al usuario que �El valor
         * introducido no es num�rico.
         * El programa se cerrar�, terminando la ejecuci�n del programa sin hacer nada
         * m�s.
         */

        int nro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar un n�mero entero:");
        try {
            nro = entrada.nextInt();
            if (nro % 2 == 0) {
                System.out.println(nro + " es par");
            } else {
                System.out.println(nro + " es impar");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR: S�LO SE ADMITEN N�MROS!");
        }

    }

}
