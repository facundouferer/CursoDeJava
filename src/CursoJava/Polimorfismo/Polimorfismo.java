package CursoJava.Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        /**
         * Polimorfismo:
         * Uno de los 4 pilares de la programaci�n orientada a objetos (POO) junto con la Abstracci�n,
         * Encapsulaci�n y Herencia.
         *
         * Es la propiedad por la que es posible enviar mensajes
         * sint�cticamente iguales a objetos de tipos distintos
         */

        Jefe jefe = new Jefe(50000);
        Empleado empleado = new Empleado(50000);

        System.out.println(jefe.getSueldo());
        System.out.println(empleado.getSueldo());

    }
}

class Empleado{
    private double sueldo;

    public Empleado(double sueldo){
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return this.sueldo;
    }
}

class Jefe extends Empleado{

    private double extra = 1.2;

    public Jefe(double sueldo) {
        super(sueldo);
    }

    public double getSueldo(){
        return super.getSueldo()*this.extra;
    }

}
