/**
 * Calcula el precio de un boleto de viaje, tomando en cuenta el número de
 * kilómetros que
 * se van a recorrer, siendo el precio $45 por Km.
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej01PrecioBoleto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la distancia a recorrer en kilómetros: ");
        int distancia = sc.nextInt();
        double precio = distancia * 45.0;
        System.out.println("El precio del boleto es: $" + precio);
        sc.close();

    }
}
