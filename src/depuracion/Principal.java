package depuracion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("introduce la cantidad de elementos de la matriz");
		
		Scanner entrada = new Scanner(System.in);
		int elementos = entrada.nextInt();
		
		int num_aleat[] = new int[elementos];
		
		for(int i=0; i<num_aleat.length; i++) {
			
			num_aleat[i]= (int) Math.random()*100;
		}
		
		for(int elem: num_aleat) {
			System.out.println(elem);
		}
	}

}
