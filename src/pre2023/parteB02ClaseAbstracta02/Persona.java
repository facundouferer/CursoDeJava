package pre2023.parteB02ClaseAbstracta02;

abstract public class Persona {

    /*
     * Personas es una clase abstracta porque tien por lo menos un método abstracto
     * y este méodo abstracto obliga a sus clases hijes a implementarlos.
     */

    private int dni;
    private String nombre;
    private static String facultad = "UTN_FRR";

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract String toString();

    /*
     * Método estático: para probar como hacerlo
     * NO necesita que la clase sea instanciada para ser utilizado.
     */

    public static String getFacultad() {
        return facultad;

    }

}
