package viejes.parteYpracticaNro10Facultad;

class Profesor extends Persona {

    public Profesor(String nombre, String Apellido, String legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString();
    }

    @Override
    public void modificarDatos(String nombre, String Apellido, String legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        try {
            super.setLegajo(legajo);
        } catch (Exception e) {
            System.out.println("ESO NO PARECE SER UN N�MERO DE LEGAJO");
        }
    }
}
