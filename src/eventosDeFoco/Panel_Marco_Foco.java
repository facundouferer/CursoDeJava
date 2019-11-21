package eventosDeFoco;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import eventosDeFoco.Panel_Marco_Foco.EventosDeFoco;

class Panel_Marco_Foco extends JPanel {
	
	private JTextField campoTexto01, campoTexto02, campoTexto03; 
	private JLabel etiqueta01, etiqueta02, etiqueta03; 

	public void paintComponent(Graphics g) {		
		
		super.paintComponent(g);
		
		//creamos los campos de texto
		campoTexto01 = new JTextField();
		campoTexto02 = new JTextField();
		campoTexto03 = new JTextField();
		
		//posicionamos los componentes en el panel
		campoTexto01.setBounds(120, 10, 150, 30);
		campoTexto02.setBounds(120, 50, 150, 30);
		campoTexto03.setBounds(120, 90, 150, 30);
		
		//con esto agregamos los campos de texto
		add(campoTexto01);
		add(campoTexto02);
		add(campoTexto03);
		
		//creamos las etiquetas para los cuadros de texto
		etiqueta01 = new JLabel("CUADRO 1");
		etiqueta02 = new JLabel("CUADRO 2");
		etiqueta03 = new JLabel("CUADRO 3");
		
		etiqueta01.setBounds(40, 10, 150, 20);
		etiqueta02.setBounds(40, 50, 150, 20);
		etiqueta03.setBounds(40, 90, 150, 20);
		
		//agrego las etiquetas
		add(etiqueta01);
		add(etiqueta02);
		add(etiqueta03);
		
		
		//colocamos los componentes a la escucha
		EventosDeFoco foco = new EventosDeFoco();
		
		campoTexto01.addFocusListener(foco);		
		campoTexto02.addFocusListener(foco);		
		campoTexto03.addFocusListener(foco);

	}
	
	//con esto vamos a poder ver los focos
		class EventosDeFoco implements FocusListener{

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()==campoTexto01) {
					System.out.println("EL CUADRO 1 GANO EL FOCO.");
				}
				
				if(e.getSource()==campoTexto02) {
					System.out.println("EL CUADRO 2 GANO EL FOCO.");
				}
				
				if(e.getSource()==campoTexto03) {
					System.out.println("EL CUADRO 3 GANO EL FOCO.");
				}
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()==campoTexto01) {
					System.out.println("EL CUADRO 1 PERDIÓ EL FOCO.");
				}
				
				if(e.getSource()==campoTexto02) {
					System.out.println("EL CUADRO 2 PERDIÓ EL FOCO.");
				}
				
				if(e.getSource()==campoTexto03) {
					System.out.println("EL CUADRO 3 PERDIÓ EL FOCO.");
				}
				
			}
			
			
		}
	
}

    