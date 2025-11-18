package Parciales.Parcial2025.Segundo.Veterinaria;

abstract class Animalito {
  protected String especie;
  protected int edad;
  protected String nombre;
  protected double peso;

  public Animalito(String especie, int edad, String nombre, double peso) {
    this.especie = especie.toUpperCase();
    this.edad = edad;
    this.nombre = nombre.toUpperCase();
    this.peso = peso;
  }

  // Getters
  public String getEspecie() {
    return especie;
  }

  public int getEdad() {
    return edad;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPeso() {
    return peso;
  }

  // Setters
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public abstract String verTipoDeAnimal();

  // Método toString
  @Override
  public String toString() {
    return especie + "\t" + edad + " años\t" + nombre + "\t" + peso + "Kg";
  }

  // Método equals basado en nombre
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Animalito animalito = (Animalito) obj;
    return nombre.equals(animalito.nombre);
  }

  // Método hashCode basado en nombre
  @Override
  public int hashCode() {
    return nombre.hashCode();
  }
}