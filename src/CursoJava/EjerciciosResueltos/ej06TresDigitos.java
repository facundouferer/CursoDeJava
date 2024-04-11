/**
 * 6) Leer tres números enteros de un Digito y almacenarlos en una sola variable que contenga 
 * a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562. 
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej06TresDigitos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = input.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int c = input.nextInt();
        int x = a * 100 + b * 10 + c;
        System.out.println("El valor de X es: " + x);
    }
}
