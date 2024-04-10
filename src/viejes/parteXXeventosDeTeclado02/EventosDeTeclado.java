package viejes.parteXXeventosDeTeclado02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class EventosDeTeclado implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar());// muestra la tecla si la misma es un caracter. no todos los c�digos.
		System.out.println(arg0.getKeyCode());// muestra el c�digo de la tecla.
		System.out.println("1) APRETASTE UNA TECLA: ");

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("3) TECLA SOLTADA");

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("2) TECLA EN ESTADO DE TECLEO");

	}

}
