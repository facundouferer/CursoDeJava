package Arreglos;

import javax.swing.JOptionPane;

public class ArraysesInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] nombres = new String[4];
		
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=JOptionPane.showInputDialog("ingrese nombre");
		}
		
		
		for (String nombre:nombres) {
			System.out.println(nombre);
		}
		

	}

}
