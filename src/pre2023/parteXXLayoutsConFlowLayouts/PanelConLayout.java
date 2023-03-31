package pre2023.parteXXLayoutsConFlowLayouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelConLayout extends JPanel{
	
	
	public PanelConLayout() {
		//AQUÍ ESPECIFICAMOS EL TIPO DE LAYOUTS
		/*
		 * Practicar con todos los constructores
		 * que se declaran en la API
		 */
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("amarillo"));
		add(new JButton("verde"));
		add(new JButton("rojo"));
	}

}
