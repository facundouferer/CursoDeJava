package CursoJava.l18_grafos_representacion_y_algoritmos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Lección 18 – Grafos: Matriz, Lista de Adyacencia, BFS, DFS y Dijkstra
 * Objetivo: Calcular los grados de separación y el camino más corto entre dos personas de una red social usando BFS.
 * Concepto: 6. Ejercicio práctico guiado: grados de separación en una red social.
 */
public class Ej07GradosDeSeparacionRedSocial {

  private final Map<String, List<String>> amigos = new HashMap<>();

  public void agregarAmistad(String a, String b) {
    // No dirigido: la amistad va en los dos sentidos
    amigos.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
    amigos.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
  }

  /**
   * BFS: devuelve la cantidad mínima de saltos, o -1 si no hay conexión.
   * DFS NO sirve acá: encontraría un camino, no el más corto.
   */
  public int saltosMinimos(String desde, String hasta) {
    if (!amigos.containsKey(desde) || !amigos.containsKey(hasta)) return -1;
    if (desde.equals(hasta)) return 0;

    Set<String> visitados = new HashSet<>();
    Queue<String> cola = new ArrayDeque<>();

    visitados.add(desde);
    cola.offer(desde);
    int saltos = 0;

    while (!cola.isEmpty()) {
      int personasEnEsteNivel = cola.size(); // ← la clave del conteo por niveles
      saltos++;

      for (int i = 0; i < personasEnEsteNivel; i++) {
        String actual = cola.poll();

        for (String amigo : amigos.getOrDefault(actual, List.of())) {
          if (amigo.equals(hasta)) return saltos;
          if (visitados.add(amigo)) { // add devuelve false si ya estaba
            cola.offer(amigo);
          }
        }
      }
    }
    return -1; // se recorrió todo lo alcanzable y no apareció
  }

  /**
   * Misma idea, pero guardando de dónde vino cada persona
   * para poder reconstruir el camino al final.
   */
  public List<String> caminoMasCorto(String desde, String hasta) {
    if (!amigos.containsKey(desde) || !amigos.containsKey(hasta)) return List.of();

    Map<String, String> vinoDe = new HashMap<>();
    Set<String> visitados = new HashSet<>();
    Queue<String> cola = new ArrayDeque<>();

    visitados.add(desde);
    cola.offer(desde);

    while (!cola.isEmpty()) {
      String actual = cola.poll();

      if (actual.equals(hasta)) {
        // Se reconstruye el camino yendo hacia atrás desde el destino
        LinkedList<String> camino = new LinkedList<>();
        for (String p = hasta; p != null; p = vinoDe.get(p)) {
          camino.addFirst(p);
        }
        return camino;
      }

      for (String amigo : amigos.getOrDefault(actual, List.of())) {
        if (visitados.add(amigo)) {
          vinoDe.put(amigo, actual); // se recuerda el padre en el recorrido
          cola.offer(amigo);
        }
      }
    }
    return List.of();
  }

  public static void main(String[] args) {
    Ej07GradosDeSeparacionRedSocial red = new Ej07GradosDeSeparacionRedSocial();
    red.agregarAmistad("Ana", "Beto");
    red.agregarAmistad("Beto", "Carla");
    red.agregarAmistad("Carla", "Diego");
    red.agregarAmistad("Ana", "Elena");
    red.agregarAmistad("Elena", "Diego");
    red.agregarAmistad("Fabián", "Gala"); // grupo desconectado del resto

    System.out.println("Ana → Diego  : " + red.saltosMinimos("Ana", "Diego"));
    System.out.println("Camino       : " + red.caminoMasCorto("Ana", "Diego"));
    System.out.println("Ana → Fabián : " + red.saltosMinimos("Ana", "Fabián"));
    System.out.println("Ana → Ana    : " + red.saltosMinimos("Ana", "Ana"));
  }
}
