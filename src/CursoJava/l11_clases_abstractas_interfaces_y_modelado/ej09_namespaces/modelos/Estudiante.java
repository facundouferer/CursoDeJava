package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej09_namespaces.modelos;

public class Estudiante extends Persona {
  private final String carrera;

  public Estudiante(String nombre, int dni, String carrera) {
    super(nombre, dni);
    this.carrera = carrera;
  }

  public String getCarrera() {
    return carrera;
  }
}
