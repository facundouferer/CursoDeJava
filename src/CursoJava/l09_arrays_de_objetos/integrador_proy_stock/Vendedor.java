package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

/** El vendedor cobra una comisión del 10 % del monto. */
public class Vendedor extends Persona {

  public Vendedor(int dni, String nombre, double saldo) {
    super(dni, nombre, saldo);
  }

  @Override
  public double transaccion(double monto) {
    this.saldo += monto * 0.10;
    return saldo;
  }
}
