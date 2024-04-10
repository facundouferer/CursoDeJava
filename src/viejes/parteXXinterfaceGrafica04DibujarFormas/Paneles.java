package viejes.parteXXinterfaceGrafica04DibujarFormas;

import java.awt.Graphics;

import javax.swing.JPanel;

class Paneles extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// dibujando formas geom�tricas en nuestro panel

		g.drawRect(100, 100, 40, 50);
		g.drawOval(7, 10, 200, 200);
		g.fillRect(300, 80, 100, 100);

	}

}
