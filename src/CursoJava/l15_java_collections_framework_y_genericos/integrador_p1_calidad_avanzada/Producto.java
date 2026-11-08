package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_calidad_avanzada;

public class Producto implements Auditable {
  private int codigo;
  private String nombre;

  public Producto(int codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String mostrarInfo() {
    return "Código: " + codigo + " - Nombre: " + nombre;
  }
}
