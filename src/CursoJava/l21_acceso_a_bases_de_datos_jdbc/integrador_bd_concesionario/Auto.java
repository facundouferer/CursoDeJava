package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_concesionario;

/** Auto del catálogo del concesionario. */
public class Auto {

  private final int autoId;
  private final String marca;
  private final String modelo;
  private final int anio;

  public Auto(int autoId, String marca, String modelo, int anio) {
    this.autoId = autoId;
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }

  public int getAutoId() {
    return autoId;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAnio() {
    return anio;
  }

  @Override
  public String toString() {
    return "Auto{autoId=" + autoId + ", marca='" + marca + "', modelo='" + modelo
        + "', anio=" + anio + "}";
  }
}
