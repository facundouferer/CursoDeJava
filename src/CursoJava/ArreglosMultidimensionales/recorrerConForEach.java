package CursoJava.ArreglosMultidimensionales;

public class recorrerConForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 },
		};

		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + " ");
			}
			System.out.println("");
		}
	}
}
