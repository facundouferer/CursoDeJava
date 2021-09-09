package parteZ01ExamenFinalConcesionarias;

class Auto {
	
	private int cantidadPuertas; 
	private String marcas;
	private int modelo; 
	private double precio;
	private int kilometros; 
	
	Auto(int cantidadPuertas, String marca, int modelo, double precio){
		this.cantidadPuertas = cantidadPuertas;
		this.marcas=marca;
		this.modelo=modelo;
		this.precio=precio;
		this.kilometros=0;
	}
	
	public void mover(int km) {
		this.kilometros=km;
	}

	@Override
	public String toString() {
		return "Auto [cantidadPuertas=" + cantidadPuertas + ", marcas=" + marcas + ", modelo=" + modelo + ", precio="
				+ precio + ", kilometros=" + kilometros + "]";
	}

}
