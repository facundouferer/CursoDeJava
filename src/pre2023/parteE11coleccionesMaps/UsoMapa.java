package pre2023.parteE11coleccionesMaps;

import java.util.HashMap;
import java.util.Map;

public class UsoMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Personas> directorio = new HashMap<String, Personas>();

		System.out.println("Ingrese Nombre");
		//AGREGAR ELEMENTOS
		directorio.put("100", new Personas("Carlos", "Villaruel"));
		directorio.put("12", new Personas("Maria", "Riachuelo"));
		directorio.put("142", new Personas("Lucia", "Masín"));
		directorio.put("142", new Personas("NUEVO", "Masín"));
		directorio.put("16", new Personas("Victoria", "Peronista"));
		
		System.out.println(directorio);
		
		//ELIMINAR ELEMENTOS
		directorio.remove("12");
		System.out.println(directorio);
		
		System.out.println("LISTADO DEL DIRECTORIO EN FORMATO CLAVE VALOR:");
		
		for(Map.Entry<String, Personas>persona:directorio.entrySet()) {
			String clave = persona.getKey();
			Personas valor = persona.getValue();
			System.out.println("Clave: "+persona.getKey()+" Valor: "+valor);
		}

	}

}
 
class Personas{
	private String nombre; 
	private String apellido; 
	
	public Personas(String nombre, String apellido) {
		this.nombre = nombre; 
		this.apellido = apellido; 
	}

	@Override
	public String toString() {
		return "Personas [nombre: " + nombre + ", apellido: " + apellido + "] \n";
	}
	
}