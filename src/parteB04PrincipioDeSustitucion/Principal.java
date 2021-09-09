package parteB04PrincipioDeSustitucion;

public class Principal {
    public static void main(String[] args) {

        /**
         * Principio de Sustitución
         *
         * Sea ?(x) una propiedad comprobable acerca de los objetos x de tipo T.
         * Entonces ?(y) debe ser verdad para los objetos y del tipo S donde S, es un subtipo de T.
         *
         * O sea que:
         * Cada clase que hereda de otra puede usarse como su padre
         * sin necesidad de conocer las diferencias entre ellas.
         */

        Profesor[] profesores = new Profesor[3];

        profesores[0] = new Profesor(12332123, "Carlos", "TSP");
        profesores[1] = new Profesor(25147789, "Sabrina", "ISI");
        profesores[2] = new Profesor(12951478, "Rita", "IQ");

        for (Profesor profesor : profesores) {
            System.out.println(profesor.toString());
        }

        System.out.println("\n------------------");

        /**
         * Por principio de sustitución podríamos almacenar un profesor en un array de
         * Empleados.
         *
         * si una clase ES UN de otra clase, entonces la primra puede ser almacenada
         * en la segunda.
         * como un profesor es un epleado, entonces un profesor puede ser almacenado
         * en empleados.
         */

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado(12332123, "Carlos");
        empleados[1] = new Profesor(25147789, "Sabrina", "ISI"); //Esto lo podemos hacer por el principio de sustitución.
        empleados[2] = new Empleado(12951478, "Rita");


        for (Empleado empleado : empleados) {

            /**
             * a pesar que la variable es de tipo empleado
             * cuando se ve el toString del Profesor se ocupa el toString()
             * de profesores gracias al POLIMORFISMO
             * dependeindo del contexto una misma variable
             * puede comportarse de una forma o de otra.
             * Esto también es posible al ENTRELAZAMIENTO DINÁMICO
             * que es cuando el interprete JAVA es capaz de detectar
             * a en cada caso a que método debe llamar.
             */

            System.out.println(empleado.toString());
        }

    }

}

class Empleado {

    private int dni;
    private String nombre;

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

}

class Profesor extends Empleado {

    private String carrera;

    public Profesor(int dni, String nombre, String carrera) {
        super(dni, nombre);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Profesor [CARRERA = " + carrera + ", NOMBRE = " + super.getNombre() + ", DNI = " + super.getDni() + "]";
    }


}
