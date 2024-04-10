package viejes.parteXXinterfaceGrafica02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventanas extends JFrame {

	public Ventanas() {

		setBounds(40, 30, 600, 350);

		setResizable(false); // Impide la maximizaci�n o la redimensi�n

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// COLOCAR UN �CONO PERSONALIZADO A MI VENTANA
		Toolkit sistema = Toolkit.getDefaultToolkit(); // nos proporciona un kit de herramientas gr�ficas
		Image icono = sistema.getImage("gatito.png");
		setIconImage(icono);

		setTitle("Mi segunda Ventana");

		setVisible(true);

		// CLASE INTERNA AN�NIMA
		add(new JPanel() {

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(new Color(255, 128, 155));
				g.setFont(new Font("Verdana", Font.BOLD, 30));
				g.drawString("Primer panel", 25, 25);
			}
		});

	}

}
