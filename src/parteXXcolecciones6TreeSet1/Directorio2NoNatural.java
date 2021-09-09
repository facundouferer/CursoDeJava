package parteXXcolecciones6TreeSet1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Ordenamiento no natural
 * de elementos en una colección
 * Por ejemplo en base a un texto
 */

public class Directorio2NoNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contactos comparador = new Contactos();

		TreeSet<Contactos> Directorio = new TreeSet<Contactos>(comparador);

		
		boolean seguir = true;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("APELLIDO: ");
			String apellido = teclado.next();

			Contactos persona = new Contactos(apellido);
			Directorio.add(persona);

			System.out.println("Seguir cargando? (si/no)");
			if (teclado.next().equals("no")) {
				seguir = false;
			}

		} while (seguir == true);

		System.out.println(
				"LISTADO DE PERSONAS CARGADAS ORDENADAS" + "SEGÚN LA CANTIDAD DE LETRAS QUE TIENE SU APELLIDO:");
		for (Contactos contacto : Directorio) {
			System.out.println(contacto.toString());
		}
		teclado.close();
	}

}

/*
 * Implementamos Comparator para podere crear ordenamientos no naturales, es
 * decir ordenamientos que inventemos
 */
class Contactos implements Comparator<Contactos> {

	private String apellido;
	
	public Contactos() {
		
	}

	public Contactos(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return " apellido: " + apellido ;
	}

	@Override
	public int compare(Contactos c1, Contactos c2) {
		// TODO Auto-generated method stub
		if (c1.apellido.length() < c2.apellido.length())
			return -1;
		if (c1.apellido.length() > c2.apellido.length())
			return 1;
		else
			return 0;
	}

}