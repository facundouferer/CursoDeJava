package pre2023.parteYpracticaNro08;

public class Coche implements Vehiculo{

	int velocidad;
	
	public Coche(int velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String frenar(int cantidad) {
		// TODO Auto-generated method stub
		this.velocidad = this.velocidad - cantidad;
		return "Se ha reducido la velocidad en "+cantidad+" Km/h por lo que el vehículo transita a "+this.velocidad+" Km/h";
	}

	@Override
	public String acelerar(int cantidad) {
		// TODO Auto-generated method stub
		this.velocidad = this.velocidad + cantidad;
		String mensaje = "";
		if ((this.velocidad + cantidad) > this.VELOCIDAD_MAXIMA) {
			mensaje = "Se ha excedido el límite de velocidad";
		}
		return "Se ha aumentado la velocidad en " + cantidad + " Km/h por lo que el vehículo transita a "
				+ this.velocidad + " Km/h \n" + mensaje;
	}

	@Override
	public int plazas() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String frenar(int cant_a, int cant_d) {
		// TODO Auto-generated method stub
		return null;
	}

}
