package Proyectos.Personas;
import Proyectos.Personas.Util.UtilidadesPersona;

public class Persona {
    public String nombre;
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
    String telefonoCompuesto = UtilidadesPersona.caracteristica(telefono);
        return this.nombre + " (" + dni + ") - Teléfono: " + telefonoCompuesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}