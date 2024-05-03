package CursoJava.EstructurasDinamicas.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class ColasEjemplo {
  public static void main(String[] args) {
    // Crear una cola
    Queue<String> cola = new LinkedList<>();

    // Agregar elementos a la cola
    cola.offer("Manzana");
    cola.offer("Banana");
    cola.offer("Naranja");

    // Obtener y remover el elemento al frente de la cola
    String fruta = cola.poll(); // Obtiene y remueve "Manzana"
    System.out.println(fruta);

    // Obtener el elemento al frente de la cola sin removerlo
    String frente = cola.peek(); // Obtiene "Banana" sin removerlo

    // Verificar si la cola está vacía
    boolean estaVacia = cola.isEmpty();
    System.out.println("¿La cola está vacía? " + estaVacia);
  }
}
