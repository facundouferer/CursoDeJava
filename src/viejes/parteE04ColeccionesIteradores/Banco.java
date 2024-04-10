package viejes.parteE04ColeccionesIteradores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Ana Juana", "357159", 1000000, 1111111111);
		Cliente cliente2 = new Cliente("Ricardo Ricardo", "987456", 3000, 36987456);
		Cliente cliente3 = new Cliente("Anita Ver�n", "12312", 3000, 36258741);
		Cliente cliente4 = new Cliente("Antonio Lopez", "987456", 3000, 15995120);

		/**
		 * Tirar� error porque hay que importar el paquete Set y porque no se puede
		 * instanciar una interface por lo que hay que instanciar la clase que
		 * implementa la clase Set: HashSet ser�a la ideal porque permite el acceso
		 * aleatorio
		 */

		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();// LA COLECCI�N

		/**
		 * Con esta estructura agregamos a la colecci�n los clientes
		 */
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);

		/**
		 * ITERADORES: Utilizamos la interface Iterator para crear nuestro iterador.
		 * El objeto iterador debe recibir para su creaci�n la colecci�n seguida del
		 * m�todo iterator.
		 */

		Iterator<Cliente> iterador = clientesDelBanco.iterator();

		while (iterador.hasNext()) {
			String elemento = iterador.next().getNombre();
			/**
			 * esto no puede ser ocupado como un foreach ya que cada uso del iterador
			 * nos avanza un lugar y s�lo podemos mostrar un elemento
			 */
			System.out.println(elemento);
		}

		/**
		 * debemos re-asignar al iterador para poder inicializarlo nuevamente, ya que el
		 * recorrido
		 * anterior lo dej� en el final.
		 */

		iterador = clientesDelBanco.iterator();

		/**
		 * ELIMINAR UN ELEMENTO DE LA COLECCI�N:
		 * no se puede eliminar por medio de un foreach porque no se puede leer
		 * un elemento y a la vez eliminarlo
		 */

		while (iterador.hasNext()) {

			String elementoEliminar = iterador.next().getNombre();

			if (elementoEliminar.equals("Ricardo Ricardo")) {
				iterador.remove();
			}
		}

		System.out.println("\n-----DESPUES DE ELIMINAR ELEMENTO---------\n");

		// RECORRER LA COLECCI�N

		for (Cliente clientes : clientesDelBanco) {
			System.out.println(clientes.toString());
		}

	}

}
