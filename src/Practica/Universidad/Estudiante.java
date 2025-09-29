package Practica.Universidad;

class Estudiante extends Persona {
  private String carrera;

  public Estudiante(String nombre, String apellido, int DNI, String carrera) {
    super(nombre, apellido, DNI);
    this.carrera = carrera;
  }
}
