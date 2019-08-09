package controlDeFlujo;

import javax.swing.JOptionPane;

public class CondicionalSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hijos = Integer.parseInt(JOptionPane.showInputDialog("introduce cantidad de hijos"));

		switch (hijos) {
		case 0:
			JOptionPane.showMessageDialog(null, "Tienes mucha libertad");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Con uno esta bien");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "ya tienes más de la cuenta");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Tienes "+hijos+ " Hijos. ");
			break;
		}

	}

}
