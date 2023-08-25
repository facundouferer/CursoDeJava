package CursoJava.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

class excepciones09CapturarVariasExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introducir numero");
		Scanner leer = new Scanner(System.in);
		
		try {
			int numero = leer.nextInt();
			System.out.println("el Numero ingresado es "+numero);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}finally {
			/**
			 * Esta instrucci�n se reliza SIEMPRE. es necesaria
			 * y, tal vez no tanto, pero esta bien hacerla. como por ejemplo 
			 * cerrar el Scanner
			 */
			leer.close();
			System.out.println("FIN DEL PROGRAMA");
		}
		
	}

}
