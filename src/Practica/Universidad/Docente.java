package Practica.Universidad;

class Docente extends Empleado {
  private String materia;

  public Docente(String nombre, String apellido, int DNI, double sueldo, String materia) {
    super(nombre, apellido, DNI, sueldo);
    this.materia = materia;
  }

  public String getMateria() {
    return materia;
  }

  @Override
  public String generarInforme(String titulo) {
    String informe = titulo;
    informe += super.generarInforme("Datos del Docente");
    informe += "\nMateria: " + materia;
    informe += "\nSueldo: " + getSueldo();
    return informe;
  }
}
