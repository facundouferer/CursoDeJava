package parteYdeParcial01;

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
        System.out.println("ingresa un número");
        int nroUno = leer.nextInt();
        System.out.println("ingresa otro número");
        int nroDos = leer.nextInt();
        int resultado = nroUno / nroDos;
        System.out.println("el resultado es" + resultado);
    }
}
