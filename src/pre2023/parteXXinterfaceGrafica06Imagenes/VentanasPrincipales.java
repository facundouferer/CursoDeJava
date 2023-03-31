package pre2023.parteXXinterfaceGrafica06Imagenes;

import javax.swing.JFrame;

class VentanasPrincipales extends JFrame{
	
	public VentanasPrincipales() {
		
		setBounds(5,50,500,500);
		
		PanelImagen panel = new PanelImagen();
		
		add(panel);
		
		setVisible(true);
	}

}
