package parte04EstructurasIterativas;

import java.util.Scanner;

public class ej03BucleWhile1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String clave="facu";

        /*
         * ! da vuelta la comparación*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la clave");

        String claveIngresada = entrada.nextLine();

        while (!claveIngresada.equals(clave)){
            /**
             * Se ejecutará mientras la condición sea verdadera
             */
            System.out.println("Clave incorrecta, vuelva a ingresar");
            claveIngresada = entrada.nextLine();
        }

        System.out.println("Clave correcta");

    }

}
