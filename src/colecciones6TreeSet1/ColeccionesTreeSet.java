package colecciones6TreeSet1;
import java.util.*;

public class ColeccionesTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ordenaGente = new TreeSet<String>();
		
		ordenaGente.add("Lucas");
		ordenaGente.add("Zilva");
		ordenaGente.add("Javier");
		ordenaGente.add("Albert");
		ordenaGente.add("Analia");
		
		/*
		 * El listado se mostrará en orden 
		 * alfabetico puesto que este tipo de listas
		 * posee un método que permite esta operacion.
		 */
		
		for (String gente : ordenaGente) {
			System.out.println(gente);			
		}

	}

}
