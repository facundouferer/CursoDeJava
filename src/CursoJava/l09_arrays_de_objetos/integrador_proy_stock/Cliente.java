package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

/** El cliente suma el monto a su saldo. */
public class Cliente extends Persona {

  public Cliente(int dni, String nombre, double saldo) {
    super(dni, nombre, saldo);
  }

  @Override
  public double transaccion(double monto) {
    this.saldo += monto;
    return saldo;
  }
}
