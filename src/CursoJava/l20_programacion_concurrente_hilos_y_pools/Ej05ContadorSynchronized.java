package CursoJava.l20_programacion_concurrente_hilos_y_pools;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: corregir la condición de carrera con un método synchronized.
 * Concepto: §3 Solución 1: bloques y métodos synchronized (intrinsic locks).
 *
 * synchronized garantiza exclusión mutua: un solo hilo ejecuta el método a la
 * vez, por lo que el resultado siempre es 10000.
 */
public class Ej05ContadorSynchronized {

  static class ContadorSeguro {
    private int contador = 0;

    public synchronized void incrementar() {
      contador++; // Seguro frente a múltiples hilos
    }

    public synchronized int getContador() {
      return contador;
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ContadorSeguro compartido = new ContadorSeguro();
    Thread[] hilos = new Thread[10];

    for (int i = 0; i < hilos.length; i++) {
      hilos[i] = new Thread(() -> {
        for (int j = 0; j < 1000; j++) {
          compartido.incrementar();
        }
      });
      hilos[i].start();
    }
    for (Thread hilo : hilos) {
      hilo.join();
    }

    System.out.println("Esperado: 10000");
    System.out.println("Obtenido: " + compartido.getContador());
  }
}
