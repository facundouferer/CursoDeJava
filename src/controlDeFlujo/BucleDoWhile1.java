package controlDeFlujo;

import javax.swing.JOptionPane;

public class BucleDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra o frase introducida  \n"+
		"Para termianr escribir salir");
		
		String texto;
		
		do {
			
			texto = JOptionPane.showInputDialog("intriduce el texto");
			JOptionPane.showMessageDialog(null, "el texto contiene "+texto.length()+" caracteres.");
			
		}while(!texto.equals("salir"));
		
		System.out.println("fin del programa");

	}

}
