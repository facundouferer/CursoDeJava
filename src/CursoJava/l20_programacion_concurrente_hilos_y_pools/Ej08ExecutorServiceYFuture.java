package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: enviar tareas Callable a un pool de 3 hilos y recoger sus resultados.
 * Concepto: §4 Pools de hilos con ExecutorService; ejemplo práctico con Future.
 *
 * Future.get() bloquea hasta que la tarea termina. shutdown() permite que la
 * JVM finalice limpiamente.
 */
public class Ej08ExecutorServiceYFuture {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    // 1. Crear un pool de 3 hilos trabajadores
    ExecutorService executor = Executors.newFixedThreadPool(3);

    // 2. Enviar tareas Callable que retornan un resultado futuro
    Future<String> tarea1 = executor.submit(() -> {
      Thread.sleep(1500);
      return "Resultado de Proceso A";
    });

    Future<String> tarea2 = executor.submit(() -> {
      Thread.sleep(1000);
      return "Resultado de Proceso B";
    });

    // 3. Obtener los resultados (get() bloquea hasta completar la tarea)
    System.out.println("Esperando respuestas...");
    System.out.println("Recibido: " + tarea1.get());
    System.out.println("Recibido: " + tarea2.get());

    // 4. Apagar el pool
    executor.shutdown();
    executor.awaitTermination(5, TimeUnit.SECONDS);
    System.out.println("Pool terminado: " + executor.isTerminated());
  }
}
