package CursoJava.EstructurasDinamicas.ProductosDeLimpieza;

class Producto {
  private int codigo;
  private String nombre, marca;
  private double precio;

  public Producto(int codigo, String nombre, String marca, double precio) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.marca = marca;
    this.precio = precio;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Producto otro = (Producto) obj;
    return this.codigo == otro.codigo;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(codigo);
  }

  public int getCodigo() {
    return codigo;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return codigo + "\t" + nombre + "\t" + marca + "\t$ " + precio;
  }

}
