package interfaceGrafica01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PrimerPanel extends JPanel {

	// un panel tiene como tamanio maximo el contenedor donde se encuentra

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// PINTAR UN PANEL DE UN COLOR DETERMINADO

		Color c = new Color(255, 128, 155); // creamos el color

		g.setColor(c); // le damos el color
		
		//PERSONALIZAMOS LA LETRA
		Font letra = new Font("Verdana", Font.BOLD, 30); //cre el objeto fuente
		g.setFont(letra); //setea la fuente al elemento

		// sobre escritura del metodo JPanel
		g.drawString("Primer panel", 25, 25);
	}

}
