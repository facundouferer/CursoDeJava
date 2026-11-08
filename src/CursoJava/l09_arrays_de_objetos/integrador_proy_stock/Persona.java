package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

/** Persona con la que opera la empresa; su saldo se ve desde la empresa (positivo: debe). */
public abstract class Persona {

  protected final int dni;
  protected final String nombre;
  protected double saldo;

  protected Persona(int dni, String nombre, double saldo) {
    this.dni = dni;
    this.nombre = nombre;
    this.saldo = saldo;
  }

  /** Aplica una transacción por el monto indicado y devuelve el saldo resultante. */
  public abstract double transaccion(double monto);
}
