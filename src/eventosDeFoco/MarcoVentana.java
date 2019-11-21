package eventosDeFoco;

import javax.swing.JFrame;

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		setBounds(30, 30, 400, 300);
		
		add(new Panel_Marco_Foco());
		
	}
	
}