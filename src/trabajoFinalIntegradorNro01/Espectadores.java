package trabajoFinalIntegradorNro01;

public class Espectadores extends Personas{
	
	private String fila;
	private int silla;

	public Espectadores(String nombre, int edad, String fila, int silla) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
		super.setEdad(edad);
		this.fila = fila;
		this.silla = silla;	
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Espectador";
	}

	public String getButaca() {
		return this.fila+"-"+this.silla;
	}

	@Override
	public String toString() {
		return "Nombre: "+super.getNombre()+"\n"+
				"Edad: "+super.getEdad()+"\n"+
				"Tipo:"+this.getTipo()+"\n"+
				"Butaca:"+this.getButaca()+"\n"+
				"------------------------\n";
	}
	
	
	

}
