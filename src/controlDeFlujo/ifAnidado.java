package controlDeFlujo;

import javax.swing.JOptionPane;

public class ifAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));		
		if(edad >= 18) {
			String carnet = JOptionPane.showInputDialog("¿Tienen Carnet?");
			if(carnet.equals("si")) {				
				JOptionPane.showMessageDialog(null, "Puede comprar el auto");
			}else {
				JOptionPane.showMessageDialog(null, "No puede comprar el auto");
			}
		}else {
			JOptionPane.showMessageDialog(null, "No puede comprar el auto, por ser menor de edad");
		}

	}

}
