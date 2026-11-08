package CursoJava.l08_constructores_y_encapsulamiento;

/*
 * Lección 08 – Constructores y encapsulamiento
 * Objetivo: operar una cuenta bancaria cuyo saldo solo cambia mediante depósitos y retiros.
 * Concepto: 4. Encapsulamiento y 6. Getters y setters bien hechos.
 */
public class Ej03CuentaBancaria {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.mostrarSaldo();
    }
}

class CuentaBancaria {

    private final String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("El monto a depositar debe ser positivo.");
            return;
        }
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= cantidad;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
