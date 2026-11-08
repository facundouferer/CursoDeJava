package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej05_cuenta;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Modelar una cuenta con titular y saldo, con ingresos y retiros validados.
 * Concepto: 6. Ejercicio práctico guiado: sistema de gestión de cuentas bancarias.
 */
public class Cuenta {

    private String titular;
    private double cantidad;

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

    // Una cantidad negativa o cero no modifica el saldo.
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Si el retiro supera el saldo disponible, el saldo queda en cero.
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nSaldo: $" + cantidad;
    }
}
