package viejes.TiendaCelulares;

import java.util.Scanner;

public class tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); // variable para capturar el ingreso de teclado

		System.out.println("Tama�o");
		int tamanio = teclado.nextInt();

		System.out.println("Tipo:");
		String tipo = teclado.next();

		System.out.println("Stock:");
		int stock = teclado.nextInt();

		// contructor con par�metros
		Movil celular = new Movil(tamanio, tipo, stock);

		// Constructor sin par�metros
		Movil celular2 = new Movil();

		System.out.println(celular.getInfo());
		System.out.println(celular2.getInfo());

		System.out.print("\n\nIngrese cantidad de celulares a vender");

		System.out.print(celular.vender(teclado.nextInt()));

	}

}
