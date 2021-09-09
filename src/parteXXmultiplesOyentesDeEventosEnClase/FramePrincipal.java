package parteXXmultiplesOyentesDeEventosEnClase;

import javax.swing.JFrame;

class FramePrincipal extends JFrame {
	
	public FramePrincipal() {

		setTitle("Multiples Oyentes de Eventos");

		setBounds(400, 10, 400, 300);

		PanelPrincipal panel = new PanelPrincipal();

		add(panel);

	}
}
