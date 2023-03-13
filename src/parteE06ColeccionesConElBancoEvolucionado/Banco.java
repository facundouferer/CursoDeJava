package parteE06ColeccionesConElBancoEvolucionado;

import java.util.HashSet;
import java.util.Set;

class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1= new Cliente("Ana Juana", "357159", 1000000);
		Cliente cliente2= new Cliente("Ricardo Ricardo", "987456", 3000);
		Cliente cliente3= new Cliente("Rita Pelopincho", "252536", 1000000);
		Cliente cliente4= new Cliente("Juan Perez", "147357", 15000);
		
		/*
		 * Tirará error porque hay que importar el paquete Set
		 * y porque no se puede instanciar una interface
		 * por lo que hay que instanciar la clase que implementa la clase Set:
		 * HashSet sería la ideal porque permite el acceso aleatorio
		 */
		
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();//LA COLECCIÓN
		
		/*
		 * Con esta estructura agregamos a la colección
		 * los clientes
		 */
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		
		/*
		 * Con un foreach podemos recorrer la colección 
		 * de clientes del banco
		 */
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.toString());
		}
		
		System.out.println("-----DESPUES DE ELIMINAR UN ELEMENTO------");
		
		clientesDelBanco.remove(cliente2); //eliminar un elemento
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.toString());
		}
		

	}

}
