package controlDeFlujo;

import javax.swing.JOptionPane;

public class condicionalIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad"));
		
		if(edad == 0) {
			//Es ejecutada cuando la condición es verdadera
			System.out.println("No ingresó ningún valor válido");
		}

	}

}
