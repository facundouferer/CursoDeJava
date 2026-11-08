package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej05_personas_y_materias;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un estudiante cuya carrera puede definirse al construirlo o más adelante.
 * Concepto: 4. Sobrecarga de constructores y 3. Sobrescritura.
 */
class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, String apellido, int dni, String carrera) {
        super(nombre, apellido, dni);
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String apellido, int dni) {
        this(nombre, apellido, dni, "Sin definir");
    }

    public void modificarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }

    @Override
    public String toString() {
        return super.toString() + " - Carrera: " + carrera;
    }
}
