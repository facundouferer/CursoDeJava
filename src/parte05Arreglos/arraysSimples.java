package parte05Arreglos;

import java.util.Scanner;

public class arraysSimples {
    public static void main(String[] args) {
        String[] nombres = new String[4];

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese los nombres");

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = entrada.nextLine();
        }

        System.out.println("NOMBRE:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
