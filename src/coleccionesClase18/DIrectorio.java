package coleccionesClase18;

import java.util.Scanner;
import java.util.TreeSet;

import colecciones6TreeSet1.Personas;

public class DIrectorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> directorio = new TreeSet<String>();
		
		boolean seguir = true; 
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.println("NOMBRE");
			String nombre = teclado.next();
			System.out.println("seguir?");
			String opcion = teclado.next();
			
			if(opcion.equals("si")) {
				seguir = true;
			}else {
				seguir = false;
			}
		}while(seguir==true);

	}

}

class Personas {
 
	private String nombre; 
	
	public Personas(String nombre) {
		this.nombre = nombre;
	}
	
	
}
