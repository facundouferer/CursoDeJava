package parteYPracticoNro01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Deben realizar un programa que pida al usuario el nombre y su edad y 
		 * le informe si es mayor de 18 años o menor con un mensaje por consola que diga:
			"Fulanito, es menor mayor de edad" o "Fulanito es menor de edad" .
			Esta operación se repetirá indefinidamente hasta que el usuario ingrese el número 0 en edad.
		 * */
		
		int edad = 0;
		do {
			
			System.out.println("ingrese su nombre");
			Scanner sc = new Scanner(System.in);
			String nombre = sc.next();
			System.out.println("Ingrese la edad");
			edad = sc.nextInt();
			
			if(edad != 0) {
				System.out.println(nombre+" tiene "+edad+" años.");
			}
			
		}while(edad != 0);
		
		System.out.println("FIN");


	}

}
