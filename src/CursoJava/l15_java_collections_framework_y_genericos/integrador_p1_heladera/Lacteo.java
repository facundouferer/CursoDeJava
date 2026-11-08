package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_heladera;

import java.time.LocalDate;

public class Lacteo extends Producto {
  private final String tipoLeche;
  private final double porcentajeGrasa;

  public Lacteo(String nombre, int cantidad, String marca, String tipoLeche,
      double porcentajeGrasa, LocalDate fechaVencimiento) {
    super(nombre, cantidad, marca, fechaVencimiento);
    this.tipoLeche = tipoLeche;
    this.porcentajeGrasa = porcentajeGrasa;
  }

  @Override
  public String getDetallesEspecificos() {
    return String.format("Tipo de leche: %s, %% de grasa: %.2f, Vencimiento: %s",
        tipoLeche, porcentajeGrasa, getFechaVencimiento());
  }

  @Override
  public String toString() {
    return String.format("Lácteo: %s, Cantidad: %d, Marca: %s, %s",
        getNombre(), getCantidad(), getMarca(), getDetallesEspecificos());
  }
}
