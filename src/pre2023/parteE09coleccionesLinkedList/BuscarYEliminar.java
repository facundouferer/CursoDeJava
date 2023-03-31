package pre2023.parteE09coleccionesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BuscarYEliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> provincias = new LinkedList<String>();

		provincias.add("Chaco");
		provincias.add("Corrientes");
		provincias.add("Misiones");
		provincias.add("Buenos Aires");

		System.out.println(provincias);

		ListIterator<String> itProvincias = provincias.listIterator();
		
		System.out.println("¿Qué provincia quiere eliminar?");
		Scanner lectura = new Scanner(System.in);
		String provinciaEliminar = lectura.nextLine();

		while (itProvincias.hasNext()) {
			if(itProvincias.next().equals(provinciaEliminar)) {
				itProvincias.remove();
			}
		}
		
		System.out.println(provincias);

	}

}
