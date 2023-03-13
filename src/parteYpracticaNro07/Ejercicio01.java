package parteYpracticaNro07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un programa que pida al usuario introducir un número. El programa debe devolver un mensaje 
		 * especificando si el número introducido por el usuario es par o impar. 
			Además, el programa debe controlar la excepción si el usuario introduce texto en lugar de un valor numérico. 
			En caso de introducir texto, se debe advertir al usuario que “El valor introducido no es numérico. 
			El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.
		 */
		
		int nro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar un número entero:");
        try{
            nro = entrada.nextInt();
            if(nro%2==0){
                System.out.println(nro+" es par");
            }else{
                System.out.println(nro+" es impar");
            }
        }catch (InputMismatchException e){
            System.out.println("ERROR: SÓLO SE ADMITEN NÚMROS!");
        }

	}

}
