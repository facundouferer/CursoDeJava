/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Controlar un televisor cuyo comportamiento cambia según esté encendido o apagado.
 * Concepto: Interfaz como contrato de cada estado (patrón State); el contexto delega en
 *           la implementación del estado actual.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado;

public class Ej06PatronState {

  // Contrato que todo estado debe cumplir.
  interface EstadoTV {
    void encender();

    void apagar();

    void subirVolumen();

    void bajarVolumen();
  }

  static class TVApagada implements EstadoTV {
    @Override
    public void encender() {
      System.out.println("Encendiendo la TV...");
    }

    @Override
    public void apagar() {
      System.out.println("La TV ya está apagada.");
    }

    @Override
    public void subirVolumen() {
      System.out.println("No se puede ajustar el volumen, la TV está apagada.");
    }

    @Override
    public void bajarVolumen() {
      System.out.println("No se puede ajustar el volumen, la TV está apagada.");
    }
  }

  static class TVEncendida implements EstadoTV {
    @Override
    public void encender() {
      System.out.println("La TV ya está encendida.");
    }

    @Override
    public void apagar() {
      System.out.println("Apagando la TV...");
    }

    @Override
    public void subirVolumen() {
      System.out.println("Subiendo el volumen de la TV.");
    }

    @Override
    public void bajarVolumen() {
      System.out.println("Bajando el volumen de la TV.");
    }
  }

  // Contexto: delega cada operación en el estado actual.
  static class TV {
    private EstadoTV estado = new TVApagada();

    public void encender() {
      estado.encender();
      estado = new TVEncendida();
    }

    public void apagar() {
      estado.apagar();
      estado = new TVApagada();
    }

    public void subirVolumen() {
      estado.subirVolumen();
    }

    public void bajarVolumen() {
      estado.bajarVolumen();
    }
  }

  public static void main(String[] args) {
    TV tv = new TV();

    tv.encender();
    tv.encender();
    tv.subirVolumen();

    tv.apagar();
    tv.subirVolumen();
    tv.encender();
    tv.bajarVolumen();
  }
}
