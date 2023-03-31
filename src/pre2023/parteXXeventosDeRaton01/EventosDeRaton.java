package pre2023.parteXXeventosDeRaton01;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class EventosDeRaton implements MouseListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cantidad de clicks: "+ e.getClickCount());
		
		//nos mostrará la coordenada X,Y donde se realizó
		System.out.println("coordenada (" +e.getX() +", "+e.getY()+")");
		
		System.out.println("Se pulso el botón: "+e.getButton()); //nos muestra el nro del botón pulsado
		
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
		System.out.println("SE SOLTÓ EL BOTÓN");
		
	}
	
	
}
