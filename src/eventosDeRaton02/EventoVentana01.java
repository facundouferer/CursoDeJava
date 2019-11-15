package eventosDeRaton02;

import java.awt.Event;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class EventoVentana01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana ventana = new MarcoVentana();
		
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//pone en escucha al marco
		ventana.addMouseMotionListener(new EventosDeRaton());

	}

}