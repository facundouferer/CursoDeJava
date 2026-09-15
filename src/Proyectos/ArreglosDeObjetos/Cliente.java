package Proyectos.ArreglosDeObjetos;

class Cliente extends Persona {

    public Cliente(int dni, String nombre, double saldo) { super(dni, nombre, saldo); }

    @Override
    public double transaccion(double monto) {
        this.saldo += monto;                    // asigna, no solo calcula
        return this.saldo;
    }

}
