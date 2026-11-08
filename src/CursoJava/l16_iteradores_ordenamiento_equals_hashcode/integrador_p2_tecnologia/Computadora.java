package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_tecnologia;

/** Computadora del inventario. Dos computadoras son iguales si comparten número de serie. */
abstract class Computadora {

  protected final String marca;
  protected final int modelo;
  protected final String numeroSerie;
  protected final int horasUso;

  protected Computadora(String marca, int modelo, String numeroSerie, int horasUso) {
    this.marca = marca.toUpperCase();
    this.modelo = modelo;
    this.numeroSerie = numeroSerie.toUpperCase();
    this.horasUso = horasUso;
  }

  public String getMarca() {
    return marca;
  }

  public int getModelo() {
    return modelo;
  }

  public String getNumeroSerie() {
    return numeroSerie;
  }

  public int getHorasUso() {
    return horasUso;
  }

  /** Nombre del tipo de computadora, usado al mostrarlo. */
  public abstract String getTipo();

  @Override
  public String toString() {
    return marca + "\t" + modelo + "\t" + numeroSerie + "\t" + horasUso + " hrs";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Computadora otro = (Computadora) obj;
    return numeroSerie.equals(otro.numeroSerie);
  }

  @Override
  public int hashCode() {
    return numeroSerie.hashCode();
  }
}
