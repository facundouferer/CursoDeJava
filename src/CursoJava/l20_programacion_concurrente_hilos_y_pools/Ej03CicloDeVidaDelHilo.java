package CursoJava.l20_programacion_concurrente_hilos_y_pools;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: observar los estados del ciclo de vida de un hilo.
 * Concepto: §2 Ciclo de vida de hilos (NEW, RUNNABLE, TIMED_WAITING, TERMINATED).
 *
 * Se consulta getState() antes de start(), mientras el hilo duerme y después
 * de join().
 */
public class Ej03CicloDeVidaDelHilo {

  public static void main(String[] args) throws InterruptedException {
    Thread hilo = new Thread(() -> {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    });

    System.out.println("Antes de start(): " + hilo.getState());

    hilo.start();
    // Esperamos hasta que el hilo efectivamente duerma
    while (hilo.getState() != Thread.State.TIMED_WAITING) {
      Thread.sleep(10);
    }
    System.out.println("Durante sleep(): " + hilo.getState());

    hilo.join();
    System.out.println("Después de join(): " + hilo.getState());
  }
}
