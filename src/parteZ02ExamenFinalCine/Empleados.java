package parteZ02ExamenFinalCine;

public class Empleados extends Personas{
	
	private double sueldo;
	
	public Empleados(String nombre, int edad) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
		super.setEdad(edad);		
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+super.getNombre()+"\n"+
		"Edad: "+super.getEdad()+"\n"+
		"Tipo:"+this.getTipo()+"\n"+
		"Sueldo: $"+this.sueldo+"\n"+
		"------------------------\n";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Empleado";
	}

}
