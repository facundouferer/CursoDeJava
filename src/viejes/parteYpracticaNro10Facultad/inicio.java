package viejes.parteYpracticaNro10Facultad;

class inicio {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		/**
		 * 1. Crear Facultad
		 */
		Facultad UtnFrr = new Facultad("UTN-FRR");

		/**
		 * 2. Crear carreras
		 */
		Carrera isi = new Carrera("ISI");
		Carrera tup = new Carrera("TUP");
		Carrera iq = new Carrera("IQ");

		/**
		 * 3. Agregar las carreras a una facultad
		 */
		UtnFrr.agregarCarrera(isi);
		UtnFrr.agregarCarrera(tup);
		UtnFrr.agregarCarrera(iq);

		/**
		 * 4. Listar las carreras de una facultad
		 */
		UtnFrr.mostrarCarreras();
		/**
		 * 2. Eliminar Carreras de la facultad.
		 */
		UtnFrr.eliminarCarrera("IQ");
		UtnFrr.mostrarCarreras();

		/**
		 * 3. Crear un profesor indicando el Nombre, Apellido y Nro de Legajo, el cual
		 * debe poder ingresarse
		 * en formato de String y luego ser modificado para almacenarse en formato de
		 * n�mero Entero.
		 * La clase profesor hereda de la clase abstracta Persona
		 */

		Profesor facundo = new Profesor("Facundo", "Uferer", "1234");

		/**
		 * 4. Crear materia
		 */
		Materia LaboratorioDeComputacion2 = new Materia("Laboratorio de Computacion 2", facundo);

		/**
		 * 5. Crear estudiantes. La clase Estudiante hereda de la clase Persona.
		 */

		Estudiante carlitos = new Estudiante("Carlos", "Garc�a", "2345");
		Estudiante susanita = new Estudiante("Susana", "Diez de los R�os", "3456");
		Estudiante anita = new Estudiante("Anabella", "Stanley", "4567");
		Estudiante pablito = new Estudiante("Pablo", "Stella", "5678");

		/**
		 * 6. Agregar estudiantes a una materia
		 */

		LaboratorioDeComputacion2.agregarEstudiante(carlitos);
		LaboratorioDeComputacion2.agregarEstudiante(susanita);
		LaboratorioDeComputacion2.agregarEstudiante(anita);
		LaboratorioDeComputacion2.agregarEstudiante(pablito);

		/**
		 * 7. Listar los estudaintes de una materia
		 */

		LaboratorioDeComputacion2.listarEstudiantes();

		/**
		 * 8. Reescribir el m�todo toString de una materia para listar sus datos
		 */

		System.out.println(LaboratorioDeComputacion2.toString());

		/**
		 * 9. Eliminar un estudiante de una materia indicando su n�mero de legajo
		 */

		LaboratorioDeComputacion2.eliminarEstudiante(3456);
		LaboratorioDeComputacion2.listarEstudiantes();

		/**
		 * 10. Modificar los datos de un Profesor de la materia y devolver una excepci�n
		 * con el mensaje
		 * "Eso no parece ser un n�mero de legajo" si se coloca letras en el n�mero de
		 * legajo el cual debe
		 * ser s�lo n�meros.
		 * �ste m�todo es la implementaci�n de un m�todo abstracto de la clase padre
		 * Persona.
		 */

		facundo.modificarDatos("Carlos", "Uferer", "asdfasdfad");
	}

}
