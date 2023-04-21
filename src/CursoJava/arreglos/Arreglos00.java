package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos00 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese el DNI a buscar:");
        int dni = scanner.nextInt();

        //arreglo con los númeors de DNI
        int[] arreglo = { 12345678, 87654321, 31119278, 22222222, 33333333, 44444444, 55555555, 66666666, 77777777, 88888888, 99999999 };

        // a) Imprimir los valores en el mismo orden en que fueron ingresados
        System.out.println("Los valores ingresados son:");
        for (int valor : arreglo) {
            //Buscar el DNI ingresado por el usuario
            if (valor == dni) {
                System.out.println("El DNI " + dni + " se encuentra en la base de datos");
                break;
            }
        }

    }
}
