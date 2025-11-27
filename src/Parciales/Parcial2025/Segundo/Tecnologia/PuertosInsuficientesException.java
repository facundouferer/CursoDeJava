package Parciales.Parcial2025.Segundo.Tecnologia;

/**
 * Excepción personalizada que se lanza cuando se intenta crear un escritorio
 * con menos de 5 puertos.
 * 
 * Esta es una excepción verificada (checked exception) que debe ser
 * manejada obligatoriamente por el código que llama.
 */
public class PuertosInsuficientesException extends Exception {

  /**
   * Constructor que recibe un mensaje personalizado
   * 
   * @param mensaje El mensaje descriptivo del error
   */
  public PuertosInsuficientesException(String mensaje) {
    super(mensaje);
  }

  /**
   * Constructor por defecto con mensaje predeterminado
   */
  public PuertosInsuficientesException() {
    super("Error: Un escritorio debe tener al menos 5 puertos");
  }

}