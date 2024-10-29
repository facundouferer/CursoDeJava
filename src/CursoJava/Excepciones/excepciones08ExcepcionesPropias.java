package CursoJava.Excepciones;

import java.io.IOException;
import java.util.Scanner;

class excepciones08ExcepcionesPropias {

	public static void main(String[] args) {
		System.out.println("introducir numero");
		Scanner leer = new Scanner(System.in);

		try {
			evaluarNumero(leer.nextInt());
		} catch (LongitudDelNumero e) {
			e.printStackTrace();
		}

		System.out.println("Fin del programa");
	}

	static void evaluarNumero(int nroEvaluar) throws LongitudDelNumero {

		if (nroEvaluar < 100) {
			LongitudDelNumero miPropiaExcepcion = new LongitudDelNumero("número chico");
			throw miPropiaExcepcion;
		}
	}
}

class LongitudDelNumero extends IOException {

	public LongitudDelNumero() {
	}

	public LongitudDelNumero(String mensajeError) {
		super(mensajeError);
	}

}
