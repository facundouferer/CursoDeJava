package parteYpracticaNro10Facultad;

abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(String legajo) {
        this.legajo = Integer.parseInt(legajo);
    }

    public int getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + "(Leg. " + legajo+")";
    }

    public abstract void modificarDatos(String nombre, String Apellido, String legajo);

}
