package interfaceGrafica03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

class Paneles extends JPanel{
	
	public Paneles() {
		
		setBackground(Color.PINK); //color del fondo
		
	}
	
	public void paintComponent(Graphics g) { //sobre escribimos el metodo que ya tiene JPanel

		super.paintComponent(g);

		g.setColor(Color.BLUE); //se puede hacer esto o instanciar un objeto color
		
		g.setFont(new Font("Courier", Font.BOLD, 30)); 

		g.drawString("PANEL", 25, 55);
	}

}
