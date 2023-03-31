package pre2023.parteYdeParcial01;

import java.io.IOException;
import java.util.Scanner;

class excepciones10Finally {

	public static void main(String[] args) {
		System.out.println("introducir numero");
		Scanner leer = new Scanner(System.in);
		try {
			evaluarNumero(leer.nextInt());
		}
		catch (Pequenio e) {
			e.printStackTrace();
		}
		System.out.println("Fin del programa");
	}
	static void evaluarNumero(int nroEvaluar) throws Pequenio {
		if (nroEvaluar < 100) {
			Pequenio Propia = new Pequenio("numero chico");
			throw Propia;
		}
	}
}
class Pequenio extends IOException {
	public Pequenio() {	}
	public Pequenio(String mensajeError) {
		super(mensajeError);
	}

}
