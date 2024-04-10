package viejes.parteXXinterfaceGrafica08Eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelesConBotones extends JPanel implements ActionListener { // implementar

	JButton botonAzul = new JButton("AZUL");

	public PanelesConBotones() {

		add(botonAzul);

		botonAzul.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) { // metodo de la interface ActionListener
		// TODO Auto-generated method stub
		setBackground(Color.BLUE);
	}

}
