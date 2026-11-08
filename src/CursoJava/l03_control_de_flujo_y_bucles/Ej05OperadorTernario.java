package CursoJava.l03_control_de_flujo_y_bucles;

import javax.swing.JOptionPane;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: informar la edad mayor entre dos personas usando el operador ternario.
 * Concepto: 1. Condicionales: operador ternario.
 */
public class Ej05OperadorTernario {

    public static void main(String[] args) {
        int primeraEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        int segundaEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));

        // Sintaxis corta para una asignación condicional simple.
        int edadMayor = (primeraEdad > segundaEdad) ? primeraEdad : segundaEdad;

        JOptionPane.showMessageDialog(null, "El más viejo tiene: " + edadMayor + " años.");
    }
}
