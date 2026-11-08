package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

/** El proveedor reduce su saldo con el monto. */
public class Proveedor extends Persona {

  public Proveedor(int dni, String nombre, double saldo) {
    super(dni, nombre, saldo);
  }

  @Override
  public double transaccion(double monto) {
    this.saldo -= monto;
    return saldo;
  }
}
