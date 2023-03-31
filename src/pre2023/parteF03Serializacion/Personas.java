package pre2023.parteF03Serializacion;

import java.io.Serializable;

//debemos mplementar la interface serializable
public class Personas implements Serializable{
	private String nombre;
	private int dni;
	public Personas(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni; 
	}
	public String toString() {
		return this.nombre+" ("+this.dni+")";
	}

}
