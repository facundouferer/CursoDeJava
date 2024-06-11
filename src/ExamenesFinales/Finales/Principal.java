package ExamenesFinales.Finales;

class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getDatos() {
        return nombre + " " + apellido + " " + dni;
    }

    public void setDatos(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}

public class Principal {
    public static void main(String[] args) {

    }
}
