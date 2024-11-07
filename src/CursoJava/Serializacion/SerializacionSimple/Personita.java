package CursoJava.Serializacion.SerializacionSimple;
import java.io.Serializable;

class Personita implements Serializable {
    private String nombre;
    private int dni;

    public Personita(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String toString() {
        return this.nombre + " (" + this.dni + ")";
    }

}
