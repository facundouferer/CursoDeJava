package pre2023.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

class excepciones05Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);

			try {
				realizarDivision();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("ingreso un valor que no va");
				/**
				 * e.printStackTrace sirve para que veamos el error
				 */
				System.out.println("ERROR!");
				e.printStackTrace();
			}

		System.out.println("Fin del programa");
	}

	/**
	 * el metodo que lleva la clasusula throws es el método que es suseptible de producir errores
	 * Si la excepción es NO CONTROLADA throw no nos obliga a capturar la escepción pero si la excepción es CONTROLADA
	 * al colocar throw en el método cuando lo llamemos deveremos capturar la excepción.
	 */

	static void realizarDivision() throws InputMismatchException{

		Scanner leer = new Scanner(System.in);

		System.out.println("ingresa un número");
		int nroUno = leer.nextInt();

		System.out.println("ingresa otro número");
		int nroDos = leer.nextInt();

		int resultado = nroUno / nroDos;
		System.out.println("el resultado es "+resultado);

	}

}
