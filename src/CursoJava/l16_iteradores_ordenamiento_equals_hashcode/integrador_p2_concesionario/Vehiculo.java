package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_concesionario;

/** Vehículo del concesionario. Dos vehículos son iguales si comparten patente. */
abstract class Vehiculo {

  protected final String marca;
  protected final int modelo;
  protected final String patente;
  protected final int kilometraje;

  protected Vehiculo(String marca, int modelo, String patente, int kilometraje) {
    this.marca = marca.toUpperCase();
    this.modelo = modelo;
    this.patente = patente.toUpperCase();
    this.kilometraje = kilometraje;
  }

  public String getMarca() {
    return marca;
  }

  public int getModelo() {
    return modelo;
  }

  public String getPatente() {
    return patente;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  /** Nombre del tipo de vehículo, usado al mostrarlo. */
  public abstract String getTipo();

  @Override
  public String toString() {
    return marca + "\t" + modelo + "\t" + patente + "\t" + kilometraje + " km";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Vehiculo otro = (Vehiculo) obj;
    return patente.equals(otro.patente);
  }

  @Override
  public int hashCode() {
    return patente.hashCode();
  }
}
