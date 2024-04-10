package viejes.parteXXLayoutsConBorderLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelConLayout extends JPanel {

	public PanelConLayout() {

		/*
		 * aqu� es donde indicamos el tipo
		 * de layouts
		 */

		setLayout(new BorderLayout());
		add(new JButton("NORTE"), BorderLayout.NORTH);
		add(new JButton("SUR"), BorderLayout.SOUTH);
		add(new JButton("ESTE"), BorderLayout.EAST);
		add(new JButton("OESTE"), BorderLayout.WEST);
		add(new JButton("CENTRO"), BorderLayout.CENTER);

	}

}
