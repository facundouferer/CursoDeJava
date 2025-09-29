package Practica.Universidad;

public class Aula implements Informe {

  private Docente docente;
  private Estudiante[] estudiantes;

  public Aula(Docente docente, Estudiante[] estudiantes) {
    this.docente = docente;
    this.estudiantes = estudiantes;
  }

  @Override
  public String generarInforme(String titulo) {
    String informe = "Informe del aula\n";
    informe += "Docente: " + docente.generarInforme("Docente") + "\n";
    informe += "Estudiantes:\n";
    for (Estudiante estudiante : estudiantes) {
      informe += estudiante.generarInforme("Estudiante") + "\n";
    }
    return "Informe del aula";
  }

}
