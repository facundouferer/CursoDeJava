package interfaceGrafica08Eventos;

import java.awt.Color;

import javax.swing.JFrame;

class VentanasPrincipales extends JFrame{
	
	public VentanasPrincipales() {
		
		setBounds(5,50,500,400);
		
		PanelesConBotones panel = new PanelesConBotones();
		
		add(panel);
		
		setVisible(true);
	}

}
