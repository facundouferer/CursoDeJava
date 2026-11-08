package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_heladera;

import java.time.LocalDate;

public abstract class Producto {
  private String nombre;
  private int cantidad;
  private String marca;
  private final LocalDate fechaVencimiento;

  public Producto(String nombre, int cantidad, String marca, LocalDate fechaVencimiento) {
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.marca = marca;
    this.fechaVencimiento = fechaVencimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public LocalDate getFechaVencimiento() {
    return fechaVencimiento;
  }

  public abstract String getDetallesEspecificos();
}
