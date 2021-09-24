package parteXXcolecciones4Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clientes cliente01 = new Clientes("Gerardo García", 1, 60000);
		Clientes cliente02 = new Clientes("Ricardo Molinari", 3, 41234123);
		Clientes cliente03 = new Clientes("Alicia Dublerdor", 1, 124343);
		Clientes cliente04 = new Clientes("Rita Sabarese", 5, 12314412);

		Set<Clientes> clientesBanco = new HashSet<Clientes>(); // creación de la colección

		clientesBanco.add(cliente01);
		clientesBanco.add(cliente02);
		clientesBanco.add(cliente03);
		clientesBanco.add(cliente04);

		/*
		 * Utilizamos la interface Iterator para crear nuestro iterador. el objeto
		 * iterador debe recibir para su creación la colección seguida del método
		 * iterator
		 */

		Iterator<Clientes> iterador = clientesBanco.iterator();

		// ELIMINAR UN ELEMENTO DE LA COLECCIÓN
		while (iterador.hasNext()) {
			
			String elementoEliminar = iterador.next().getNombre();
			
			if (elementoEliminar.equals("Gerardo García"))
				iterador.remove();
		}

		//RECORRER LA COLECCIÓN
		for (Clientes clientes : clientesBanco) {
			System.out.println(clientes.toString());
		}

	}

}
