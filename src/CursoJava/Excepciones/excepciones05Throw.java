package CursoJava.Excepciones;

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
	 * el metodo que lleva la clasusula throws es el m�todo que es suseptible de producir errores
	 * Si la excepci�n es NO CONTROLADA throw no nos obliga a capturar la escepci�n pero si la excepci�n es CONTROLADA
	 * al colocar throw en el m�todo cuando lo llamemos deveremos capturar la excepci�n.
	 */

	static void realizarDivision() throws InputMismatchException{

		Scanner leer = new Scanner(System.in);

		System.out.println("ingresa un n�mero");
		int nroUno = leer.nextInt();

		System.out.println("ingresa otro n�mero");
		int nroDos = leer.nextInt();

		int resultado = nroUno / nroDos;
		System.out.println("el resultado es "+resultado);

	}

}
