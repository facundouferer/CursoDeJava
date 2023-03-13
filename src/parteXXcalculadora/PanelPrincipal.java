package parteXXcalculadora;

import javax.swing.JPanel;

class PanelPrincipal extends JPanel{

	public PanelPrincipal() {
		PanelBotones botones = new PanelBotones();
		PanelDisplay display = new PanelDisplay();
		add(display);
		add(botones);
	}
	
}
