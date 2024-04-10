package viejes.excepciones;

import java.util.Scanner;

class excepciones01RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingresa un n�mero");
		Scanner leer = new Scanner(System.in);
		/**
		 * Si en vez de n�meros se ingresa letras se producir� una RuntimeException
		 * RuntimeException es una Excepciones no comprobada y DEBEN SER PREVISTAS POR
		 * EL PROGRAMADOR.
		 */
		int nroUno = leer.nextInt();

		System.out.println("ingresa otro n�mero");
		int nroDos = leer.nextInt();

		int resultado = nroUno / nroDos;
		System.out.println(resultado);

		System.out.println("Fin del programa");

	}

}
