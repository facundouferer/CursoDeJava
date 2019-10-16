package colecciones3EqualsYhashCode;

import java.util.HashSet;
import java.util.Set;

import colecciones2EqualsYhashCode.Clientes;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clientes cliente01 = new Clientes("Gerardo García", 1, 60000);
		Clientes cliente02 = new Clientes("Gerardo García", 1, 60000);

		
		Set<Clientes> clientesBanco = new HashSet<Clientes>();	//creación de la colección

		clientesBanco.add(cliente01); 
		clientesBanco.add(cliente02);
		
		for (Clientes clientes : clientesBanco) {
			System.out.println(clientes.getNombre()+": "+clientes.hashCode());
		}

	}

}
