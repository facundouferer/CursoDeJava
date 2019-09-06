package excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class dThrowsCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");

		Scanner entrada = new Scanner(System.in);
		int decision = entrada.nextInt();

		if (decision == 1) {			
			//AGREGUÉ: try-catch
			try {
				pedirDatos();				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR EN EL INGRESO DE DATOS.");
			}
		} else {
			System.out.println("Adios");
			System.exit(0);
		}
		entrada.close();
		System.out.println("Hemos terminado");
	}

	//AGREGUÉ: throws InputMismatchException -> aqui colocar try-catch en la llamada al método es opcional
	//Se puede agregar IOException -> aqui colocar try-catch en la llamada al metodo es obligatoria
	
	static void pedirDatos() throws InputMismatchException{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario = entrada.nextLine();
		System.out.println("Introduce edad, por favor");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad + 1) + " años");
		entrada.close();

	}

}
