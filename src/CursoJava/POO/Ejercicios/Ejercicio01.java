package Ejercicios;

/**
 * Ejercicio 1:
 * Crea una clase llamada Cuenta que tendr� los siguientes atributos:
 * 1. titular y cantidad (puede tener decimales). Crear sus m�todos get, set.
 * 2. Crear dos constructores que permitan crear una cuenta para un titular y la
 * cantidad.
 * Tendr� dos m�todos especiales:
 * 1. ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la
 * cantidad introducida
 * es negativa, no se har� nada.
 * 2. retirar(double cantidad): se retira una cantidad a la cuenta, si restando
 * la cantidad actual
 * a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        // Creamos una cuenta con titular y cantidad
        Cuenta cuenta1 = new Cuenta("Juan P�rez", 1500);

        // Creamos una cuenta con solo titular (cantidad por defecto es 0)
        Cuenta cuenta2 = new Cuenta("Mar�a Gonz�lez");

        Cuenta cuenta3 = new Cuenta("Carlitos", 1231243123);

        // Realizamos algunas operaciones con las cuentas
        cuenta1.ingresar(500);
        cuenta2.retirar(200);
        cuenta3.ingresar(1000000);

        // Imprimimos los datos de las cuentas
        System.out.println("Cuenta 1: " + cuenta1.getTitular() + " - Saldo: " + cuenta1.getCantidad());
        System.out.println("Cuenta 2: " + cuenta2.getTitular() + " - Saldo: " + cuenta2.getCantidad());
        System.out.println("Cuenta 3: " + cuenta3.getTitular() + " - Saldo: " + cuenta3.getCantidad());
        System.out.println(cuenta3.toString());
    }
}

class Cuenta {

    // Atributos
    private String titular;
    private double cantidad;

    // Constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public Cuenta() {
        this("", 0);
    }

    // M�todos Get y Set
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // M�todos especiales
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    // toString
    @Override
    public String toString() {
        return "titular=" + this.titular + "\n$" + this.cantidad;
    }

}
