package Proyectos.Personas;
import Proyectos.Personas.Util.Utilidades;

class Persona {
    String nombre;
    int dni;
    String telefono;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(String nombre, int dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
       String telefonoCompuesto = Utilidades.caracteristica(telefono);
        return this.nombre + " (" + dni + ") - Teléfono: " + telefonoCompuesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}