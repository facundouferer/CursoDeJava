package Proyectos.Personas;
import Proyectos.Personas.Util.UtilidadesPersona;

class Persona {
    String nombre;
    int dni;
    String telefono;

    public Persona(String nombre, int dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
       String telefonoCompuesto = UtilidadesPersona.caracteristica(telefono);
        return this.nombre + " (" + dni + ") - Teléfono: " + telefonoCompuesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}