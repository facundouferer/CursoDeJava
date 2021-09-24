package parteYpracticaNro10Facultad;

class Estudiante extends Persona{

    public Estudiante(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return "Estudiante: "+ super.toString();
    }
}
