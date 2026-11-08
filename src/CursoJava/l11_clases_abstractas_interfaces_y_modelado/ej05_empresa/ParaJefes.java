package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej05_empresa;

/** Contrato de quienes toman decisiones. */
public interface ParaJefes {
  String tomarDecisiones(String decision);

  // Método estático de la interfaz: no se hereda, se invoca con el nombre de la interfaz.
  static String tomarDecisiones() {
    return "Decisión postergada: falta información para resolver.";
  }
}
