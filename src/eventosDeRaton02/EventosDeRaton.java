package eventosDeRaton02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ESTAS ARRASTRANDO EL MOSUE");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ESTAS MOVIENDO EL MOSUE");
		
	}
	
	
	
}
