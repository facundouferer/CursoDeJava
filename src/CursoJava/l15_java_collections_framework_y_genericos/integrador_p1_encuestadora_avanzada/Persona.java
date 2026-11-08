package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_encuestadora_avanzada;

public class Persona implements Informable {
  private String nombre;

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String mostrarInfo() {
    return nombre;
  }
}
