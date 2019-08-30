package empresaEmpleados;

public class Jefes extends Empleados{
	
	/*
	 * Clase hija de Empleados que hereda si constructor 
	 */

	private double incentivo;
	
	public Jefes(String nombre, double sueldo) {
		super(nombre, sueldo); //Hereda del constructor.
	}
	
	public void setIncentivo(double monto) {
		this.incentivo=monto;
	}
	
	public double getSueldo() {
		return super.getSueldo()+this.incentivo;
	}

}
