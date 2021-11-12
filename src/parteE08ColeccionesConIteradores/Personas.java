package parteE08ColeccionesConIteradores;

class Personas {
	
	private int dni; 
	private String nombre;
	
	public Personas(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.nombre+"("+this.dni+")";
	}
	
	

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personas other = (Personas) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

}
