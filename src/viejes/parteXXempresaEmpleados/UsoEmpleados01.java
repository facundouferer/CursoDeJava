package viejes.parteXXempresaEmpleados;

public class UsoEmpleados01 {

	public static void main(String[] args) {
		/*
		 * En este programa veremos: Polimorfismo, Principio de sustituci�n y Enlazado
		 * Din�mico
		 */

		Empleados[] Empleados = new Empleados[5];

		Empleados[0] = new Empleados("Gat�n", 48000);
		Empleados[1] = new Empleados("Carlitos", 48000);
		Empleados[2] = new Empleados("Luc�a", 48000);
		Empleados[3] = new Empleados("Rita", 48000);

		/*
		 * PRINCIPIO DE SUSTITUCI�N
		 * Como un Jefe es un empleado por principio de sustituci�n
		 * podemos almacenar un objeto de tipo jefe en un array de empleado
		 * porque un JEFE es un EMPLEADO
		 */

		Empleados[4] = new Jefes("Victor", 50000); // PRINCIPIO DE SUSTITUCI�N

		for (Empleados objeto : Empleados) {
			/*
			 * Por POLIMORFISMO podemos utilizar el mismo m�todo getSueldo
			 * que es distinto en la clase empleado y jefe
			 * pero como las dos propiedades tienen el mismo nombre (polimorfismo)
			 * y los mismo par�metros, podemos utilizar las dos
			 * Esto es porque el interprete de JAVA por medio del
			 * ENLAZAMIENTO DIN�MICO sabe que m�todo utilizar.
			 */
			System.out.println(objeto.getDatosEmpleado() + "\nSALARIO: " + objeto.getSueldo());
		}

	}

}
