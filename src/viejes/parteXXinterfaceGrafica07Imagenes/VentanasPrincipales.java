package viejes.parteXXinterfaceGrafica07Imagenes;

import javax.swing.JFrame;

class VentanasPrincipales extends JFrame {

	public VentanasPrincipales() {

		setBounds(5, 50, 500, 400);

		Panel panel = new Panel();

		add(panel);

		setVisible(true);
	}

}
