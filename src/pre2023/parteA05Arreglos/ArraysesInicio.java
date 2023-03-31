package pre2023.parteA05Arreglos;

import java.util.Scanner;

class ArraysesInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] nombres = new String[4];

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese los nombres");

		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=entrada.nextLine();
		}
		
		for (String nombre:nombres) {
			System.out.println(nombre);
		}

	}

}
