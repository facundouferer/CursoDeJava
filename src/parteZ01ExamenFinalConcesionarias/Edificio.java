package parteZ01ExamenFinalConcesionarias;

class Edificio {
	
	protected String nombre;
	protected String calle;
	protected int numero;
	protected String localidad;
	protected String provincia;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Edificio [calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", provincia="
				+ provincia + "]";
	}
	
	

}
