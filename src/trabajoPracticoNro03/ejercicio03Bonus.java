package trabajoPracticoNro03;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio03Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una matriz que contenga datos de personas, siendo cada columna una
		 * persona diferente y cada fila los datos de las mismas. El esquema de la
		 * matriz será el siguiente:
		 * 
		 * NOMBRE DNI EDAD
		 * 
		 * Los datos para rellenar la matriz deben ser proporcionados por el usuario.
		 * Una vez que se llene todo el arreglo de arreglos se debe mostrar la
		 * información en la consola de una forma clara. BONUS: ordenar alfabéticamente
		 * el arreglo.
		 * 
		 */

		String[][] personas = new String[3][3];
		Scanner sc = new Scanner(System.in);

		// Carga de datos
		for (int columna = 0; columna < 3; columna++) {
			System.out.print("NOMBRE: ");
			personas[0][columna] = sc.next();
			System.out.print("DNI: ");
			personas[1][columna] = sc.next();
			System.out.print("EDAD:");
			personas[2][columna] = sc.next();
			System.out.print("\n");
		}

		// muestra de los datos según la carga original
		System.out.println("\nMATRIZ ORIGINAL");
		System.out.println("NOMBRE \t\t DNI \t\t EDAD");
		for (String columna[] : personas) {
			for (String elemento : columna) {
				System.out.print(elemento + "\t\t");
			}
			System.out.println(" ");
		}

		// ordenamiento de la matriz
		
		for (int x = 0; x < 3 - 1; x++) {
			for (int y = x + 1; y < 3; y++) {
				if (personas[0][x].compareTo(personas[0][y]) > 0) {
					for (int j = 0; j < 3; j++) {
						String temp = personas[j][x];
						personas[j][x] = personas[j][y];
						personas[j][y] = temp;
					}
				}
			}
		}

		// Muestra la matriz ordenada 
		System.out.println("\nMATRIZ ORDENADA");
		System.out.println("NOMBRE \t\t DNI \t\t EDAD");
		for (String columna[] : personas) {
			for (String elemento : columna) {
				System.out.print(elemento + "\t\t");
			}
			System.out.println(" ");
		}

	}

}
