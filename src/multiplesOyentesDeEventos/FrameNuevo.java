package multiplesOyentesDeEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameNuevo extends JFrame{
	
	/*
	 * Creamos una variable stática para que
	 * sea común a todas las instancias
	 * de ésta clase
	 */
	
	private static int contador = 0;
	
	public FrameNuevo(JButton botonCerrar) {
		
		contador++;
		setTitle("Ventana "+contador);
		setBounds(50*contador, 50*contador, 300, 300);
		
		botonCerrar.addActionListener(new CerrarVentanas());
		
	}
	
	private class CerrarVentanas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			/*el método dispose(); se encarga de cerrar
			 * la ventana, sus hijos y libera todos
			 * los recursos que está utilizando. 
			 * en pocas palabras, cierra la ventana
			 */
			
			dispose();
		}
		
	}

}
