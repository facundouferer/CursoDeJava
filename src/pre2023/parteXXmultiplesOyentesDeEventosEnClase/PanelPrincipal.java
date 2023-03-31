package pre2023.parteXXmultiplesOyentesDeEventosEnClase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelPrincipal extends JPanel{
	
	JButton btnCerrarTodo = new JButton("Cerrar todo");
	
	public PanelPrincipal() {
		JButton btnNuevo = new JButton("Nuevo");
		add(btnNuevo);
		add(btnCerrarTodo);
		btnNuevo.addActionListener(new CreadorDeVentnas());
	}
	
	class CreadorDeVentnas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameNuevo ventanaNueva = new FrameNuevo(btnCerrarTodo);
			ventanaNueva.setVisible(true);
		}
		
		
		
	}

}
