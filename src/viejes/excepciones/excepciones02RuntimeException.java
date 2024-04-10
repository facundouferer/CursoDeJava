package viejes.excepciones;

import java.util.Scanner;

class excepciones02RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingresa un n�mero");
		Scanner leer = new Scanner(System.in);
		int nroUno = leer.nextInt();

		System.out.println("ingresa otro n�mero");

		int nroDos = leer.nextInt();

		try {
			int resultado = nroUno / nroDos;
			System.out.println(resultado);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ALGO SALI� MAL!");
		}

		System.out.println("Fin del programa");

	}

}