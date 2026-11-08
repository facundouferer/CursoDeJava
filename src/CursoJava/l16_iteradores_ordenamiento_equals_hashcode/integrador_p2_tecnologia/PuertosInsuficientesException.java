package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_tecnologia;

/** Se lanza al crear o modificar un escritorio con menos de 5 puertos (excepción verificada). */
class PuertosInsuficientesException extends Exception {

  public PuertosInsuficientesException(String mensaje) {
    super(mensaje);
  }

  public PuertosInsuficientesException() {
    this("Un escritorio debe tener al menos 5 puertos");
  }
}
