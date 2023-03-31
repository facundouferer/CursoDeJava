package pre2023.parteYpracticaNro02;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola. 
		 * Los números introducidos se almacenarán en un array.
		 * El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.
		 */
		
		int[] numeros = new int [10];
		int negativos = 0;
		int positivos = 0;
		int ceros = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 10; i++) {
			System.out.println("ingrese el númer "+(i+1));
			numeros[i]= sc.nextInt();
		}
		
		for(int i=0; i < 10; i++) {
			if(numeros[i]>0) {
				positivos++;
			}else {
				if(numeros[i]<0) {
					negativos++;
				}else {
					ceros++;
				}
			}
		}
		
		System.out.println("hay "+positivos+" numeros positivos, "+negativos+" numeros negativos y"+ceros+" ceros.");

	}

}
