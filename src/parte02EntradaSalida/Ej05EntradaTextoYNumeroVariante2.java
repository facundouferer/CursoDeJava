package parte02EntradaSalida;

import java.util.Scanner;

public class Ej05EntradaTextoYNumeroVariante2 {

    public static void main(String[] args) {

        //Escaneará la consola en búsqueda de información ingresada.

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce tu edad por favor");

        int edad = entrada.nextInt(); //captura el siguiente string ingresado por consola

        System.out.println("introduce tu nombre por favor");

        entrada.nextLine();

        String nombre = entrada.nextLine(); //captura el siguiente string ingresado por consola

        System.out.println(nombre + " tiene " + edad + " años.");

    }

}
