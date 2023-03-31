package pre2023.parteA02EntradaSalida;

import java.util.Scanner;

public class Ej01EntradaScanner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Escaneará la consola en búsqueda de información ingresada.

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un entero");

        Integer numero = entrada.nextInt(); //captura el entero ingresado

        System.out.println("numero " + numero);

    }

}
