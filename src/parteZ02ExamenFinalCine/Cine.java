package parteZ02ExamenFinalCine;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Espectadores[] espectadores = new Espectadores[2];
		
		for(int i=0; i<=espectadores.length-1; i++) {
			
			Scanner entrada = new Scanner(System.in);
			
			try {
				
				System.out.println("Nombre:");
				String nombre = entrada.next();
				
				System.out.println("Edad:");
				int edad = entrada.nextInt();
				
				System.out.println("Fila:");
				String fila = entrada.next();
				
				System.out.println("Silla:");
				int silla = entrada.nextInt();
				
				espectadores[i] = new Espectadores(nombre, edad, fila,silla);
				
				Salas sala01 = new Salas(2, "Sala 01");
				sala01.setPelicula("Jocker");
				
				sala01.setEspectadores(espectadores);
				System.out.println(sala01.getEspectadores());
				
				Acomodadores acomodador01  = new Acomodadores("Alberto", 34);
				acomodador01.setSala(sala01);		
				acomodador01.setSueldo(50000);
				
				System.out.println(acomodador01.toString());
				
				Empleados empleado01 = new Empleados("Garcia", 33);
				System.out.println(empleado01.toString());
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR EN EL INGRESO DE DATOS");
				break;
			}
		}		
		

	}

}
