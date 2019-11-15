package eventosDeFoco02;

import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class EventoDeFoco02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana ventana = new MarcoVentana();
		
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		ventana.setVisible(true);

	}

}


class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		setBounds(30, 30, 400, 300);
		
		add(new Panel_Marco_Foco());
		
	}
	
}

class Panel_Marco_Foco extends JPanel {
	
	//con esto vamos a poder ver los focos
	class EventosDeFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==campoTexto01) {
				System.out.println("EL CUADRO 1 GANO EL FOCO.");
			}else {
				System.out.println("EL CUADRO 2 GANO EL FOCO.");
			}
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==campoTexto01) {
				System.out.println("EL CUADRO 1 PERDIÓ EL FOCO.");
			}else {
				System.out.println("EL CUADRO 2 PERDIÓ EL FOCO.");
			}
			
		}
		
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//creamos los campos de texto
		campoTexto01 = new JTextField();
		campoTexto02 = new JTextField();
		
		//posicionamos los componentes en el panel
		campoTexto01.setBounds(120, 10, 150, 30);
		campoTexto02.setBounds(120, 50, 150, 30);
		
		//con esto agregamos los campos de texto
		add(campoTexto01);
		add(campoTexto02);
		
		//creamos las etiquetas para los cuadros de texto
		etiqueta01 = new JLabel("CUADRO 1");
		etiqueta02 = new JLabel("CUADRO 2");		
		
		etiqueta01.setBounds(70, 10, 150, 20);
		etiqueta02.setBounds(70, 50, 150, 20);
		
		//agrego las etiquetas
		add(etiqueta01);
		add(etiqueta02);
		
		
		//colocamos los componentes a la escucha
		EventosDeFoco foco = new EventosDeFoco();
		
		campoTexto01.addFocusListener(foco);
		
		campoTexto02.addFocusListener(foco);
		
	}
	
	private JTextField campoTexto01, campoTexto02; 
	private JLabel etiqueta01, etiqueta02; 
	
}



