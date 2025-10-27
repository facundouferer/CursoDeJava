package Practica.UTN.modelos;

class Persona {
  private String nombre;
  private int dni;

  public Persona(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  @Override
  public String toString() {
    return "\t" + nombre + "\t" + dni;
  }

}
