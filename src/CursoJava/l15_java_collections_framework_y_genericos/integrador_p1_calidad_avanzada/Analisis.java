package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_calidad_avanzada;

public class Analisis extends Producto {
  private int puntaje; // de 1 a 5

  public Analisis(int codigo, String nombre, int puntaje) {
    super(codigo, nombre);
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
    return super.mostrarInfo() + " - Calidad: " + puntaje;
  }
}
