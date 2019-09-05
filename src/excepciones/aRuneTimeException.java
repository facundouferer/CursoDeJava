package excepciones;

import java.io.IOException;
import java.util.Scanner;

public class aRuneTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, result;
		Scanner esc = new Scanner(System.in);
		System.out.println("primer numero: ");
		num1 = esc.nextInt();
		System.out.println("Segundo numero: ");
		num2 = esc.nextInt();
		
		try {
			result = num1/num2;
			System.out.print("Resultado: "+result);
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.print("SE HA PRODUCIDO UN ERROR");
		}

	}

}
