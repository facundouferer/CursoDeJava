package parteD01Excepciones;

import java.util.Scanner;

class excepciones03RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			System.out.println("ingresa un número");
			Scanner leer = new Scanner(System.in);
			int nroUno = leer.nextInt();

			System.out.println("ingresa otro número");

			int nroDos = leer.nextInt();

			int resultado = nroUno / nroDos;
			System.out.println(resultado);
			
		} catch (Exception ArithmeticException) {
			// TODO: handle exception
			System.out.println("algo salió mal");
		}
		
		System.out.println("Fin del programa");

	}

}
