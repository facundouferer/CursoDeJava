package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class Estudiante extends Persona {
  private final String carrera;

  public Estudiante(String nombre, String apellido, int dni, String carrera) {
    super(nombre, apellido, dni);
    this.carrera = carrera;
  }

  @Override
  public String generarInforme(String titulo) {
    return super.generarInforme(titulo) + "\nCarrera: " + carrera;
  }
}
