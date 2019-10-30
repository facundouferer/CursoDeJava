package TiendaCelulares;

public class Movil {
	
	//declaración de variables privadas accesibles solo por la clase:
	
	private int tamanioPantalla;
	private String tipo;
	private int stock;
	
	public Movil(int tamanioPantalla, String tipo, int stock) {
		
		this.tamanioPantalla =	tamanioPantalla;
		this.tipo = tipo;
		this.stock = stock;
		
	}
	
	public Movil(){
		this.tamanioPantalla =	12;
		this.tipo = "generico";
		this.stock = 0;
	}
	
	public String getInfo() {
		
		//retorna las propiedades del objeto 

		return "\nTamaño pantalla:"+this.tamanioPantalla+
				"\nTipo:"+this.tipo+
				"\nTipo:"+this.stock
				;
	}
	
	public String vender(int cantidad) {
		//disminuye la variable cantidad
		this.stock = this.stock - cantidad;
		return "Vendidos: "+ cantidad + " " + this.tipo+
				"\nEn Stock: "+this.stock;
	}

}
