package parteD01Excepciones;

import java.util.Scanner;

class excepciones07Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introducir numero");

		Scanner leer = new Scanner(System.in);

		try {
			evaluarNumero(leer.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin del programa");
	}

	/*
	 * NO es bueno hacer Exceptions tan gen�ricas
	 * si ninguna excepci�n se adapta a nuestro programa
	 * debemos dise�ar nuestra propia excepci�n.
	 */
	static void evaluarNumero(int nroEvaluar) throws Exception {

		if (nroEvaluar < 100) {
			throw new Exception("numero muy chico");
		}
	}
}
