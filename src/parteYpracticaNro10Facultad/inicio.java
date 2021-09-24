package parteYpracticaNro10Facultad;

class inicio {

	public static void main (String args[]) {
		// TODO Auto-generated method stub
		System.out.println("Inicio");
		Estudiante carlos = new Estudiante("Carlos", "Romero", 3553);
		Estudiante pedro = new Estudiante("Pedro", "Uribe", 1231);
		Estudiante alberto = new Estudiante("Alberto", "Fernandez", 3510);
		System.out.println(carlos.toString());

		Profesor facu = new Profesor("Facundo", "Uferer", 3543);
		Materia programacion = new Materia("Programacion", facu);

		programacion.agregarEstudiante(carlos);
		programacion.agregarEstudiante(pedro);
		programacion.agregarEstudiante(alberto);
		programacion.eliminarEstudiante(1231);
		System.out.println(programacion.toString());
	}

}
