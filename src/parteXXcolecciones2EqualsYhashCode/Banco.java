package parteXXcolecciones2EqualsYhashCode;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clientes cliente01 = new Clientes("Gerardo García", 1, 60000);
		Clientes cliente02 = new Clientes("Fulanito de Tal", 2, 7565345);
		Clientes cliente03 = new Clientes("Gerardo García", 1, 60000);
		Clientes cliente04 = new Clientes("Xuxa", 4, 4);

		/*
		 * Para poder realizar la comparación es necesario
		 * que sobreescribamos el método equals
		 */
		
		cliente01 = cliente03;
		
		if(cliente01.equals(cliente03)) System.out.println("SON IGUALES");
		else System.out.println("NO SON IGUALES");
		
		/*
		 * hashCode: código irrepetebile de un objeto. Si dos objetos tienen
		 * hashCode distintis, es decir que están almacenados en lugares distintos
		 * de la memoria, que son objetos distintos, auqneit todos sus campor
		 * tuvieran los mismos datos. 
		 */
		
		System.out.println(cliente01.getNombre()+": "+cliente01.hashCode());
		System.out.println(cliente03.getNombre()+": "+cliente03.hashCode());

	}

}
