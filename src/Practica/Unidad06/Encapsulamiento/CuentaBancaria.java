package Practica.Unidad06.Encapsulamiento;

class CuentaBancaria {
  private double saldo;
  String numeroCuenta;

  public CuentaBancaria(String numeroCuenta, double saldoInicial) {
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldoInicial;
  }

  public void depositar(double cantidad) {
    saldo += cantidad;
  }

  public void retirar(double cantidad) {
    if (saldo >= cantidad) {
      saldo -= cantidad;
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void verSaldo() {
    System.out.println("Saldo: " + saldo);
  }

  public static void main(String[] args) {
    CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000);
    cuenta.depositar(500);
    cuenta.retirar(200);
    cuenta.verSaldo();
  }
}
