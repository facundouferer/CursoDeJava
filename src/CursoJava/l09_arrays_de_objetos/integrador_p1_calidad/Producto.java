package CursoJava.l09_arrays_de_objetos.integrador_p1_calidad;

public class Producto {
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

  public String mostrarInfo() {
    return "Código: " + codigo + " - Nombre: " + nombre;
  }
}
