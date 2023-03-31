package pre2023.parteYpracticaNro03;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola.
		 * Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor.
		 */
		
		int [][] matriz = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("( "+i+", "+j+") ");
				matriz [i][j]=sc.nextInt();
			}
			System.out.print("");
		}
				
		//Ordenamiento de la matriz	utilizando el metodo burbuja
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int x=0; x<3; x++) {
					for(int y=0; y<3; y++) {
						if(matriz[i][j] < matriz [x][y]) {
							int temp = matriz[i][j];
							matriz[i][j] = matriz[x][y];
							matriz[x][y] = temp; 
						}
					}
				}
			}
		}
		
		System.out.println("\n MATRIZ ORDENADA \n");
		
		for(int i[]:matriz) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
