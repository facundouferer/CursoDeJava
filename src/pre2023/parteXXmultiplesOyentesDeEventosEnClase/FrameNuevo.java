package pre2023.parteXXmultiplesOyentesDeEventosEnClase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameNuevo extends JFrame {
	
	private static int contador = 0;
	
	public FrameNuevo(JButton btnCerrar) {
		contador++;
		setTitle("Ventna "+contador);
		setBounds(50*contador, 50*contador, 300, 300);
		btnCerrar.addActionListener(new CerradorDeVentanas());
	}
	
	class CerradorDeVentanas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
			
		}
		
	}

}
