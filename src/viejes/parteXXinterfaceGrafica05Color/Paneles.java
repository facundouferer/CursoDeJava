package viejes.parteXXinterfaceGrafica05Color;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

class Paneles extends JPanel {

	public Paneles() {

		setBackground(Color.yellow);

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// PRIMERO EL CASTING

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(10, 10, 300, 300);

		BasicStroke trazo = new BasicStroke(4); // crear un trazo

		g2.setPaint(Color.blue); // coloreamos nuestro panel

		g2.setStroke(trazo); // agregar el trazo

		g2.draw(rectangulo); // Dibuja la forma instanciada

		g2.setPaint(Color.red); // metemos otro color

		g2.fill(rectangulo); // coloreamos el relleno

	}

}
