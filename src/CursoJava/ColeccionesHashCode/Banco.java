package CursoJava.ColeccionesHashCode;

import java.util.HashSet;
import java.util.Set;

class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1= new Cliente("Ana Juana", "357159", 1000000, 1111111111);
		Cliente cliente2= new Cliente("Ricardo Ricardo", "987456", 3000, 36987456);
		/**
		 * el hashCode de cliente3 y cliente1 deber�an ser los mismos
		 * significan que los dos son los mismos objetos
		 * que apuntan al mismo espacio de memoria
		 */
		Cliente cliente3= cliente1;
		
		Cliente cliente4= new Cliente("Ricardo Garc�a", "987456", 3000, 36987456);
		
		/**
		 * Tirar� error porque hay que importar el paquete Set y porque no se puede instanciar una interface
		 * por lo que hay que instanciar la clase que implementa la clase Set:
		 * HashSet ser�a la ideal porque permite el acceso aleatorio
		 */
		
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();//LA COLECCI�N
		
		/**
		 * Con esta estructura agregamos a la colecci�n
		 * los clientes
		 */
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		
		if(cliente3.equals(cliente1)) {
			System.out.println("son iguales");
		}else {
			System.out.println("NO son iguales");
			
		}
		System.out.println("IMPRESION DEL HASHCODE");
		System.out.println(cliente3.hashCode());
		System.out.println(cliente1.hashCode());
		
		System.out.println("LISTADO DE CLIENTES");
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.toString());
		}

	}

}
