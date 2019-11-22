package multiplesOyentesDeEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelPrincipal extends JPanel{
	
	/*
	 * instanciamos el botón cerrar fuera del constructor
	 * para que sea accesible para todos los métodos de la clase
	 */
	
	JButton btnCerrar = new JButton("cerrar todo");
	
	public PanelPrincipal() {
		
		JButton btnNuevo = new JButton("Nuevo");
		
		add(btnNuevo);
		add(btnCerrar);
		
		btnNuevo.addActionListener(new CreadorDeVentanas());
		
	}
	
	private class CreadorDeVentanas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameNuevo nuevoFrame = new FrameNuevo(btnCerrar);
			
			nuevoFrame.setVisible(true);
			
		}
		
	}
	
}