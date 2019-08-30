package empresaEmpleados;

public class Jefe extends Empleado{
	
	/*
	 * Clase hija de Empleados que hereda si constructor 
	 */

	private double incentivo;
	
	public Jefe(String nombre, double sueldo) {
		super(nombre, sueldo); //Hereda del constructor.
	}
	
	public void setIncentivo(double monto) {
		this.incentivo=monto;
	}
	
	public double getSueldo() {
		return super.getSueldo()+this.incentivo;
	}

}
