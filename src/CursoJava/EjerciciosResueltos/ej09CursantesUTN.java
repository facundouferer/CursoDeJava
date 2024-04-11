/**
 * 9) Se desea conocer el promedio y porcentaje de hombres y mujeres cursando 
 * el Programación I en UTN FRRe, teniendo como dato la cantidad de hombres y mujeres de 3 comisiones.
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej09CursantesUTN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de hombres de la comisión 1: ");
        int hombres1 = input.nextInt();
        System.out.println("Ingrese la cantidad de mujeres de la comisión 1: ");
        int mujeres1 = input.nextInt();
        System.out.println("Ingrese la cantidad de hombres de la comisión 2: ");
        int hombres2 = input.nextInt();
        System.out.println("Ingrese la cantidad de mujeres de la comisión 2: ");
        int mujeres2 = input.nextInt();
        System.out.println("Ingrese la cantidad de hombres de la comisión 3: ");
        int hombres3 = input.nextInt();
        System.out.println("Ingrese la cantidad de mujeres de la comisión 3: ");
        int mujeres3 = input.nextInt();
        int totalHombres = hombres1 + hombres2 + hombres3;
        int totalMujeres = mujeres1 + mujeres2 + mujeres3;
        int total = totalHombres + totalMujeres;
        double porcentajeHombres = (totalHombres * 100) / total;
        double porcentajeMujeres = (totalMujeres * 100) / total;
        double promedio = total / 3;
        System.out.println("El promedio de alumnos es de: " + promedio);
        System.out.println("El porcentaje de hombres es de: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de mujeres es de: " + porcentajeMujeres + "%");

    }
}
