package viejes.parteXXdebugger;

import java.util.Scanner;

public class ParaDepurar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese cantidad de elementos");

		Scanner entrada = new Scanner(System.in);

		int elementos = entrada.nextInt();

		int aleatorio[] = new int[elementos];

		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio[i] = (int) (Math.random() * 100);
		}

		for (int elemento : aleatorio) {
			System.out.println(elemento);
		}

	}

}
