package calculadora;

import javax.swing.JFrame;

class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {
		setTitle("Calculadora");
		setBounds(0, 0, 300, 300);
		PanelPrincipal panel = new PanelPrincipal();
		add(panel);
	}

}
