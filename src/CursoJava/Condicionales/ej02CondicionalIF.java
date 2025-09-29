package CursoJava.Condicionales;

import java.util.Scanner;

public class ej02CondicionalIF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un número");

        int numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("ingresó un número igual a 0");
        }

    }

}
