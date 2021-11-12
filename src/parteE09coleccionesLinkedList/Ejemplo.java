package parteE09coleccionesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * EJEMPLO 1: Agregar entre cada país su capital correspondiente
		 */

		LinkedList<String> paises = new LinkedList<String>();

		paises.add("Espania");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");

		LinkedList<String> capitales = new LinkedList<String>();

		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");

		// VER LA LISTA ENLAZADA
		System.out.println("Paises: " + paises);
		System.out.println("Capitales: " + capitales);

		// CREACIÓN DE LOS ITERADORES
		ListIterator<String> itPaises = paises.listIterator();
		ListIterator<String> itCapitales = capitales.listIterator();

		while (itCapitales.hasNext()) {

			if (itPaises.hasNext()) {
				itPaises.next();
				itPaises.add(itCapitales.next());
			}

		}

		// VER LA LISTA ENLAZADA
		System.out.println("Paises y Capitales: " + paises);
		
		/*
		 * EJEMPLO 2: 
		 * Eliminar de la lista de capitales las
		 * posiciones pares. 
		 * Para ello deberemos colocar al principio
		 * el iterador que luego de las operaciones
		 * anteriores se encuentra al final.
		 * Para ello debemos iniciarlo nuevamente.
		 */
		
		//INICIAR NUEVAMENTE EL ITERADOR DE CAPITALES
		
		itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			itCapitales.next();
			if(itCapitales.hasNext()) {
				itCapitales.next();
				itCapitales.remove();
			}
		}
		
		System.out.println("Capitales: " + capitales);

	}

}
