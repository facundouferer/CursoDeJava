package empresaEmpleados;

public class Empleados extends Persona{
	
	private String nombre; 
	private double sueldo;
	private int id; 
	private static int idSiguiente = 1;
	
	public Empleados(String nombre, double sueldo) {
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

	@Override
	public String getNombre() {
		
		return this.nombre;
		// TODO Auto-generated method stub
		
	}

}
