package viejes.parteZ02ExamenFinalCine;

public class Acomodadores extends Empleados implements ParaAcomodadores {

	private Salas sala;

	public Acomodadores(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Salas getSala() {
		return this.sala;
	}

	public void setSala(Salas sala) {
		this.sala = sala;
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return "Acomodador";
	}

}
