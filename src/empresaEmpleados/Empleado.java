package empresaEmpleados;

public class Empleado {
	
	private String nombre; 
	private double sueldo;
	private int id; 
	private static int idSiguiente = 1;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.id=idSiguiente;
		idSiguiente++;
	}
	
	public String getDatosEmpleado() {
		return "--------------------\n"+
				"NOMBRE: "+this.nombre+
				"\nSUELDO: "+this.sueldo+
				"\nID: "+this.id;				
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public void setSubeSueldo(double monto) {
		this.sueldo=monto;
	}

}
