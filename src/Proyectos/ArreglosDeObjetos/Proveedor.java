package Proyectos.ArreglosDeObjetos;

class Proveedor extends Persona {

    public Proveedor(int dni, String nombre, double saldo) { super(dni, nombre, saldo); }

    @Override
    public double transaccion(double monto) {
        this.saldo -= monto;
        return this.saldo;
    }
}