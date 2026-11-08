package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_veterinaria;

/** Animal atendido en la veterinaria. Dos animales son iguales si comparten nombre. */
abstract class Animalito {

  protected final String especie;
  protected final int edad;
  protected final String nombre;
  protected final double peso;

  protected Animalito(String especie, int edad, String nombre, double peso) {
    this.especie = especie.toUpperCase();
    this.edad = edad;
    this.nombre = nombre.toUpperCase();
    this.peso = peso;
  }

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

  /** Nombre del tipo de animal, usado al mostrarlo. */
  public abstract String getTipo();

  @Override
  public String toString() {
    return especie + "\t" + edad + " años\t" + nombre + "\t" + peso + " kg";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Animalito otro = (Animalito) obj;
    return nombre.equals(otro.nombre);
  }

  @Override
  public int hashCode() {
    return nombre.hashCode();
  }
}
