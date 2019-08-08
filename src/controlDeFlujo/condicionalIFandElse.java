package controlDeFlujo;

import javax.swing.JOptionPane;

public class condicionalIFandElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad"));
		
		if(edad >= 18) {
			//Es ejecutada cuando la condición es verdadera
			System.out.println("Es MAYOR de edad");
		}else {
			//Es ejecutada cuando la condición es falsa. 
			System.out.println("Es MENOR de edad.");
		}
		

	}

}
