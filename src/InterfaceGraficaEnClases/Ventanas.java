package InterfaceGraficaEnClases;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventanas extends JFrame{
	
	public Ventanas() {
		
		setSize(300, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image gatito = sistema.getImage("gatito.png");
		setIconImage(gatito);
		
		setTitle("Mi primer ventanita con un gatito");
		
		setVisible(true);		
		
	}

}
