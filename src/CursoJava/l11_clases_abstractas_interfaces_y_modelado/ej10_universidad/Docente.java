package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class Docente extends Empleado {
  private final String materia;

  public Docente(String nombre, String apellido, int dni, double sueldo, String materia) {
    super(nombre, apellido, dni, sueldo);
    this.materia = materia;
  }

  public String getMateria() {
    return materia;
  }

  @Override
  public String generarInforme(String titulo) {
    return super.generarInforme(titulo) + "\nMateria: " + materia;
  }
}
