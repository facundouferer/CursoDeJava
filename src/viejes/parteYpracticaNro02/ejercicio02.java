package viejes.parteYpracticaNro02;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En este ejercicio, se pide al usuario que introduzca 10 n�meros enteros por
		 * consola.
		 * Los n�meros se almacenar�n en un array y el programa calcular� la media de
		 * los n�meros
		 * introducidos en las posiciones pares del array. (Debes utilizar el operador
		 * m�dulo �%�).
		 */

		int[] numeros = new int[10];
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		double cantidad = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("ingrese el nro " + (i + 1));
			numeros[i] = sc.nextInt();
			if (i % 2 == 0) {
				cantidad++;
				suma = suma + numeros[i];
			}
		}
		System.out.println("media: " + (suma / cantidad));
	}

}
