package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_veterinaria;

/** Se lanza al crear un animal avícola con menos de 1 kg de peso (excepción verificada). */
class PesoInsuficienteException extends Exception {

  public PesoInsuficienteException(String mensaje) {
    super(mensaje);
  }

  public PesoInsuficienteException() {
    this("Un animal avícola debe pesar al menos 1 kg");
  }
}
