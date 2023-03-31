package pre2023.parteXXeventosDeTeclado01;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class EventosDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent t) {
		// TODO Auto-generated method stub
		System.out.println(t.getKeyCode());
		System.out.println(t.getKeyText(t.getKeyCode())); //muestra la tecla apretada en formato de texto
		if(t.getKeyCode() == 51) {
			MarcoSecundario marcoSecundario = new MarcoSecundario();
			marcoSecundario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			System.out.println("Has pulsado la tecla 3");
		}
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
