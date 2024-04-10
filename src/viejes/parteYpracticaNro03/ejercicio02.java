package viejes.parteYpracticaNro03;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por
		 * medio del m�todo random() de la clase Math.
		 * Una vez que se genere el array de array mostrar los elementos cargados
		 * utilizando la consola.
		 */

		int[][] numeros = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numeros[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i[] : numeros) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
