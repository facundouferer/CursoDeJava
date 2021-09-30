package parteYpracticaNro10Facultad;

class inicio {

	public static void main (String args[]) {
		// TODO Auto-generated method stub
		Facultad facultad = new Facultad("UTN-FRR");
		/**
		 * 1. Agregar Carreras a una Facultad
		 */
		facultad.agregarCarrera(new Carrera("ISI"));
		facultad.agregarCarrera(new Carrera("TUP"));
		facultad.agregarCarrera(new Carrera("IQ"));
		facultad.mostrarCarreras();
		/**
		 * 2. Eliminar Carreras de la facultad.
		 */
		facultad.eliminarCarrera("IQ");
		facultad.mostrarCarreras();

		/**
		 * 3. Eliminar Estudiantes de una facultad implica que se elimine el estudiante de
		 * cada una de las materias a las cuales se inscribió.
		 */


		/**
		 * 4. Agregar Materias a una Carrera
		 */

	}

}
