package CursoJava.NameSpaces.modelos;

public class Estudiante extends Persona {
  private String carrera;

  public Estudiante(String nombre, String carrera) {
    super(nombre);
    this.carrera = carrera;
  }

  public String getCarrera() {
    return carrera;
  }

}
