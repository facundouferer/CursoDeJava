package trabajoPracticoNro07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un programa que pida al usuario introducir un número. 
		 * El programa debe devolver un mensaje especificando si el número introducido 
		 * por el usuario es par o impar. 
		 * Además, el programa debe controlar la excepción si el usuario introduce texto en lugar de un 
		 * valor numérico y debe pedir que ingrese nuevamente el número. Esta acción se repetirá hasta que 
		 * el usuario ingrese un número. El programa se cerrará”, terminando la ejecución del programa 
		 * sin hacer nada más.
		 */
		
		
		
		int seguir = 0;

		while (seguir != 1) {
			
			System.out.println("INGRESE UN NRO: ");
			Scanner entrada = new Scanner(System.in);
			
			try {
				int nro = entrada.nextInt();
				if(nro%2==0){
					System.out.println("EL NRO ES PAR");
	            }else{
	            	System.out.println("EL NRO ES IMPAR ");
	            }
				seguir = 1;
				System.out.println("\n FIN DEL PROGRAMA");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR: ");
			}
			
			System.out.println("\n-------------------------\n");
			
		}
		
				

	}

}


