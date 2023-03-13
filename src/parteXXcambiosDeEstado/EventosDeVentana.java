package parteXXcambiosDeEstado;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

class EventosDeVentana implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado de estado.");
		//para ver que estado tenía
		System.out.println(e.getNewState());
		if(e.getNewState() == 6) {
			System.out.println("MAXIM");
		}
		
	}
	
	
	
}
