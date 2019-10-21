package trabajoPracticoNro08;

public interface Vehiculo {
	
	final int VELOCIDAD_MAXIMA = 120; 
	
	String frenar(int cantidad);
	
	String frenar(int cant_a, int cant_d);
	
	String acelerar (int cantidad);
	
	int plazas();

}
