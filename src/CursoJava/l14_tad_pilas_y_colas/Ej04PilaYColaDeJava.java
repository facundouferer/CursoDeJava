package CursoJava.l14_tad_pilas_y_colas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Lección 14 – TAD Pila y TAD Cola: Estructuras Lineales
 * Objetivo: Usar una pila y una cola de la biblioteca estándar de Java con frutas como ejemplo.
 * Concepto: 5. Cómo se hace en Java de verdad.
 */
public class Ej04PilaYColaDeJava {
  public static void main(String[] args) {
    // Pila (LIFO): se apila y se desapila por el tope.
    Deque<String> pila = new ArrayDeque<>();
    pila.push("Manzana");
    pila.push("Banana");
    pila.push("Naranja");

    String desapilada = pila.pop();
    System.out.println(desapilada);
    System.out.println("Tope de la pila: " + pila.peek());
    System.out.println("¿La pila está vacía? " + pila.isEmpty());

    // Cola (FIFO): se encola por el fondo y se desencola por el frente.
    Queue<String> cola = new LinkedList<>();
    cola.offer("Manzana");
    cola.offer("Banana");
    cola.offer("Naranja");

    String desencolada = cola.poll();
    System.out.println(desencolada);
    System.out.println("Frente de la cola: " + cola.peek());
    System.out.println("¿La cola está vacía? " + cola.isEmpty());
  }
}
