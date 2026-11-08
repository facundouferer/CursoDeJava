package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.concurrent.locks.ReentrantLock;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: corregir la condición de carrera con un lock explícito.
 * Concepto: §3 Sincronización; ReentrantLock es la base de tryLock (§7).
 *
 * A diferencia de synchronized, el lock se libera a mano: unlock() va siempre
 * en un bloque finally.
 */
public class Ej07ContadorReentrantLock {

  static class ContadorConLock {
    private final ReentrantLock lock = new ReentrantLock();
    private int contador = 0;

    public void incrementar() {
      lock.lock();
      try {
        contador++;
      } finally {
        lock.unlock();
      }
    }

    public int getContador() {
      lock.lock();
      try {
        return contador;
      } finally {
        lock.unlock();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ContadorConLock compartido = new ContadorConLock();
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
