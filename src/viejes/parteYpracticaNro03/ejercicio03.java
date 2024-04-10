package viejes.parteYpracticaNro03;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una matriz que contenga datos de personas, siendo cada columna una
		 * persona diferente y cada fila los datos de las mismas.
		 * El esquema de la matriz ser� el siguiente:
		 * 
		 * NOMBRE
		 * DNI
		 * EDAD
		 * 
		 * Los datos para rellenar la matriz deben ser proporcionados por el usuario.
		 * Una vez que se llene todo el arreglo de arreglos se debe mostrar la
		 * informaci�n en la consola de una forma clara.
		 * BONUS: ordenar alfab�ticamente el arreglo.
		 * 
		 */

		String[][] personas = new String[3][3];
		Scanner sc = new Scanner(System.in);

		for (int columna = 0; columna < 3; columna++) {
			System.out.println("NOMBRE: ");
			personas[columna][0] = sc.next();
			System.out.println("DNI: ");
			personas[columna][1] = sc.next();
			System.out.println("EDAD:");
			personas[columna][2] = sc.next();
		}

		for (String columna[] : personas) {
			System.out.println("NOMBRE:" + columna[0]);
			System.out.println("DNI:" + columna[1]);
			System.out.println("EDAD:" + columna[2]);
		}

	}

}
