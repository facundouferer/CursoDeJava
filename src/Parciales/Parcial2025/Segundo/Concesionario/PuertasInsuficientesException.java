package Parciales.Parcial2025.Segundo.Concesionario;

/**
 * Excepción personalizada que se lanza cuando se intenta crear un auto
 * con menos de 3 puertas.
 * 
 * Esta es una excepción verificada (checked exception) que debe ser
 * manejada obligatoriamente por el código que llama.
 */
public class PuertasInsuficientesException extends Exception {

  /**
   * Constructor que recibe un mensaje personalizado
   * 
   * @param mensaje El mensaje descriptivo del error
   */
  public PuertasInsuficientesException(String mensaje) {
    super(mensaje);
  }

  /**
   * Constructor por defecto con mensaje predeterminado
   */
  public PuertasInsuficientesException() {
    super("Error: Un auto debe tener al menos 3 puertas");
  }

}