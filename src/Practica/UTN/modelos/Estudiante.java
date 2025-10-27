package Practica.UTN.modelos; // namespace declaration

public class Estudiante extends Persona {
  private String carrera;

  public Estudiante(String nombre, int dni, String carrera) {
    super(nombre, dni);
    this.carrera = carrera;
  }

  @Override
  public String toString() {
    return super.toString() + "\t" + carrera;
  }
}
