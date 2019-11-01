package interfaceGrafica09Eventos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelesConBotones extends JPanel implements ActionListener{ //implementar 
	
	JButton botonAzul = new JButton("AZUL");	
	JButton botonRojo = new JButton("ROJO");
	JButton botonVerde = new JButton("VERDE");
	
	public PanelesConBotones () {
		
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonVerde.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { //metodo de la interface ActionListener 
		// TODO Auto-generated method stub
		Object botonPulsado = e.getSource(); //para saber cual objeto realizo la acción
		if(botonPulsado==botonAzul) {
			setBackground(Color.BLUE);
		}else {
			if(botonPulsado==botonRojo) {
				setBackground(Color.RED);
			}else {
				setBackground(Color.GREEN);
			}
		}
				
	}

}
