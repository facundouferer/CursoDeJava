package CursoJava.l20_programacion_concurrente_hilos_y_pools;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: crear hilos con una clase que implementa Runnable y con una lambda,
 *           y comparar start() con run().
 * Concepto: §2 Creación y ciclo de vida de hilos (Thread vs Runnable), opción A.
 *
 * start() inicia un hilo nuevo; llamar a run() directamente solo ejecuta el
 * método en el hilo actual (main) y no hay concurrencia.
 */
public class Ej01ThreadConRunnable {

  static class TareaRunnable implements Runnable {
    @Override
    public void run() {
      System.out.println("Ejecutando en el hilo: " + Thread.currentThread().getName());
    }
  }

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hilo principal: " + Thread.currentThread().getName());

    // Con una clase que implementa Runnable
    Thread hilo1 = new Thread(new TareaRunnable(), "hilo-clase");
    hilo1.start();
    hilo1.join();

    // Con una lambda
    Thread hilo2 = new Thread(() -> System.out.println("Hilo paralelo ejecutándose"), "hilo-lambda");
    hilo2.start();
    hilo2.join();

    // Error típico: run() directo no crea ningún hilo nuevo
    System.out.println("Llamada directa a run():");
    new TareaRunnable().run();

    System.out.println("Fin del programa");
  }
}
