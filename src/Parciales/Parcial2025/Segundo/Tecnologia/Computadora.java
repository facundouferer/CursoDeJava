package Parciales.Parcial2025.Segundo.Tecnologia;

abstract class Computadora {
  protected String marca;
  protected int modelo;
  protected String numeroSerie;
  protected int horasUso;

  public Computadora(String marca, int modelo, String numeroSerie, int horasUso) {
    this.marca = marca.toUpperCase();
    this.modelo = modelo;
    this.numeroSerie = numeroSerie.toUpperCase();
    this.horasUso = horasUso;
  }

  // Getters
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

  // Setters
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setModelo(int modelo) {
    this.modelo = modelo;
  }

  public void setNumeroSerie(String numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  public void setHorasUso(int horasUso) {
    this.horasUso = horasUso;
  }

  public abstract String verTipoDeComputadora();

  // Método toString
  @Override
  public String toString() {
    return marca + "'\\t" + modelo + "\\t" + numeroSerie + "\\t" + horasUso + "hrs";
  }

}