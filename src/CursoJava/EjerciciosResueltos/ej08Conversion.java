package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej08Conversion {
    public static void main(String[] args) {
        // este es un comentario de una sola línea

        /**
         * Este es un comentario de variasl líneas
         */

        Scanner entradaTecladoDelUsuario = new Scanner(System.in);
        System.out.println("Ingrese el número de centímetros a convertir: ");
        double cm = entradaTecladoDelUsuario.nextDouble(); // variable para guardar la entrada del usuario

        double pulgadas = cm * 0.39737; // 1cm = 0.39737 pulgadas

        System.out.println(cm + " centímetros son " + pulgadas + " pulgadas"); // mostrar el resultado
    }
}
