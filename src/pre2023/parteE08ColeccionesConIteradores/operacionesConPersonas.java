package pre2023.parteE08ColeccionesConIteradores;

import java.util.Iterator;
import java.util.Set;

class operacionesConPersonas {
	
	Set<Personas> coleccionDePersonas;
	
	public operacionesConPersonas(Set<Personas>coleccionDePersonas) {
		this.coleccionDePersonas = coleccionDePersonas;
	}

	public void cargarPersona(Personas persona) {
		coleccionDePersonas.add(persona);
		System.out.println(persona.toString()+" fue cargada correctamente.");
	}
	
	public void listarPersonas() {
		System.out.println("LISTADO DE PERSONAS:");	
		for (Personas persona : coleccionDePersonas) {
			System.out.println(persona.toString());			
		}
	}
	
	public void eliminarPersona(String nombre) {
		//creo el iterador para recorrer el listado
				Iterator<Personas> iterador = coleccionDePersonas.iterator();
				
				while(iterador.hasNext()) {
					String buscado = iterador.next().getNombre();
					if(buscado.equals(nombre)) {
						iterador.remove();
						System.out.println(nombre + " fue eliminada.");
					}
				}
	}
	
	public void buscarPersona(String nombre) {
		
		for (Personas persona : coleccionDePersonas) {
			if(persona.getNombre().equals(nombre)) {
				System.out.println(persona.toString() + " fue encontrado.");
			}
		}
		
	}
	
	
}
