package Proyectos.ArreglosDeObjetos;

class Vendedor extends Persona {

    public Vendedor(int dni, String nombre, double saldo) { super(dni, nombre, saldo); }

    @Override
    public double transaccion(double monto) {
        this.saldo += monto * 0.10;             // cobra comisión: hace algo propio
        return this.saldo;
    }
}