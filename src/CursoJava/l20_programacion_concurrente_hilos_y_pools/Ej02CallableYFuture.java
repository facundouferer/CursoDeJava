package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: ejecutar una tarea que devuelve un resultado y puede lanzar
 *           excepciones comprobadas.
 * Concepto: §2 Opción B: Callable<V> y Future<V>.
 *
 * A diferencia de Runnable, Callable devuelve un valor y puede lanzar
 * excepciones chequeadas. FutureTask adapta un Callable para pasarlo a un Thread.
 */
public class Ej02CallableYFuture {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Callable<Integer> calculoComplejo = () -> {
      Thread.sleep(1000);
      return 42 * 2;
    };

    FutureTask<Integer> futuro = new FutureTask<>(calculoComplejo);
    new Thread(futuro, "hilo-calculo").start();

    System.out.println("Esperando el resultado...");
    // get() bloquea hasta que la tarea termina
    System.out.println("Resultado: " + futuro.get());
    System.out.println("¿Terminó? " + futuro.isDone());
  }
}
