package multiplesFuentesDeEventos;

import javax.swing.JFrame;

class VentanasPrincipales extends JFrame{
	public VentanasPrincipales() {
		setBounds(10, 10, 600, 400);
		add(new Laminas());
		setVisible(true);
	}
}
