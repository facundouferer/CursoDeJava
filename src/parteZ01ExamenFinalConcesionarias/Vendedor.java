package parteZ01ExamenFinalConcesionarias;

class Vendedor implements ParaPersona{
	
	private String nombre;
	private int cantidadDeVentas;
	private int dni; 
	
	Vendedor(String nombre, int dni){
		this.nombre = nombre; 
		this.dni = dni;
	}
	
	public String verNombre() {
		return this.nombre;
	}

	@Override
	public void cambiarNombre(String nombreNuevo) {
		// TODO Auto-generated method stub
		this.nombre=nombreNuevo;
		
	}

	@Override
	public void modificarDNI(int dniNuevo) {
		// TODO Auto-generated method stub
		this.dni=dniNuevo;
		
	}
	
	public int verCantidadDeVentas() {
		return this.cantidadDeVentas;
	}
	
	public void incrementarVentas(int cantidad) {
		this.cantidadDeVentas = this.cantidadDeVentas+cantidad;
	}

	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", cantidadDeVentas=" + cantidadDeVentas + ", dni=" + dni + "]";
	}
	
	

}
