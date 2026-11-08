package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_concesionario;

import java.sql.Date;

/** Venta de una cantidad de unidades de un auto realizada por una persona. */
public class VentaAuto {

  private final int ventaId;
  private final int personaId;
  private final int autoId;
  private final int cantidadVendida;
  private final Date fechaVenta;

  public VentaAuto(int ventaId, int personaId, int autoId, int cantidadVendida,
      Date fechaVenta) {
    this.ventaId = ventaId;
    this.personaId = personaId;
    this.autoId = autoId;
    this.cantidadVendida = cantidadVendida;
    this.fechaVenta = fechaVenta;
  }

  @Override
  public String toString() {
    return "VentaAuto{ventaId=" + ventaId + ", personaId=" + personaId + ", autoId=" + autoId
        + ", cantidadVendida=" + cantidadVendida + ", fechaVenta=" + fechaVenta + "}";
  }
}
