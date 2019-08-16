package POO;

public class Movil {
	
	private int tamanioPantalla;
	private String tipo;
	
	public Movil(int tamanioPantalla, String tipo) {
		
		this.tamanioPantalla =	tamanioPantalla;
		this.tipo = tipo;
		
	}
	
	public Movil(){
		this.tamanioPantalla =	12;
		this.tipo = "celular";
	}
	
	public String getInfo() {

		return "tamaño pantalla:"+this.tamanioPantalla+"\n"+
				"Tipo:"+this.tipo;
	}

}
