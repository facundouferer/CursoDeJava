package Parciales.Parcial2025.Segundo.Veterinaria;

/**
 * Excepción personalizada que se lanza cuando se intenta crear un animal
 * avícola
 * con menos de 1kg de peso.
 * 
 * Esta es una excepción verificada (checked exception) que debe ser
 * manejada obligatoriamente por el código que llama.
 */
public class PesoInsuficienteException extends Exception {

  /**
   * Constructor que recibe un mensaje personalizado
   * 
   * @param mensaje El mensaje descriptivo del error
   */
  public PesoInsuficienteException(String mensaje) {
    super(mensaje);
  }

  /**
   * Constructor por defecto con mensaje predeterminado
   */
  public PesoInsuficienteException() {
    super("Error: Un animal avícola debe tener al menos 1kg de peso");
  }

}