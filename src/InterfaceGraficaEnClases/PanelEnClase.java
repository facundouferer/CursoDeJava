package InterfaceGraficaEnClases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelEnClase extends JPanel{
	
	JButton botonAzul = new JButton("AZUL");
	JButton botonAmarillo = new JButton("AMARILLO");
	JButton botonMagenta = new JButton("MAGENTA");
	
	public PanelEnClase() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonMagenta);
		
		ColorDeFondo azul = new ColorDeFondo(Color.BLUE);
		botonAzul.addActionListener(azul);
		
		ColorDeFondo amarillo = new ColorDeFondo(Color.YELLOW);
		botonAmarillo.addActionListener(amarillo);
		
		ColorDeFondo magenta = new ColorDeFondo(Color.MAGENTA);
		botonMagenta.addActionListener(magenta);
		
	}
	
	private class ColorDeFondo implements ActionListener{

		private Color colorDeFondo;
		
		public ColorDeFondo(Color c) {
			// TODO Auto-generated constructor stub
			this.colorDeFondo = c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setBackground(this.colorDeFondo);
		}
		
	}

}
