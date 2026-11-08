package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: decidir si una persona puede comprar un auto según su edad y si posee carnet.
 * Concepto: 1. Condicionales: if anidado.
 */
public class Ej03IfAnidado {

    private static final int EDAD_MINIMA = 18;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad:");
        int edad = entrada.nextInt();

        System.out.println("¿Tiene carnet? s/n");
        char carnet = entrada.next().charAt(0);

        if (edad >= EDAD_MINIMA) {
            if (carnet == 's' || carnet == 'S') {
                System.out.println("Puede comprar el auto");
            } else {
                JOptionPane.showMessageDialog(null, "No puede comprar el auto, por no tener carnet");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puede comprar el auto, por ser menor de edad");
        }
        entrada.close();
    }
}
