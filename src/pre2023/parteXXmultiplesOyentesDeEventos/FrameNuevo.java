package pre2023.parteXXmultiplesOyentesDeEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameNuevo extends JFrame{
	
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
			dispose(); //éste método se encargará de cerrar todas las ventanas
			
		}
		
		
	}
	
}
