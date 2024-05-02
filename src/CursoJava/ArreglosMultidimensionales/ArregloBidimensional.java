package CursoJava.ArreglosMultidimensionales;

public class ArregloBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[4][3];

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;

		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;

		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;

		matriz[3][0] = 10;
		matriz[3][1] = 11;
		matriz[3][2] = 12;

		// de esta forma podemos mostrar el contenido de forma vertical
		System.out.println("MOSTRAR DE FORMA VERTICAL");

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.println(matriz[x][y] + " (" + x + "," + y + ")");
			}
		}

		// Para mostrar el contenido de forma matricial lo hacemos as�
		System.out.println("MOSTRAR COMO MATRIZ");

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println("");
		}

	}

}
