package pre2023.parteE09coleccionesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class BuscarYEliminar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> provincias = new LinkedList<String>();

		provincias.add("Chaco");
		provincias.add("Corrientes");
		provincias.add("Misiones");
		provincias.add("Buenos Aires");

		System.out.println(provincias);

		ListIterator<String> itProvincias = provincias.listIterator();

		while (itProvincias.hasNext()) {
			if(itProvincias.next().equals("Chaco")) {
				itProvincias.remove();
			}
		}
		
		System.out.println(provincias);

	}

}
