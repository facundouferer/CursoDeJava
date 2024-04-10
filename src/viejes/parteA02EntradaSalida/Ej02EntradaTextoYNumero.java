package viejes.parteA02EntradaSalida;

import java.util.Scanner;

public class Ej02EntradaTextoYNumero {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Escanear� la consola en b�squeda de informaci�n ingresada.

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce tu nombre por favor");

        String nombre = entrada.nextLine(); // captura el siguiente string ingresado por consola

        System.out.println("introduce tu edad por favor");

        int edad = entrada.nextInt(); // captura el siguiente string ingresado por consola

        System.out.println(nombre + " tiene " + edad + " a�os.");

    }

}
