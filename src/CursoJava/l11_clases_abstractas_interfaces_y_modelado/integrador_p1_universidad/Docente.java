package CursoJava.l11_clases_abstractas_interfaces_y_modelado.integrador_p1_universidad;

public class Docente extends Persona implements InformeDeDatos {
  private final Materia[] materias;

  public Docente(String nombre, String apellido, int dni, Materia[] materias) {
    super(nombre, apellido, dni);
    this.materias = materias;
  }

  @Override
  public String informe() {
    return "El docente " + super.toString() + " dicta materias:";
  }

  public void mostrarMaterias() {
    for (Materia materia : materias) {
      System.out.println(materia);
    }
  }
}
