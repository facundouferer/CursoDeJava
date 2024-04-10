package viejes.parteA02EntradaSalida;

import javax.swing.*;

public class Ej04EntradaSalidaConJOptionPane {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre por favor");

        /*
         * Como JOptionPane nos devuelve un String, pero la variable en la que
         * queremos guardar es un integer devemos ocupar una clase
         * para convertir ese String y poder guardarlo en la variable integer.
         */

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));

        System.out.println(nombre + " tiene " + edad + " a�os.");
    }

}
