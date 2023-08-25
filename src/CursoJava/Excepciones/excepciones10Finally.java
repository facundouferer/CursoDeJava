package CursoJava.Excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class excepciones10Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introducir numero");
		Scanner leer = new Scanner(System.in);

		try {
			evaluarNumero(leer.nextInt());
		} catch (NumeroPequenio e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del programa");
	}

	static void evaluarNumero(int nroEvaluar) throws NumeroPequenio {
		if (nroEvaluar < 100) {
			NumeroPequenio miPropiaExcepcion = new NumeroPequenio("numero chico");
			throw miPropiaExcepcion;
		}
	}
}

class NumeroPequenio extends IOException {

	public NumeroPequenio() {
	}

	public NumeroPequenio(String mensajeError) {
		super(mensajeError);
	}

}
