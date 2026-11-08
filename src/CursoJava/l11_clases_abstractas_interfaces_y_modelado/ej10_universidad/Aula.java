package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class Aula implements Informe {
  private final Docente docente;
  private final Estudiante[] estudiantes;

  // Agregación: el aula recibe docente y estudiantes que ya existían y les sobreviven.
  public Aula(Docente docente, Estudiante[] estudiantes) {
    this.docente = docente;
    this.estudiantes = estudiantes;
  }

  @Override
  public String generarInforme(String titulo) {
    StringBuilder informe = new StringBuilder(titulo + "\n");
    informe.append(docente.generarInforme("Docente")).append("\n");
    informe.append("Estudiantes:");
    for (Estudiante estudiante : estudiantes) {
      informe.append(estudiante.generarInforme("Estudiante"));
    }
    return informe.toString();
  }
}
