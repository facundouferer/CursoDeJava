package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: coordinar productores y consumidores con un buffer acotado.
 * Concepto: §7 Coordinación entre hilos: wait(), notify()/notifyAll(), el
 *           bucle while de espera y el ejemplo del buffer acotado.
 *
 * Los productores esperan si el buffer está lleno; los consumidores esperan si
 * está vacío. notifyAll() es obligatorio porque conviven dos condiciones sobre
 * el mismo monitor. La suma final es siempre la misma aunque el orden varíe.
 */
public class Ej12BufferAcotado {

  static class BoundedBuffer<T> {
    private final Object lock = new Object();
    private final Deque<T> items = new ArrayDeque<>();
    private final int capacity;

    public BoundedBuffer(int capacity) {
      if (capacity <= 0) {
        throw new IllegalArgumentException("capacity must be positive");
      }
      this.capacity = capacity;
    }

    public void put(T item) throws InterruptedException {
      synchronized (lock) {
        while (items.size() == capacity) {
          lock.wait(); // sin espacio: esperar a que un consumidor libere uno
        }
        items.addLast(item);
        lock.notifyAll(); // puede despertar a un consumidor esperando un elemento
      }
    }

    public T take() throws InterruptedException {
      synchronized (lock) {
        while (items.isEmpty()) {
          lock.wait(); // sin elementos: esperar a que un productor agregue uno
        }
        T item = items.removeFirst();
        lock.notifyAll(); // puede despertar a un productor esperando espacio
        return item;
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    BoundedBuffer<Integer> buffer = new BoundedBuffer<>(3);
    AtomicInteger suma = new AtomicInteger();
    int productores = 2;
    int consumidores = 2;
    int porProductor = 50;

    Thread[] hilos = new Thread[productores + consumidores];

    for (int p = 0; p < productores; p++) {
      hilos[p] = new Thread(() -> {
        try {
          for (int i = 1; i <= porProductor; i++) {
            buffer.put(i);
          }
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }, "productor-" + p);
    }

    for (int c = 0; c < consumidores; c++) {
      hilos[productores + c] = new Thread(() -> {
        try {
          // Cada consumidor toma la mitad del total de elementos
          for (int i = 0; i < productores * porProductor / consumidores; i++) {
            suma.addAndGet(buffer.take());
          }
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }, "consumidor-" + c);
    }

    for (Thread hilo : hilos) {
      hilo.start();
    }
    for (Thread hilo : hilos) {
      hilo.join();
    }

    int esperado = productores * (porProductor * (porProductor + 1) / 2);
    System.out.println("Suma esperada: " + esperado);
    System.out.println("Suma consumida: " + suma.get());
  }
}
