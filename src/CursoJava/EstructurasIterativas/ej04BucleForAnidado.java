package CursoJava.EstructurasIterativas;

import java.util.Scanner;

public class ej04BucleForAnidado {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un n�mero");
        int numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++) {

            for (int j = 0; j <= numero; j++) {

                System.out.println(i + " + " + j + " = " + (i + j));

            }

        }

    }

}
