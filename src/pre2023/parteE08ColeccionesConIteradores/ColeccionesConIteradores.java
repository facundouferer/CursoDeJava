package pre2023.parteE08ColeccionesConIteradores;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ColeccionesConIteradores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 1;
		
		Set<Personas>coleccionDePersonas = new HashSet<Personas>();
		operacionesConPersonas operaciones = new operacionesConPersonas(coleccionDePersonas);
		
		while(opcion != 0) {
			
			System.out.println("|=======================|");
			System.out.println("| INDIQUE LA OPCIÓN:    |");
			System.out.println("| 1) Cargar personas.   |");
			System.out.println("| 2) Eliminar personas. |");
			System.out.println("| 3) Buscar personas.   |");
			System.out.println("| 4) Listar personas.   |");
			System.out.println("| 0) Salir.             |");
			System.out.println("|=======================|");
			
			Scanner teclado = new Scanner(System.in);
			
			try {				
				opcion = teclado.nextInt();
			} catch (Exception e) {
				System.out.println("error en el ingreso de datos, intente nuevamente. ");
				opcion = 999;
			}
			
			
			switch (opcion) {
			case 1:
				
				System.out.println("Nombre:");
				String nombre = teclado.next();
				System.out.println("DNI:");
				int dni = teclado.nextInt();
				Personas persona = new Personas(dni, nombre);
				operaciones.cargarPersona(persona);
				break;
				
			case 2: 
				System.out.println("Nombre:");
				operaciones.eliminarPersona(teclado.next());
				break;
				
			case 3:
				System.out.println("Nombre:");
				operaciones.buscarPersona(teclado.next());
				break;
				
			case 4:
				
				operaciones.listarPersonas();
				break;
				
			default:
				break;
			}
			
		}	
		
		System.out.println("FIN");		

	}

}
