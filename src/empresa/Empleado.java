package empresa;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	private int id;
	private static int countId=1;

	public Empleado(String nombre, double sueldo) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.id=this.countId;
		this.countId++;
	}

	public String getDatos() {
		// TODO Auto-generated method stub
		return "\n---------------"+
				"\nNOMBRE: "+this.nombre+
				"\nID: "+this.id;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}

}
