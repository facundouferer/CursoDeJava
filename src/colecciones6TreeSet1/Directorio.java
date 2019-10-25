package colecciones6TreeSet1;

import java.util.Scanner;
import java.util.TreeSet;

public class Directorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Personas> personasOrdenadas = new TreeSet<Personas>();
	
	
		personasOrdenadas.add(new Personas("zzzzzdsds", "Zarte", 31123123));
		personasOrdenadas.add(new Personas("aasdfasdfasdfdf", "qweqwe", 13214));
		personasOrdenadas.add(new Personas("zzzz", "afdafsd", 1234));
		personasOrdenadas.add(new Personas("carfghflos", "Zarte", 24234));

		
		System.out.println("LISTADO DE PERSONAS CARGADAS:");
		for (Personas personas : personasOrdenadas) {
			System.out.println(personas.toString());
		}
	}

}
 
class Personas implements Comparable<Personas>{
	
	private int DNI; 
	private String nombre; 
	private String apellido; 
	
	public Personas(String apellido, String nombre, int DNI) {
		this.DNI = DNI; 
		this.nombre = nombre; 
		this.apellido = apellido; 
	}

	@Override
	public String toString() {
		return "Personas [DNI: " + DNI + ", nombre: " + nombre + ", apellido: " + apellido + "]";
	}

	@Override
	public int compareTo(Personas persona) {
		// TODO Auto-generated method stub
		if(this.apellido.length() < persona.apellido.length()) return -1;
		if(this.apellido.length() > persona.apellido.length()) return 1;
		else return 0;		
	}
	
}