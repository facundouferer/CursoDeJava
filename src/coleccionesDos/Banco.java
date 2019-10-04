package coleccionesDos;

import java.util.HashSet;
import java.util.Set;

import coleccionesDos.Clientes;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clientes clietne01 = new Clientes("Gerardo García", 1, 60000);
		Clientes clietne02 = new Clientes("Fulanito de Tal", 2, 7565345);
		Clientes clietne03 = new Clientes("Gerardo García", 1, 60000);
		Clientes clietne04 = new Clientes("Xuxa", 4, 4);

		/*
		 * Para poder realizar la comparación es necesario
		 * que sobreescribamos el método equals
		 */
		
		if(clietne01.equals(clietne03)) System.out.println("SON IGUALES");
		else System.out.println("NO SON IGUALES");

	}

}
