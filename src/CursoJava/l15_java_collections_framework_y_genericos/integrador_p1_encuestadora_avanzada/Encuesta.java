package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_encuestadora_avanzada;

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
