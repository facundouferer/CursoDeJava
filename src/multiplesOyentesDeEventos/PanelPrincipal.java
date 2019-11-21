package multiplesOyentesDeEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelPrincipal extends JPanel{
	
	/*
	 * Instanciamos el boton cerrar fuera del constructor
	 * para que sea accesible para todos los métodos de la clase. 
	 */
	
	JButton btnCerrar = new JButton("Cerrar todo");
	
	public PanelPrincipal() {
		
		JButton btnNuevo = new JButton("Nuevo");
		add(btnNuevo);		
		
		add(btnCerrar);
		
		btnNuevo.addActionListener(new CreardoraDeVentanas());
		
	}
	
	private class CreardoraDeVentanas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			/* 
			 * Esto permitirá crear una ventana nueva cada vez
			 * que se pulse el botón Nuevo
			 */
			
			FrameNuevo nuevoFrame = new FrameNuevo(btnCerrar);
			
			nuevoFrame.setVisible(true);
			
		}
		
	}

}
