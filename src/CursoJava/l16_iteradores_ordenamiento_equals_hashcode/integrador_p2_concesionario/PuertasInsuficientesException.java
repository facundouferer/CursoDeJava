package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_concesionario;

/** Se lanza al crear o modificar un auto con menos de 3 puertas (excepción verificada). */
class PuertasInsuficientesException extends Exception {

  public PuertasInsuficientesException(String mensaje) {
    super(mensaje);
  }

  public PuertasInsuficientesException() {
    this("Un auto debe tener al menos 3 puertas");
  }
}
