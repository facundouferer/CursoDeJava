package viejes.parteYpracticaNro07;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un programa que pida al usuario introducir un n�mero.
		 * El programa debe devolver un mensaje especificando si el n�mero introducido
		 * por el usuario es par o impar.
		 * Adem�s, el programa debe controlar la excepci�n si el usuario introduce texto
		 * en lugar de un
		 * valor num�rico y debe pedir que ingrese nuevamente el n�mero. Esta acci�n se
		 * repetir� hasta que
		 * el usuario ingrese un n�mero. El programa se cerrar�, terminando la ejecuci�n
		 * del programa
		 * sin hacer nada m�s.
		 */

		int seguir = 0;

		while (seguir != 1) {

			System.out.println("INGRESE UN NRO: ");
			Scanner entrada = new Scanner(System.in);

			try {
				int nro = entrada.nextInt();
				if (nro % 2 == 0) {
					System.out.println("EL NRO ES PAR");
				} else {
					System.out.println("EL NRO ES IMPAR ");
				}
				seguir = 1;
				System.out.println("\n FIN DEL PROGRAMA");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR: ");
			}

			System.out.println("\n-------------------------\n");

		}

	}

}
