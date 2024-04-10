package viejes.parteA02EntradaSalida;

import java.util.Scanner;

public class Ej05EntradaTextoYNumeroVariante2 {

    public static void main(String[] args) {

        // Escanear� la consola en b�squeda de informaci�n ingresada.

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce tu edad por favor");

        int edad = entrada.nextInt(); // captura el siguiente string ingresado por consola

        System.out.println("introduce tu nombre por favor");

        entrada.nextLine();

        String nombre = entrada.nextLine(); // captura el siguiente string ingresado por consola

        System.out.println(nombre + " tiene " + edad + " a�os.");

    }

}
