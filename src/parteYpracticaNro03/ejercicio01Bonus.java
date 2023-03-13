package parteYpracticaNro03;

import java.util.Random;

public class ejercicio01Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100. 
		 * El programa debe imprimir en consola todos los valores almacenados en el array. 
		 * Utiliza un bucle for-each para leer los valores almacenados. (Debes utilizar el método random() 
		 * de la clase Math para poder rellenar los elementos del array.
		 * BONUS: Verificar que el número no se repita.
		 */
		
		int[] numeros = new int[100];
		Random randomizer = new Random(System.nanoTime());
		for(int i=0; i < numeros.length; i++) {
			//para que no se repita el número
			numeros[i]= randomizer.nextInt(numeros.length);
		}
		
		for(int elemento:numeros) {
			System.out.print(elemento+", ");
		}

	}

}
