package viejes.parteXXLayoutsConGridLayout;

import javax.swing.JFrame;

class MarcoConLayout extends JFrame {

	public MarcoConLayout() {
		setTitle("Layouts");
		setBounds(10, 10, 300, 300);
		PanelConLayout panel = new PanelConLayout();
		add(panel);
	}

}
