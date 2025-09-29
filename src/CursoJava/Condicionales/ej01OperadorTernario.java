package CursoJava.Condicionales;

import javax.swing.*;

public class ej01OperadorTernario {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int edad01 = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        int edad02 = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));

        int edadMayor = (edad01 > edad02) ? edad01 : edad02;

        JOptionPane.showMessageDialog(null, "El m�s viejo tiene: " + edadMayor + " a�os.");

    }

}
