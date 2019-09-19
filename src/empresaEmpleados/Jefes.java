package empresaEmpleados;

import java.util.Locale.Category;

public class Jefes extends Empleados implements ParaJefes{
	
	/*
	 * Clase hija de Empleados que hereda si constructor 
	 */

	private double incentivo;
	private String cargo;
	
	public Jefes(String nombre, double sueldo) {
		super(nombre, sueldo); //Hereda del constructor.
	}
	
	public void setIncentivo(double monto) {
		this.incentivo=monto;
	}
	
	public double getSueldo() {
		return super.getSueldo()+this.incentivo;
	}

	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		this.cargo = cargo;
		
	}

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "Cargo: "+this.cargo;
	}

}
