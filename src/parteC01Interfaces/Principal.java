package parteC01Interfaces;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Profesores[] profesores = new Profesores[3];

        profesores[0] = new Profesores(12332123, "Carlos", "TUP");

        Personas empleadoParaCastear = new Profesores(25147789, "Sabrina", "TUP"); //DOWNCASTING o casting explícito 1) hago Upcasting

        profesores[1] = (Profesores) empleadoParaCastear; //DOWNCASTING o casting explícito 2) logro el DownCasting

        profesores[2] = new Profesores(12951478, "Rita", "IQ");

        for (Personas profesor : profesores) {
            System.out.println(profesor.toString());
        }

    }
}



abstract class Personas {
    /*
     * Empleado es una clase abstracta porque tien por lo menos un método abstracto
     * y este méodo abstracto obliga a sus clases hijes a implementarlos.
     */

    private int dni;
    private String nombre;
    private static String facultad = "UTN_FRR";

    public Personas(int dni, String nombre) {
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

interface ParaProfesores {

    public static final String clase = "";

    public abstract void modificarPromedio(Estudiante estudiante, double promedio);

}


/*
 * Profesores no sólo hereda de Personas, sino que
 * implementa la interface ParaPRofesores, que es
 * como si tuviera doble herencia y está obligado
 * a implementar todos los métodos de la interface
 * - Se pueden implementar la cantidad de interfaces que necesitemos
 */

class Profesores extends Personas implements ParaProfesores {

    private String carrera;

    public Profesores(int dni, String nombre, String carrera) {
        super(dni, nombre);
        this.carrera = carrera;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Profesor [CARRERA = " + carrera + ", NOMBRE = " + super.getNombre() + ", DNI = " + super.getDni() + "]";
    }

    @Override
    public void modificarPromedio(Estudiante estudiante, double promedio) {
        // TODO Auto-generated method stub
        estudiante.setPromedio(promedio);
    }

}

class Estudiante extends Personas {

    private double promedio;

    public Estudiante(int dni, String nombre) {
        super(dni, nombre);
        // TODO Auto-generated constructor stub
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }


}
