package viejes.parteA07ArreglosOrdenamiento;

public class burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * el m�todo de ordenamiento de burbuja (Bubble sort).
		 * Este m�todo revisa y arregla el orden de cada elemento del arreglo
		 * compar�ndolo con el siguiente. El proceso se repite varias veces
		 * hasta que se hayan verificado todos los elementos, ya no sean
		 * necesarios m�s cambios y el arreglo se encuentre ordenado.
		 */

		int arreglo[] = { 5, 3, 2, 99, 10, 12 };

		// m�todo manual de ordenamiento de mayor a menor
		for (int x = 0; x < arreglo.length; x++) {
			for (int i = 0; i < arreglo.length - x - 1; i++) {
				if (arreglo[i] < arreglo[i + 1]) {
					int tmp = arreglo[i + 1];
					arreglo[i + 1] = arreglo[i];
					arreglo[i] = tmp;
				}
			}
		}
		for (int elemento : arreglo) {
			System.out.print(elemento + " ");
		}

	}

}
