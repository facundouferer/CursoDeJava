package empresa;

public class Jefe extends Empleado{
	
	private double bonus=1000;

	public Jefe(String nombre, double sueldo) {
		super(nombre, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo()+this.bonus;
	}
	
	

}
