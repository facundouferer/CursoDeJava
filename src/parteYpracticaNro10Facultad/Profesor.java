package parteYpracticaNro10Facultad;

class Profesor extends Persona{

    public Profesor(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
    }

    @Override
    public String toString() {
        return "Profesor: "+super.toString();
    }

    @Override
    public void modificarDatos() {

    }
}
