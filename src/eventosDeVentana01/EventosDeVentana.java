package eventosDeVentana01;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class EventosDeVentana implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA ACTIVA");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA CERRADA");
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA EN PROCESO DE CIERRE");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA DESACTIVADA");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA RESTAURADA DESPUÉS DE MINIMIZAR");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA MINIMIZADA");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA ABIERTA");
		
	}	
	
}
