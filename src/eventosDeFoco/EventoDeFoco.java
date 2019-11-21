package eventosDeFoco;

import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class EventoDeFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana ventana = new MarcoVentana();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setVisible(true);

	}

}



