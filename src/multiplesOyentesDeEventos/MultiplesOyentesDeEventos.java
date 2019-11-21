package multiplesOyentesDeEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MultiplesOyentesDeEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FramePrincipal ventana = new FramePrincipal();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setVisible(true);

	}

}

class FramePrincipal extends JFrame{
	
	public FramePrincipal() {
		
		setTitle("Multiples Oyentes de Eventos");
		
		setBounds(700, 5, 400, 300);
		
		PanelPrincipal panel = new PanelPrincipal();
		
		add(panel);
		
	}
	
}

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
