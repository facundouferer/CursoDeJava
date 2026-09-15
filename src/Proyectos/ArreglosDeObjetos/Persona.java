package Proyectos.ArreglosDeObjetos;

abstract class Persona {

    protected int dni;
    protected String nombre;
    // Cuenta corriente vista desde la empresa: positivo = la persona debe, negativo = se le debe
    protected double saldo;

    protected Persona(int dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public abstract double transaccion(double monto);

}