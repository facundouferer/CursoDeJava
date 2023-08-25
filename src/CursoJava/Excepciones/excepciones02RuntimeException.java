package CursoJava.Excepciones;

import java.util.Scanner;

class excepciones02RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ingresa un número");
		Scanner leer = new Scanner(System.in);
		int nroUno = leer.nextInt();

		System.out.println("ingresa otro número");

		 int nroDos = leer.nextInt();
		 
		 try {
			 int resultado = nroUno/nroDos;
			 System.out.println(resultado);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("no se puede dividir por ZERO!");
		}
		 
		 System.out.println("Fin del programa");

	}

}