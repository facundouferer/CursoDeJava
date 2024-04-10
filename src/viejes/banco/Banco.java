package viejes.banco;

public class Banco {
    public static void main(String[] args) {
        // INSTANCIAR UN OBJETO
        Cliente cliente = new Cliente("Juan Perez", 2000000);
        System.out.println(cliente.toString());
    }
}

// create class Caja
class Caja {

    public void depositar(Cliente cliente, double monto) {
        cliente.setSaldo(cliente.getSaldo() + monto);
        System.out.println("Saldo actual: " + cliente.getSaldo());
    }

    public void retirar(Cliente cliente, double monto) {
        cliente.setSaldo(cliente.getSaldo() - monto);
        System.out.println("Saldo actual: " + cliente.getSaldo());
    }

}

class Cliente {

    private String nombre;
    private double saldo;

    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}