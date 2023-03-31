package pre2023.parteZ01Final_2022_02_16;

class Estudiante extends Persona {

    public Estudiante(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
    }


    @Override
    public String toString() {
        return "Estudiante: "+ super.toString();
    }

    @Override
    public void modificarDatos(String nombre, String Apellido, String legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(Integer.parseInt(legajo));
    }
}
