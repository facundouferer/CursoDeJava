package controlDeFlujo;

import javax.swing.JOptionPane;

public class BucleWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="facu";
		String acceso="";
		
		/*
		 * ! da vuelta la comparación*/
		
		while(!clave.equals(acceso)) {
			acceso=JOptionPane.showInputDialog("ingrese la clave");
			if(!clave.equals(acceso)) {
				JOptionPane.showMessageDialog(null, "la clave es incorrecta");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Acceso concedido");

	}

}
