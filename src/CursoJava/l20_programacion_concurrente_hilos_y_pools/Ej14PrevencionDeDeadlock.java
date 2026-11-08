package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: evitar el deadlock del ejemplo anterior con un orden consistente
 *           de locks y con tryLock con tiempo límite.
 * Concepto: §7 Prevención: orden de locks (rompe la espera circular),
 *           tryLock con timeout y bloqueos acotados.
 */
public class Ej14PrevencionDeDeadlock {

  private static final Object LOCK_A = new Object();
  private static final Object LOCK_B = new Object();

  // Orden estable por System.identityHashCode()
  static void transferOrdered(Object first, Object second, Runnable action) {
    Object low = System.identityHashCode(first) <= System.identityHashCode(second) ? first : second;
    Object high = low == first ? second : first;
    synchronized (low) {
      synchronized (high) {
        action.run();
      }
    }
  }

  static final ReentrantLock lockA = new ReentrantLock();
  static final ReentrantLock lockB = new ReentrantLock();

  static boolean transfer() throws InterruptedException {
    if (lockA.tryLock(200, TimeUnit.MILLISECONDS)) {
      try {
        if (lockB.tryLock(200, TimeUnit.MILLISECONDS)) {
          try {
            return true; // sección crítica con ambos locks
          } finally {
            lockB.unlock();
          }
        }
      } finally {
        lockA.unlock();
      }
    }
    return false; // no se pudieron obtener ambos locks: reintentar más tarde
  }

  public static void main(String[] args) throws InterruptedException {
    // 1. Orden consistente: las dos transferencias en sentidos opuestos terminan siempre
    Thread t1 = new Thread(() ->
        transferOrdered(LOCK_A, LOCK_B, () -> System.out.println("Transferencia A -> B completa")));
    Thread t2 = new Thread(() ->
        transferOrdered(LOCK_B, LOCK_A, () -> System.out.println("Transferencia B -> A completa")));
    t1.start();
    t2.start();
    t1.join();
    t2.join();

    // 2. tryLock con tiempo límite: otro hilo retiene lockB durante 600 ms
    CountDownLatch retenido = new CountDownLatch(1);
    Thread retenedor = new Thread(() -> {
      lockB.lock();
      try {
        retenido.countDown();
        Thread.sleep(600);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      } finally {
        lockB.unlock();
      }
    });
    retenedor.start();
    retenido.await();

    System.out.println("Intento con lockB ocupado: " + transfer());
    System.out.println("¿lockA quedó libre? " + !lockA.isLocked());

    retenedor.join();
    System.out.println("Reintento con lockB libre: " + transfer());
  }
}
