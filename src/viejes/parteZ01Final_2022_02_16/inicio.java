package viejes.parteZ01Final_2022_02_16;

class inicio {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		/**
		 * Crear Facultad
		 */
		Facultad UtnFrr = new Facultad("UTN-FRR");

		/**
		 * Crear carreras
		 */
		Carrera isi = new Carrera("ISI");
		Carrera tup = new Carrera("TUP");
		Carrera iq = new Carrera("IQ");

		/**
		 * Agregar las carreras a una facultad
		 */
		UtnFrr.agregarCarrera(isi);
		UtnFrr.agregarCarrera(tup);
		UtnFrr.agregarCarrera(iq);

		/**
		 * Listar las carreras de una facultad
		 */
		UtnFrr.mostrarCarreras();
		/**
		 * Eliminar Carreras de la facultad.
		 */
		UtnFrr.eliminarCarrera("IQ");
		UtnFrr.mostrarCarreras();

		/**
		 * Crear un profesor indicando el Nombre, Apellido y Nro de Legajo, el cual debe
		 * poder ingresarse
		 * en formato de String y luego ser modificado para almacenarse en formato de
		 * n�mero Entero.
		 * La clase profesor hereda de la clase abstracta Persona
		 */

		Profesor facundo = new Profesor("Facundo", "Uferer", 1234);

		/**
		 * Crear materia
		 */
		Materia LaboratorioDeComputacion2 = new Materia("Laboratorio de Computacion 2", facundo);

		/**
		 * Agregar materias a una Carrera
		 */

		tup.agregarMateria(LaboratorioDeComputacion2);

		/**
		 * Crear estudiantes. La clase Estudiante hereda de la clase Persona.
		 */

		Estudiante carlitos = new Estudiante("Carlos", "Garc�a", 2345);
		Estudiante susanita = new Estudiante("Susana", "Diez de los R�os", 3456);
		Estudiante anita = new Estudiante("Anabella", "Stanley", 4567);
		Estudiante pablito = new Estudiante("Pablo", "Stella", 5678);

		/**
		 * Agregar estudiantes a una materia
		 */

		LaboratorioDeComputacion2.agregarEstudiante(carlitos);
		LaboratorioDeComputacion2.agregarEstudiante(susanita);
		LaboratorioDeComputacion2.agregarEstudiante(anita);
		LaboratorioDeComputacion2.agregarEstudiante(pablito);

		/**
		 * Listar los estudaintes de una materia
		 */

		LaboratorioDeComputacion2.listarEstudiantes();

		/**
		 * Reescribir el m�todo toString de una materia para listar sus datos
		 */

		System.out.println(LaboratorioDeComputacion2.toString());

		/**
		 * Eliminar un estudiante de una materia indicando su n�mero de legajo
		 */

		LaboratorioDeComputacion2.eliminarEstudiante(3456);
		LaboratorioDeComputacion2.listarEstudiantes();

		/**
		 * Modificar todos los datos de un Profesor y devolver una excepci�n con el
		 * mensaje
		 * "ERROR: Eso no parece ser un n�mero de legajo" si se coloca letras en el
		 * n�mero de legajo el cual debe
		 * ser s�lo n�meros enteros.
		 * �ste m�todo es la implementaci�n de un m�todo abstracto de la clase padre
		 * Persona.
		 */

		facundo.modificarDatos("Carlos", "Uferer", "1234");
	}

}
