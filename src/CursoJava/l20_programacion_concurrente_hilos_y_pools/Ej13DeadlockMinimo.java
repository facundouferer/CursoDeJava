package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.CountDownLatch;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: provocar un deadlock mínimo con dos locks y detectarlo sin colgar
 *           el programa.
 * Concepto: §7 Deadlocks: las cuatro condiciones de Coffman (exclusión mutua,
 *           retención y espera, sin apropiación, espera circular) y diagnóstico.
 *
 * Para que sea determinista, un CountDownLatch asegura que cada hilo tenga su
 * primer lock antes de pedir el segundo. Los hilos son daemon: al terminar main
 * la JVM finaliza aunque queden bloqueados. ThreadMXBean cumple el papel de
 * jstack ("Found one Java-level deadlock").
 */
public class Ej13DeadlockMinimo {

  private static final Object LOCK_A = new Object();
  private static final Object LOCK_B = new Object();
  private static final CountDownLatch AMBOS_CON_SU_LOCK = new CountDownLatch(2);

  static void transferAtoB() {
    synchronized (LOCK_A) {
      esperarAlOtro();
      synchronized (LOCK_B) {
        System.out.println("Transferencia A -> B completa");
      }
    }
  }

  static void transferBtoA() {
    synchronized (LOCK_B) {
      esperarAlOtro();
      synchronized (LOCK_A) {
        System.out.println("Transferencia B -> A completa");
      }
    }
  }

  private static void esperarAlOtro() {
    AMBOS_CON_SU_LOCK.countDown();
    try {
      AMBOS_CON_SU_LOCK.await();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(Ej13DeadlockMinimo::transferAtoB, "hilo-AB");
    Thread t2 = new Thread(Ej13DeadlockMinimo::transferBtoA, "hilo-BA");
    t1.setDaemon(true);
    t2.setDaemon(true);
    t1.start();
    t2.start();

    // Espera acotada: si hubiera terminado bien, join() retornaría antes
    t1.join(1000);
    t2.join(1000);

    ThreadMXBean mx = ManagementFactory.getThreadMXBean();
    long[] ids = mx.findDeadlockedThreads();
    if (ids != null) {
      System.out.println("Deadlock detectado entre " + ids.length + " hilos:");
      for (var info : mx.getThreadInfo(ids)) {
        System.out.println("  " + info.getThreadName() + " espera " + info.getLockName()
            + " retenido por " + info.getLockOwnerName());
      }
    } else {
      System.out.println("No hubo deadlock");
    }
    System.out.println("Fin del programa (los hilos daemon no impiden que la JVM termine)");
  }
}
