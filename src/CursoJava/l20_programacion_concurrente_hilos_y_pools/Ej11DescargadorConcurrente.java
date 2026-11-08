package CursoJava.l20_programacion_concurrente_hilos_y_pools;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Lección 20 – Programación concurrente: hilos, sincronización y pools
 * Objetivo: simular la descarga de 5 archivos con un pool de 2 hilos y medir
 *           el tiempo total.
 * Concepto: §6 Ejercicio práctico guiado: simulador de descargas múltiples
 *           concurrentes (ExecutorService, Runnable, shutdown y awaitTermination).
 *
 * Para que el programa termine rápido, cada descarga dura entre 100 y 300 ms
 * (la lección usa entre 1 y 3 segundos: cambiar ESCALA a 10 para igualarlo).
 * El orden de las líneas varía entre ejecuciones.
 */
public class Ej11DescargadorConcurrente {

  static final int ESCALA = 1;

  static class TareaDescarga implements Runnable {
    private final String nombreArchivo;

    public TareaDescarga(String nombreArchivo) {
      this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {
      String hiloActual = Thread.currentThread().getName();
      System.out.println("[" + hiloActual + "] Iniciando descarga: " + nombreArchivo);
      try {
        int tiempoDescarga = (100 + new Random().nextInt(200)) * ESCALA;
        Thread.sleep(tiempoDescarga);
        System.out.println("[" + hiloActual + "] Completada descarga: " + nombreArchivo);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    long inicio = System.currentTimeMillis();
    ExecutorService pool = Executors.newFixedThreadPool(2);

    String[] archivos = {"video_hd.mp4", "backup.zip", "dataset.csv", "documento.pdf", "imagen.raw"};

    for (String archivo : archivos) {
      pool.submit(new TareaDescarga(archivo));
    }

    pool.shutdown();
    pool.awaitTermination(30, TimeUnit.SECONDS);

    long fin = System.currentTimeMillis();
    System.out.println("==========================================");
    System.out.println("Todas las descargas finalizaron en: " + (fin - inicio) + " ms");
    System.out.println("==========================================");
  }
}
