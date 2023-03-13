package parteZ02ExamenFinalCine;

public class Salas {
	
	private int capacidad;
	private String pelicula;
	private String nombre;
	private Espectadores[] espectadores;
	
	public Salas(int capacidad, String nombre) {
		this.capacidad = capacidad;
		this.nombre = nombre;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	public void setEspectadores(Espectadores[] espectadores) {
		if(espectadores.length>this.capacidad) {
			System.out.println("CAPACIDAD DE ESPECTADORES SUPERADA");
		}else {
			this.espectadores = espectadores;
		}		
	}
	
	public String getEspectadores() {
		try {
			
			String listadoEspectadores ="LISTADO DE ESPECTADORES: \n";
			for (Espectadores espectador : this.espectadores) {
				listadoEspectadores = listadoEspectadores+espectador.toString();
			}
			return listadoEspectadores;
			
		} catch (Exception e) {
			// TODO: handle exception
			return "SIN ESPECTADORES CARGADOS";
		}
		
	}

	@Override
	public String toString() {
		return "Salas [capacidad=" + capacidad + ", pelicula=" + pelicula + ", nombre=" + nombre;
	}

	
	
	
	

}
