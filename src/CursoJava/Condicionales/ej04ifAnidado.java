package CursoJava.Condicionales;

import java.util.Scanner;

import javax.swing.*;

public class ej04ifAnidado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la edad");
        int edad = entrada.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("¿Tiene carnet? s/n");
        char carnet = entrada2.next().charAt(0);

        if (edad >= 18) {
            if (carnet == 's' || carnet == 'S') {
                System.out.println("Puede comprar el auto");
            } else {
                JOptionPane.showMessageDialog(null, "No puede comprar el auto, por no tener carnet");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puede comprar el auto, por ser menor de edad");
        }
    }

}
