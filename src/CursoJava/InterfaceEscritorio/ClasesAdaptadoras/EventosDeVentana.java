package CursoJava.InterfaceEscritorio.ClasesAdaptadoras;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class EventosDeVentana extends WindowAdapter{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("VENTANA ACTIVA");
		
	}
}
