package viejes.parteE05ColeccionesLinkeList;

import java.util.LinkedList;
import java.util.ListIterator;

class parte01Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * LinkedList:
		 * 1) Acceso aleatorio
		 * 2) est�n ordenadas
		 * 3) Podemos a�adir y elementos sin restricciones
		 * 4) con un ListIterator podemos modificar en cualquier direcci�n
		 */

		LinkedList<String> personas = new LinkedList<>(); // Con esto, as� de f�cil, se cre una lista enlazada.

		/**
		 * AGREGAR ELEMENTOS A LA LISTA
		 */
		personas.add("Scarlet Witch");
		personas.add("Iron Man");
		personas.add("Gamora");
		personas.add("Capit�n Am�rica");
		personas.add("Capitana Marvel");
		personas.add("Thor");
		personas.add("Black Widow");

		/**
		 * Para saber el tama�o de nuestra linkedList
		 */

		System.out.println("Cantidad de elementos: " + personas.size());

		for (String persona : personas) {
			System.out.println(persona);
		}

		System.out.println("\n--------USANDO EL ITERADOR-----------");

		ListIterator<String> iterador = personas.listIterator();

		/**
		 * AGREGAR UNA PERSONA EN EL LUGAR QUE QUERAMOS
		 */

		iterador.next();
		iterador.add("Ojo de Halc�n");

		for (String persona : personas) {
			System.out.println(persona);
		}

	}

}
