package CursoJava.Condicionales;

import java.util.Scanner;

public class ej03IfElse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un número");

        int numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("ingresó un número igual a 0");
        } else {
            System.out.println("ingresó un número distinto de 0.");
        }

    }

}
