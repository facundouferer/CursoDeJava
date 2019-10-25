package quienSeLlevaLaTablet;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class DirectorioTabler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Personas> directorio = new HashMap<String, Personas>();
		
		//AGREGAR ELEMENTOS
		directorio.put("31119278", new Personas("12312-123123", "Facundo", "carlos"));
		directorio.put("101231231230", new Personas("12312-123123", "Julio", "Csar"));
		
		System.out.println(directorio);
		
		//ELIMINAR ELEMENTOS
		directorio.remove("31119278");
		System.out.println(directorio);
		
		System.out.println("DIRECTORIO:");
		
		for(Map.Entry<String, Personas>persona:directorio.entrySet()) {
			String clave = persona.getKey();
			Personas valor = persona.getValue();
			System.out.println("Clave: "+persona.getKey()+" Valor: "+valor);
		}
		
	}

}
 
class Personas{
	
	private String tel;
	private String nombre; 
	private String apellido; 

	public Personas(String tel, String nombre, String apellido) {
		super();
		this.tel = tel;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Personas [nombre: " + nombre + ", apellido: " + apellido + "]";
	}
	
}