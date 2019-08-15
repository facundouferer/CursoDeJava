package Arreglos;

import java.util.Scanner;

public class tp2Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 1: Almacenar en Array
		 Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola.
		Los números introducidos se almacenarán en un array. 
		El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.
		 */
		int positivos=0; 
		int negativos=0;
		int ceros=0;
		
		//se muestra en pantalla el mensaje
		System.out.println("Ingrese los números");
		
		//Se crea la variable que tomará los ingresos de teclado
		Scanner entrada = new Scanner(System.in);
		
		//array donde se guardaran los ingresos del usuario
		int numeros[]= new int[10];
		
		for(int i=0; i<10; i++) {
			// bucle va tomando los ingresos de teclado del usuario y los colocar en el arreglo
			System.out.println("Ingrese el número para la posición:"+i);
			numeros[i]=entrada.nextInt();
		}
		
		for(int valor:numeros) {
			//bucle que recorre el arreglo y analiza los valores
			if(valor>0) {
				positivos++;
			}else {
				if(valor<0) {
					negativos++;
				}else {
					ceros++;
				}
			}
		}
		
		//emite un mensaje al usuario con los resultados
		System.out.print("hay "+ceros+ "ceros, "+ positivos+" números positivos y "+negativos+" números negativos");
		
		

	}

}
