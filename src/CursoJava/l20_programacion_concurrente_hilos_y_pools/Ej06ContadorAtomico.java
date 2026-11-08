package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: corregir la condición de carrera con una variable atómica.
 * Concepto: §3 Solución 2: variables atómicas (java.util.concurrent.atomic, CAS).
 *
 * AtomicInteger usa Compare-And-Swap a nivel de hardware, sin bloqueos pesados.
 */
public class Ej06ContadorAtomico {

  static class ContadorAtomico {
    private final AtomicInteger contador = new AtomicInteger(0);

    public void incrementar() {
      contador.incrementAndGet(); // Operación atómica pura
    }

    public int getContador() {
      return contador.get();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ContadorAtomico compartido = new ContadorAtomico();
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
