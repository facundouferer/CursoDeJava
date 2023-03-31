package pre2023.parteB05CastingDeObjetos;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(Empleado.getFacultad() + "\n");

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado(12332123, "Carlos");
        /*
         * UPCASTING: cuando almacenamos un clase en su superclase.
         * es decir una clase de abajo, la almacenamos arriba.
         */
        empleados[1] = new Profesor(25147789, "Sabrina", "ISI"); //UpCasting o Casting implícito
        empleados[2] = new Empleado(12951478, "Rita");


        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }

        System.out.println("-------------");

        /*
         * DOWNCASTING: es cuando almacenamos una superclase en su clase
         * pero no se puede hacer así nomás.
         * Primero debemos CASTEAR a la superclase para que entre en la clase hija.
         * porque si bien un Empleado es un profesor, no todo empleado
         * es profesor.
         */

        Profesor[] profesores = new Profesor[3];

        profesores[0] = new Profesor(12332123, "Carlos", "TUP");

        Empleado empleadoParaCastear = new Profesor(25147789, "Sabrina", "TUP"); //DOWNCASTING o casting explícito 1) hago Upcasting
        profesores[1] = (Profesor) empleadoParaCastear; //DOWNCASTING o casting explícito 2) logro el DownCasting

        profesores[2] = new Profesor(12951478, "Rita", "IQ");

        for (Empleado profesor : profesores) {
            System.out.println(profesor.toString());
        }

    }

}




class Empleado {

    private int dni;
    private String nombre;
    private static String facultad = "UTN_FRR";

    public Empleado(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre + "]";
    }

    /*
     * Método estático: para probar como hacerlo
     * NO necesita que la clase sea instanciada para ser utilizado.
     */

    public static String getFacultad() {
        return facultad;

    }

}



class Profesor extends Empleado {

    private String carrera;

    public Profesor(int dni, String nombre, String carrera) {
        super(dni, nombre);
        this.carrera = carrera;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Profesor [CARRERA = " + carrera + ", NOMBRE = " + super.getNombre() + ", DNI = " + super.getDni() + "]";
    }


}



