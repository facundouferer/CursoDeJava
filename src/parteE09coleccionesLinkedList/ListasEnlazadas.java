package parteE09coleccionesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListasEnlazadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> personas = new LinkedList<String>();

		personas.add("Tony Stark");
		personas.add("Nick Fiury");
		personas.add("Black Widow");
		personas.add("Red Wich");

		// VER EL TAMAÑO DE LA LISTA
		System.out.println("Tamaño de la Lista: " + personas.size());

		// RECORDIDO CON FOR-EACH
		for (String persona : personas) {
			System.out.println(persona);
		}

		// UTILIZANDO UN ITERADOR
		System.out.println("-----------------------\n");
		
		ListIterator<String> iterador = personas.listIterator();

		// agregar un elemento en medio de dos elementos
		iterador.next();
		iterador.add("Capitan America");

		for (String persona : personas) {
			System.out.println(persona);
		}

	}

}
