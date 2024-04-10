package viejes.parteA02EntradaSalida;

import java.util.Scanner;

public class Ej01EntradaScanner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Escanear� la consola en b�squeda de informaci�n ingresada.

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un entero");

        Integer numero = entrada.nextInt(); // captura el entero ingresado

        System.out.println("numero " + numero);

    }

}
