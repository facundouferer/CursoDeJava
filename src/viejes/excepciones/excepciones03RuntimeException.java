package viejes.excepciones;

import java.util.Scanner;

class excepciones03RuntimeException {

    public static void main(String[] args) {

        try {

            System.out.println("ingresa un n�mero");
            Scanner leer = new Scanner(System.in);
            int nroUno = leer.nextInt();

            System.out.println("ingresa otro n�mero");
            int nroDos = leer.nextInt();

            System.out.println(nroUno / nroDos);

        } catch (Exception e) {
            System.out.println("algo sali� mal: " + e.getMessage());
        }

        System.out.println("Fin del programa");

    }

}
