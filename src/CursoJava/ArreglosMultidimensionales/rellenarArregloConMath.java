package CursoJava.ArreglosMultidimensionales;

public class rellenarArregloConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] matriz = new int[100];

		for (int i = 0; i < 100; i++) {
			matriz[i] = (int) (Math.random() * 100);
		}

		for (int elemento : matriz) {
			System.out.print(elemento + " ");
		}
	}

}
