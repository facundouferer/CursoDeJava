package CursoJava.ArreglosMultidimensionales;

public class rellenarAregloBisConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int[] dimension1 : matriz) {
			for (int elemento : dimension1) {
				System.out.print(elemento + " ");
			}
			System.out.println("");
		}

	}

}
