package viejes.parteXXeventosDeRaton01;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class EventosDeRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cantidad de clicks: " + e.getClickCount());

		// nos mostrar� la coordenada X,Y donde se realiz�
		System.out.println("coordenada (" + e.getX() + ", " + e.getY() + ")");

		System.out.println("Se pulso el bot�n: " + e.getButton()); // nos muestra el nro del bot�n pulsado

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("DENTRO");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("FUERA");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("PRESIONADO");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("SE SOLT� EL BOT�N");

	}

}
