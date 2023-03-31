package pre2023.parteZ02ExamenFinalCine;

public abstract class Personas {
	
	private String nombre;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public abstract String getTipo();
	
	public abstract String toString();

	
	
	

}
