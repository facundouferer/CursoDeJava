package CursoJava.l11_clases_abstractas_interfaces_y_modelado.integrador_p1_universidad;

public class Estudiante extends Persona {
  private static final String SIN_DEFINIR = "Sin definir";

  private String carrera;

  public Estudiante(String nombre, String apellido, int dni, String carrera) {
    super(nombre, apellido, dni);
    this.carrera = carrera;
  }

  public Estudiante(String nombre, String apellido, int dni) {
    this(nombre, apellido, dni, SIN_DEFINIR);
  }

  public void modificarCarrera(String nuevaCarrera) {
    this.carrera = nuevaCarrera;
  }

  @Override
  public String toString() {
    return super.toString() + " - Carrera: " + carrera;
  }
}
