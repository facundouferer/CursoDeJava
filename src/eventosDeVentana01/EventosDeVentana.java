package eventosDeVentana01;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class EventosDeVentana extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ADIOS");
		
	}
	
}
