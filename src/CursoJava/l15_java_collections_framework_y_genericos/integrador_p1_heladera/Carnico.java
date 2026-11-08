package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_heladera;

import java.time.LocalDate;

public class Carnico extends Producto {
  private final String tipoCorte;
  private final double peso;

  public Carnico(String nombre, int cantidad, String marca, String tipoCorte,
      double peso, LocalDate fechaVencimiento) {
    super(nombre, cantidad, marca, fechaVencimiento);
    this.tipoCorte = tipoCorte;
    this.peso = peso;
  }

  @Override
  public String getDetallesEspecificos() {
    return String.format("Tipo de corte: %s, Peso: %.2f kg, Vencimiento: %s",
        tipoCorte, peso, getFechaVencimiento());
  }

  @Override
  public String toString() {
    return String.format("Cárnico: %s, Cantidad: %d, Marca: %s, %s",
        getNombre(), getCantidad(), getMarca(), getDetallesEspecificos());
  }
}
