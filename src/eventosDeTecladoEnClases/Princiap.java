package eventosDeTecladoEnClases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Princiap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoVentana ventana = new MarcoVentana();

		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}

class MarcoVentana extends JFrame {

	public MarcoVentana() {
		
		setBounds(20, 20, 400, 400);
		
		Paneles panel = new Paneles();
		
		add(panel);

		setVisible(true);
		
	}
	
	

}


class Paneles extends JPanel{
	
	public Paneles() {
		
		addMouseListener(new EventosDeMouse());
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
	}
	
	class EventosDeMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Coordenada (" + e.getX() + ", " + e.getY()+")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("DENTRO");
			setBackground(Color.GREEN);

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("FUERA");
			setBackground(Color.RED);

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("BTN PRESIONADO");

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("SE SOLTÓ EL BTN");

		}

	}
	

}


