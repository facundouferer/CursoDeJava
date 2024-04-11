/**
 * 5) Leer dos números y encontrar: a. La suma del doble del primero más el cuadrado del segundo. b. El promedio de sus cubos. 
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej05LosDosNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Pedir los dos números al usuario
        System.out.print("Introduzca el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Introduzca el segundo número: ");
        double num2 = input.nextDouble();

        // Calcular la suma del doble del primer número más el cuadrado del segundo
        // número
        double suma = (2 * num1) + (num2 * num2);
        System.out.println("La suma del doble del primer número más el cuadrado del segundo número es: " + suma);

        // Calcular el promedio de los cubos de los dos números
        double promedioCubos = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
        System.out.println("El promedio de los cubos de los dos números es: " + promedioCubos);

        input.close();
    }
}
