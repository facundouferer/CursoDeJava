package POO;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tamaño");
		int tamanio = teclado.nextInt();
		
		System.out.println("Tipo:");
		String tipo = teclado.next();
		
		//contructor
		Movil celular = new Movil(tamanio, tipo);
		Movil celular2 = new Movil();
		
		System.out.println(celular.getInfo());
		System.out.println(celular2.getInfo());

	}

}
