package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gVariasExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		int resultado = 0;
		
		Scanner esc = new Scanner(System.in);
		System.out.println("ingrese el 1er Nro: ");
		try {
			
			num1 = esc.nextInt();
			System.out.println("ingrese el 1er Nro: ");
			num2 = esc.nextInt();			
			resultado = num1/num2;	
			
		} catch (InputMismatchException e) {
			
			// TODO: handle exception
			System.out.println("no ingresó números");
			
		} catch (ArithmeticException e) {
			
			System.out.println("no se puede dividir por 0");
			
		}
		
		
	}

}
