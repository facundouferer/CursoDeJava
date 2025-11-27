package Parciales.Parcial2025.Segundo.Concesionario;

abstract class Vehiculo {
  protected String marca;
  protected int modelo;
  protected String patente;
  protected int kilometraje;

  public Vehiculo(String marca, int modelo, String patente, int kilometraje) {
    this.marca = marca.toUpperCase();
    this.modelo = modelo;
    this.patente = patente.toUpperCase();
    this.kilometraje = kilometraje;
  }

  // Getters
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

  // Setters
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setModelo(int modelo) {
    this.modelo = modelo;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public void setKilometraje(int kilometraje) {
    this.kilometraje = kilometraje;
  }

  public abstract String verTipoDeVehiculo();

  // Método toString
  @Override
  public String toString() {
    return marca + "'\t" + modelo + "\t" + patente + "\t" + kilometraje + "Km";
  }

  // Método equals basado en patente
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Vehiculo vehiculo = (Vehiculo) obj;
    return patente.equals(vehiculo.patente);
  }

  // Método hashCode basado en patente
  @Override
  public int hashCode() {
    return patente.hashCode();
  }
}