package viejes.parteA03EstructurasDeDecision;

import java.util.Scanner;

public class ej03IfElse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un n�mero");

        int numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("ingres� un n�mero igual a 0");
        } else {
            System.out.println("ingres� un n�mero distinto de 0.");
        }

    }

}
