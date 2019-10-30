package controlDeFlujo;

import javax.swing.JOptionPane;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		
		if(edad <= 18) {
			System.out.println("Es menor de Edad");
		}else if(edad >18 && edad <= 50) {
				System.out.println("Es una persona jóven");
				}else {
					System.out.println("Es un anciano.");
				}
		}

	}

