package CursoJava.l09_arrays_de_objetos.integrador_p1_encuestadora;

public class Encuesta extends Persona {
  private int puntaje; // de 1 a 5

  public Encuesta(String nombre, int puntaje) {
    super(nombre);
    this.puntaje = puntaje;
  }

  public int getPuntaje() {
    return puntaje;
  }

  public void setPuntaje(int puntaje) {
    this.puntaje = puntaje;
  }

  @Override
  public String mostrarInfo() {
    return super.mostrarInfo() + " - Puntaje: " + puntaje;
  }
}
