package viejes.parteYdeParcial01;

import java.io.IOException;
import java.util.Scanner;

class excepciones06ThrowObligatorio {
    public static void main(String[] args) {
        try {
            realizarDivision();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }

    static void realizarDivision() throws IOException {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un n�mero");
        int nroUno = leer.nextInt();
        System.out.println("ingresa otro n�mero");
        int nroDos = leer.nextInt();
        int resultado = nroUno / nroDos;
        System.out.println("el resultado es" + resultado);
    }
}
