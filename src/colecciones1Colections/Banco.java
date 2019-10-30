package colecciones1Colections;

import java.util.HashSet;
import java.util.Set;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clientes clietne01 = new Clientes("Gerardo García", "00001", 60000);
		Clientes clietne02 = new Clientes("Fulanito de Tal", "00002", 7565345);
		Clientes clietne03 = new Clientes("Fulanita de Tal", "00003", 40000);
		Clientes clietne04 = new Clientes("Xuxa", "00004", 908123);
		
		clietne01 = clietne02;
		System.out.println(clietne01.hashCode());
		System.out.println(clietne02.hashCode());
		System.out.println("-------------------");

		/*
		 * Preguntarse que es lo que queremos que haga nuestra colección al futuro
		 * para poder elegir la clase de colecciones que debemos elegir.
		 * En el caso de este egemplo esto es lo que se ha considerado: 
		 * Repetir clientes -> NO
		 * Permitir Borrar -> NO
		 * Sólo Lectura -> NO
		 * Estas necesidades que se ha establecido nos indica que debemos elegir
		 * el tipo de colección Set con la clase HashSet
		 */
		
		Set<Clientes> clientesBanco = new HashSet<Clientes>();	//creación de la colección
		
		/*
		 * AGregar elementos a la colección
		 */
		
		clientesBanco.add(clietne01); //agregar elemento a la colección
		clientesBanco.add(clietne02);
		clientesBanco.add(clietne03);
		clientesBanco.add(clietne04);
		
		/*
		 * Recorrer colecciones es más óptimo con el bloque for-each
		 */
		
		for (Clientes cliente : clientesBanco) {
			//mostrar el elemento
			System.out.println(cliente.getNombre()+" "+cliente.getNroCuenta()+" $ "+cliente.getSaldo());
			System.out.println(cliente.hashCode());
		}
		
	}

}
