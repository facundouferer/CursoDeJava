package CursoJava.Inicio;

import java.util.Scanner;

public class ej08Conversion {
    public static void main(String[] args) {
        /**
         * Elabore un programa que realice la conversión de cm. a pulgadas.
         * a. Donde 1cm = 0.39737 pulgadas
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de centímetros a convertir: ");
        double cm = input.nextDouble();
        double pulgadas = cm * 0.39737;
        System.out.println(cm + "cm son " + pulgadas + " pulgadas");
    }
}
