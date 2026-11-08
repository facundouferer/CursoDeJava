package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.ej02_banco;

import java.util.Objects;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Modelar un cliente del banco cuya identidad es su DNI.
 * Concepto: 5. El contrato equals y 6. hashCode.
 */
public class Cliente {
  private final String nombre;
  private final String nroCuenta;
  private final double saldo;
  private final int dni;

  public Cliente(String nombre, String nroCuenta, double saldo, int dni) {
    this.nombre = nombre;
    this.nroCuenta = nroCuenta;
    this.saldo = saldo;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public String getNroCuenta() {
    return nroCuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public int getDni() {
    return dni;
  }

  /** Dos clientes son iguales si tienen el mismo DNI. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Cliente otro)) {
      return false;
    }
    return dni == otro.dni;
  }

  /** Coherente con equals: usa solo el DNI. */
  @Override
  public int hashCode() {
    return Objects.hash(dni);
  }

  @Override
  public String toString() {
    return "Cliente [nombre=" + nombre + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + ", dni=" + dni + "]";
  }
}
