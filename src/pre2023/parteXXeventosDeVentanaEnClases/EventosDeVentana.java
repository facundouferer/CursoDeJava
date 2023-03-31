package pre2023.parteXXeventosDeVentanaEnClases;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class EventosDeVentana extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ADIOS");
		
	}
	
}
