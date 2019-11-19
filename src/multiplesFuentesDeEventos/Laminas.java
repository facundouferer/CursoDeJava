package multiplesFuentesDeEventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import multiplesFuentesDeEventos.Laminas.EventoModificarColor;

class Laminas extends JPanel{
	
	public Laminas() {
		
		EventoModificarColor colorRojo = new EventoModificarColor("rojo", Color.RED);
		EventoModificarColor colorAmarillo = new EventoModificarColor("amarillo", Color.YELLOW);
		EventoModificarColor colorVerde = new EventoModificarColor("Verde", Color.GREEN);
		
		add(new JButton(colorRojo));
		add(new JButton(colorAmarillo));
		add(new JButton(colorVerde));
		
		/*
		 * PASO UNO: Crear mapa de entrada
		 */
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);  
		
		/*
		 * PASO DOS: Crear la combinación de teclas a utilizar.
		 */
		
		KeyStroke teclaRoja = KeyStroke.getKeyStroke("ctrl R");
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaVerde = KeyStroke.getKeyStroke("ctrl V");
		
		/*
		 * PASO TRES: Asignar combinación de teclas a objetos
		 */
		
		mapaEntrada.put(teclaRoja, "Poner fondo en Rojo");
		mapaEntrada.put(teclaAmarillo, "Poner fondo en Amarillo");
		mapaEntrada.put(teclaVerde, "Poner fondo en Verde");
		
		/*
		 * PASO CUATRO: Asignar objetos a acciones.
		 */
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("Poner fondo en Rojo", colorRojo);
		mapaAccion.put("Poner fondo en Amarillo", colorAmarillo);
		mapaAccion.put("Poner fondo en Verde", colorVerde);
	}
	
	//Clase interna
	
	class EventoModificarColor extends AbstractAction{

		public EventoModificarColor(String nombre, Color colorFondo) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SHORT_DESCRIPTION, " pone el color en " + nombre);
			
			putValue("color", colorFondo);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Color c=(Color) getValue("color"); //hay que castear para transformar color a un objeto
			setBackground(c);
			System.out.println(getValue(Action.NAME)+ ": "+getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
	
}