package parteXXLayoutsConGridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelConLayout extends JPanel{
	
	
	public PanelConLayout() {
		
		/*
		 * aquí es donde indicamos el tipo 
		 * de layouts 
		 */
		
		setLayout(new GridLayout(2,2));
		add(new JButton("uno"));
		add(new JButton("dos"));
		add(new JButton("tres"));
		add(new JButton("cuatro"));
	}

}
