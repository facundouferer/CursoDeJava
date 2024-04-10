package viejes.parteXXinterfaceGrafica05Fuente;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

class Paneles extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Font fuente = new Font("Arial", Font.BOLD, 26); // la letra debe estar en mi sistema

		g2.setFont(fuente);

		g2.setPaint(Color.DARK_GRAY);

		g2.drawString("UTN-FRR", 40, 40);

	}

}
