package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: comparar cuántos hilos usa cada tipo de pool para 6 tareas.
 * Concepto: §4 Tipos comunes de pools: newFixedThreadPool, newCachedThreadPool
 *           y newSingleThreadExecutor.
 *
 * Cada tarea duerme 100 ms y registra el nombre de su hilo. Se cuenta cuántos
 * hilos distintos participaron.
 */
public class Ej09TiposDePools {

  static void probar(String nombre, ExecutorService pool) throws InterruptedException {
    Set<String> hilos = java.util.Collections.synchronizedSet(new TreeSet<>());

    for (int i = 0; i < 6; i++) {
      pool.submit(() -> {
        hilos.add(Thread.currentThread().getName());
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      });
    }

    pool.shutdown();
    pool.awaitTermination(5, TimeUnit.SECONDS);
    System.out.println(nombre + " -> hilos usados: " + hilos.size());
  }

  public static void main(String[] args) throws InterruptedException {
    // Número fijo de hilos reutilizados: 3
    probar("newFixedThreadPool(3)", Executors.newFixedThreadPool(3));
    // Un único hilo: ejecución secuencial
    probar("newSingleThreadExecutor()", Executors.newSingleThreadExecutor());
    // Hilos según demanda: las 6 tareas arrancan casi juntas, así que crea hasta 6
    probar("newCachedThreadPool()", Executors.newCachedThreadPool());
  }
}
