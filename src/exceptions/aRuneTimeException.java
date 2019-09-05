package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aRuneTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 0;
		int result = 0;
		Scanner esc = new Scanner(System.in);
		try {

			// se ejecutará si el usuario sólo ingresa enteros
			System.out.println("primer número: ");
			num1 = esc.nextInt();

			System.out.println("segundo número: ");
			num2 = esc.nextInt();

			try {
				// se ejecutará si no hay errores
				result = num1 / num2;
				System.out.println(num2 + " / " + num2 + " = " + result);
			} catch (Exception e) {
				// esto aparecerá si el usuario intenta dividir por 0
				System.out.println("no se pude dividir por 0 porque da infinito");
			}
			;

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Sólo se puede ingresar enteros");

		}

	}

}
