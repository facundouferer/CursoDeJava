package parteD02Arreglos;

import java.util.Scanner;

class tp2Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 2: Media en posiciones pares del Array
           En este ejercicio, se pide al usuario que introduzca 10 n�meros enteros por consola. 
           Los n�meros se almacenar�n en un array y el programa calcular� la media de los n�meros 
           introducidos en las posiciones pares del array. (Debes utilizar el operador m�dulo �%�).
		 */
		
				//se muestra en pantalla el mensaje
				System.out.println("Ingrese los n�meros");
				
				//Se crea la variable que tomar� los ingresos de teclado
				Scanner entrada = new Scanner(System.in);
				
				//array donde se guardaran los ingresos del usuario
				int numeros[]= new int[10];
				
				for(int i=0; i<10; i++) {
					// bucle va tomando los ingresos de teclado del usuario y los colocar en el arreglo
					System.out.println(i+") Ingrese el n�mero"+i);
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
