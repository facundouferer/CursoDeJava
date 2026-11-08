package CursoJava.l12_excepciones_y_manejo_de_errores.ej15_microprocesadores;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: representar un microprocesador identificado por su número de producto.
 * Concepto: §10 Ejercicio práctico guiado (clase de dominio que carga AdminMicro).
 */
public class Micro {

  private final int nroProducto;
  private final int nucleos;
  private final double frecuencia;
  private final double memoria;
  private final String modelo;

  public Micro(int nroProducto, int nucleos, double frecuencia, double memoria, String modelo) {
    this.nroProducto = nroProducto;
    this.nucleos = nucleos;
    this.frecuencia = frecuencia;
    this.memoria = memoria;
    this.modelo = modelo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Micro otro = (Micro) obj;
    return nroProducto == otro.nroProducto;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(nroProducto);
  }

  @Override
  public String toString() {
    return nroProducto + "\t" + modelo + "\t" + nucleos + " núcleos\t" + frecuencia + " GHz\t" + memoria + " MB";
  }
}
