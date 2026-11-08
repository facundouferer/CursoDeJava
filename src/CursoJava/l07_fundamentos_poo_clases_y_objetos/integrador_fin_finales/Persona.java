package CursoJava.l07_fundamentos_poo_clases_y_objetos.integrador_fin_finales;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona(String nombre, String apellido, int dni) {
        setDatos(nombre, apellido, dni);
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
