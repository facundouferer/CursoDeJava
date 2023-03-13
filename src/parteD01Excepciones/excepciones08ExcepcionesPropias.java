package parteD01Excepciones;

import java.io.IOException;
import java.util.Scanner;

class excepciones08ExcepcionesPropias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introducir numero");
		Scanner leer = new Scanner(System.in);

		try {
			evaluarNumero(leer.nextInt());
		} catch (LongitudDelNumero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Fin del programa");
	}

	static void evaluarNumero(int nroEvaluar) throws LongitudDelNumero {

		if (nroEvaluar < 100) {
			/*
			 * Si le pasamos un parametro String al error
			 * estaremos ocupadno el constructor que recibe un parámetro
			 * también podemos utilizar el otro constructor.
			 */
			LongitudDelNumero miPropiaExcepcion = new LongitudDelNumero("numero chico");
			throw miPropiaExcepcion;
		}
	}
}

/**
 * clase que consruya ESCEPCIONES PROPIAS pueden heredar de RuntimeException o IOException
 * lo ideal es utilizar IOException para obligar a cubrir el método de la posible excepción
 * con try-catch
 */

class LongitudDelNumero extends IOException {
	/**
	 * las clases con las que se construyen las excepciones deben tener 2
	 * CONSTRUCTORES: - Uno por defécto sin parámetros ni ´codigo - Uno que puede
	 * tener un parametro.
	 */

	public LongitudDelNumero() {
	}

	public LongitudDelNumero(String mensajeError) {
		super(mensajeError);
	}

}
