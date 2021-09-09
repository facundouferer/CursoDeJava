package parteXXArreglos;

import java.util.Scanner;

class tp2Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 1: Almacenar en Array
		 Desarrollar un programa que pida al usuario que introduzca 10 n�meros enteros por consola.
		Los n�meros introducidos se almacenar�n en un array. 
		El programa imprime en consola cu�ntos n�meros negativos, positivos y valores 0 hay en el array.
		 */
		int positivos=0; 
		int negativos=0;
		int ceros=0;
		
		//se muestra en pantalla el mensaje
		System.out.println("Ingrese los n�meros");
		
		//Se crea la variable que tomar� los ingresos de teclado
		Scanner entrada = new Scanner(System.in);
		
		//array donde se guardaran los ingresos del usuario
		int numeros[]= new int[10];
		
		for(int i=0; i<10; i++) {
			// bucle va tomando los ingresos de teclado del usuario y los colocar en el arreglo
			System.out.println("Ingrese el n�mero para la posici�n:"+i);
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
		System.out.print("hay "+ceros+ "ceros, "+ positivos+" n�meros positivos y "+negativos+" n�meros negativos");
		
		

	}

}
