package controlDeFlujo;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer saario"));
		double salario2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segunda salario"));
		
		double salarioMayor=(salario1>salario2)?salario1:salario2;
		
		JOptionPane.showMessageDialog(null, "El salario mayor es $"+salarioMayor);
			

	}

}
