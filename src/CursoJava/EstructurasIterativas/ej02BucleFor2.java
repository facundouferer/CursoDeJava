package CursoJava.EstructurasIterativas;

import java.util.Scanner;

public class ej02BucleFor2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un n�mero");
        int numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.print(i + ", ");
        }
    }

}
