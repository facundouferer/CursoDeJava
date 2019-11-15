package eventosDeTeclado01;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

class EventosDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent t) {
		// TODO Auto-generated method stub
		System.out.println(t.getKeyText(t.getKeyCode()));
		if(t.getKeyCode()==KeyEvent.VK_DOWN) System.out.println("ABAJO");
		if(t.getKeyCode()==KeyEvent.VK_UP) System.out.println("ARRIBA");
		if(t.getKeyCode()==KeyEvent.VK_LEFT) System.out.println("IZQUIERDA");
		if(t.getKeyCode()==KeyEvent.VK_RIGHT) System.out.println("DERECHA");
		
	}

	@Override
	public void keyReleased(KeyEvent t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
