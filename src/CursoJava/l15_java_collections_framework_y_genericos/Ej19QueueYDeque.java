/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Usar Queue y Deque según el orden de procesamiento que se necesita.
 * Concepto: ArrayDeque sirve como cola (FIFO) y como pila (LIFO); PriorityQueue entrega primero
 * al de mayor prioridad, no al que llegó primero; LinkedList también implementa Deque.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ej19QueueYDeque {

  public static void main(String[] args) {
    System.out.println("== Cola (FIFO) con ArrayDeque ==");
    Queue<String> cola = new ArrayDeque<>();
    cola.offer("Ana");
    cola.offer("Beto");
    cola.offer("Carla");
    System.out.println("peek (ver sin sacar): " + cola.peek());
    while (!cola.isEmpty()) {
      System.out.println("poll: " + cola.poll());
    }
    System.out.println("poll en cola vacía: " + cola.poll());

    System.out.println("\n== Pila (LIFO) con ArrayDeque ==");
    Deque<String> pila = new ArrayDeque<>();
    pila.push("uno");
    pila.push("dos");
    pila.push("tres");
    System.out.println("peek: " + pila.peek());
    while (!pila.isEmpty()) {
      System.out.println("pop: " + pila.pop());
    }

    System.out.println("\n== Deque: ambos extremos ==");
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(2);
    deque.addFirst(1);
    deque.addLast(3);
    deque.addLast(4);
    System.out.println("Deque: " + deque);
    System.out.println("pollFirst: " + deque.pollFirst() + ", pollLast: " + deque.pollLast());
    System.out.println("Deque: " + deque);

    System.out.println("\n== PriorityQueue: sale el de menor valor (mayor prioridad) ==");
    Queue<Integer> prioridad = new PriorityQueue<>();
    prioridad.offer(5);
    prioridad.offer(1);
    prioridad.offer(3);
    prioridad.offer(2);
    while (!prioridad.isEmpty()) {
      System.out.println("poll: " + prioridad.poll());
    }

    System.out.println("\n== PriorityQueue con orden inverso ==");
    Queue<String> urgentes = new PriorityQueue<>(java.util.Comparator.reverseOrder());
    urgentes.offer("b");
    urgentes.offer("z");
    urgentes.offer("m");
    System.out.println("primero en salir: " + urgentes.poll());

    System.out.println("\n== LinkedList también es un Deque ==");
    Deque<String> enlazada = new LinkedList<>();
    enlazada.offerLast("x");
    enlazada.offerLast("y");
    enlazada.offerFirst("w");
    System.out.println("LinkedList: " + enlazada);
  }
}
