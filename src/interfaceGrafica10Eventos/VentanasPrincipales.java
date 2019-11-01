package interfaceGrafica10Eventos;

import java.awt.Color;

import javax.swing.JFrame;

class VentanasPrincipales extends JFrame{
	
	public VentanasPrincipales() {
		
		setBounds(5,50,500,400);
		
		PanelesCambioOyente panel = new PanelesCambioOyente();
		
		add(panel);
		
		setVisible(true);
	}

}
