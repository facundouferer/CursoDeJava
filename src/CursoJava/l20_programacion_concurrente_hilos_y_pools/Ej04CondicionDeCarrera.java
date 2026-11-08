package CursoJava.l20_programacion_concurrente_hilos_y_pools;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: provocar una condición de carrera con un contador compartido.
 * Concepto: §3 Condiciones de carrera y el problema de la operación no atómica (count++).
 *
 * count++ son tres pasos (leer, incrementar, escribir). Con 10 hilos que
 * incrementan 1000 veces cada uno, el resultado final raras veces será 10000
 * (el valor exacto varía en cada ejecución).
 */
public class Ej04CondicionDeCarrera {

  static class ContadorInseguro {
    private int contador = 0;

    // INSEGURO: sin sincronización
    public void incrementar() {
      contador++;
    }

    public int getContador() {
      return contador;
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ContadorInseguro compartido = new ContadorInseguro();
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
