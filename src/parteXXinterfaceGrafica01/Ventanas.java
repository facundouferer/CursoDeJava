package parteXXinterfaceGrafica01;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventanas extends JFrame {

	public Ventanas() {

		// por defecto es invisible y tiene 0 tamanio
		// indica el tamanio de la ventana
		setSize(600, 350); 
		
		/* 
		 * Para elegir tamaño también se puede utilizar serBounds donde colocamos
		 * tanto el tamanio como la posición de la imagen
		 * setBounds(x, y, width, height);
		 */

		// indica que pasará cuando apretemos el boton X
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// POSICIÓN DE LA VENTANA
		//setLocation(100, 100); //colocamos la ventana donde queramos
		setLocationRelativeTo(null); //si tiene null nos coloca la ventana justo en el centro
		
		//setResizable(false); //Impide la maximización o la redimensión
		
		//COLOCAR UN ÍCONO PERSONALIZADO A MI VENTANA
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image icono = sistema.getImage("gatito.png");
		setIconImage(icono);
		
		setTitle("Mi primer Ventana"); //coloca el título a la venta

		// hace visible el Frame. Siempre colocarlo en último lugar
		setVisible(true);
		
		PrimerPanel lamina= new PrimerPanel();
		add(lamina);

	}

}
