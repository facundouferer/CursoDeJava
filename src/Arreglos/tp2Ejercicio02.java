package Arreglos;

import java.util.Scanner;

public class tp2Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 2: Media en posiciones pares del Array
           En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. 
           Los números se almacenarán en un array y el programa calculará la media de los números 
           introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).
		 */
		
				//se muestra en pantalla el mensaje
				System.out.println("Ingrese los números");
				
				//Se crea la variable que tomará los ingresos de teclado
				Scanner entrada = new Scanner(System.in);
				
				//array donde se guardaran los ingresos del usuario
				int numeros[]= new int[10];
				
				for(int i=0; i<10; i++) {
					// bucle va tomando los ingresos de teclado del usuario y los colocar en el arreglo
					System.out.println(i+") Ingrese el número"+i);
					numeros[i]=entrada.nextInt();
				}
				int pares=0;
				int media=0;
				
				for(int i=0; i<numeros.length; i++) {
					//bucle que recorre el arreglo y analiza los valores
					if(i%2==0 && i!=0) {
						pares++;
						media=media+numeros[i];						
					}
					
				}
				
				//emite un mensaje al usuario con los resultados
				System.out.print("La media de las posiciones pares del array es: "+media/pares);
				

	}

}
