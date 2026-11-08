package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: lanzar 10 000 tareas en hilos virtuales (requiere Java 21 o superior).
 * Concepto: §5 El futuro de la concurrencia: Virtual Threads (Project Loom).
 *
 * Cada tarea duerme 1 segundo; con hilos de plataforma harían falta 10 000
 * hilos del SO, con hilos virtuales el programa termina en poco más de 1 segundo.
 */
public class Ej10HilosVirtuales {

  public static void main(String[] args) throws InterruptedException {
    AtomicInteger terminadas = new AtomicInteger();
    long inicio = System.currentTimeMillis();

    // El try-with-resources cierra el executor al finalizar todas las tareas
    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
      for (int i = 0; i < 10_000; i++) {
        final int taskId = i;
        executor.submit(() -> {
          Thread.sleep(1000);
          terminadas.incrementAndGet();
          return "Tarea virtual #" + taskId;
        });
      }
    }

    long total = System.currentTimeMillis() - inicio;
    System.out.println("Tareas virtuales terminadas: " + terminadas.get());
    System.out.println("¿Tardó menos de 5 segundos? " + (total < 5000));

    Thread virtual = Thread.ofVirtual().start(() -> { });
    virtual.join();
    System.out.println("¿Es un hilo virtual? " + virtual.isVirtual());
  }
}
