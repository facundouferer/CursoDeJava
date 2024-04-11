/**
 * 8) Elabore un programa que realice la conversión de cm. a pulgadas. a. Donde 1cm = 0.39737 pulgadas.
*/
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej08Conversion {
    public static void main(String[] args) {

        Scanner entradaTecladoDelUsuario = new Scanner(System.in);
        System.out.println("Ingrese el número de centímetros a convertir: ");
        double cm = entradaTecladoDelUsuario.nextDouble(); // variable para guardar la entrada del usuario

        double pulgadas = cm * 0.39737; // 1cm = 0.39737 pulgadas

        System.out.println(cm + " centímetros son " + pulgadas + " pulgadas"); // mostrar el resultado
    }
}
