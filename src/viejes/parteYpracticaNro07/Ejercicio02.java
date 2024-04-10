package viejes.parteYpracticaNro07;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un programa que pida al usuario introducir un n�mero entre 1 y 100.
		 * Si el usuario introduce un n�mero fuera de ese rango el programa lanzar�
		 * una excepci�n propia.
		 * El mensaje de la excepci�n ser� �El n� est� fuera de rango�.
		 */

		pedirDatos();

	}

	static void pedirDatos() throws FueraDeRango {

		Scanner entrada = new Scanner(System.in);
		System.out.println("INGRESAR UN NRO ENTRE 0 A 100");
		int numero = entrada.nextInt();

		if (numero < 0 || numero > 100) {
			// colocamos nuestra propia excepci�n
			FueraDeRango miExcepcion = new FueraDeRango("El n� est� fuera de rango");
			throw miExcepcion;
		} else {
			System.out.println("nro ingresado es " + numero);
		}
		entrada.close();
	}

}

class FueraDeRango extends RuntimeException {
	// deben tener dos constructores uno que recibe un parametro y otro sin
	// parametros

	public FueraDeRango() {

	}

	public FueraDeRango(String mensajeError) {
		super(mensajeError);
	}

}
