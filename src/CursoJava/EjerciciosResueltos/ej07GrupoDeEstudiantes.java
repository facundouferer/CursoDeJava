/**
 * 7) Un profesor desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo de estudiantes. 
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej07GrupoDeEstudiantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de hombres: ");
        int hombres = input.nextInt();
        System.out.println("Ingrese el número de mujeres: ");
        int mujeres = input.nextInt();
        int total = hombres + mujeres;
        double porcentajeHombres = (hombres * 100) / total;
        double porcentajeMujeres = (mujeres * 100) / total;

        System.out.println("El porcentaje de hombres es de: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de mujeres es de: " + porcentajeMujeres + "%");
    }
}
