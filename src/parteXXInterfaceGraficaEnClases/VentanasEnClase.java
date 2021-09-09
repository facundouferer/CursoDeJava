package parteXXInterfaceGraficaEnClases;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

class VentanasEnClase extends JFrame{
	
	public VentanasEnClase() {
		
		setSize(300, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image gatito = sistema.getImage("gatito.png");
		setIconImage(gatito);
		
		setTitle("Mi primer ventanita con un gatito");
		
		PanelEnClase panelcito = new PanelEnClase();		
		add(panelcito); 		
		setVisible(true);		
		
	}

}
