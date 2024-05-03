package CursoJava.EstructurasDinamicas.Pilas;

import java.util.Stack;

public class PilasEjemplo {
  public static void main(String[] args) {
    // Crear una pila
    Stack<String> pila = new Stack<>();

    // Apilar elementos
    pila.push("Manzana");
    pila.push("Banana");
    pila.push("Naranja");

    // Desapilar elementos
    String fruta = pila.pop(); // Obtiene y remueve "Naranja"
    System.out.println(fruta);

    // Obtener el elemento en la cima sin removerlo
    String cima = pila.peek(); // Obtiene "Banana" sin removerlo

    // Verificar si la pila está vacía
    boolean estaVacia = pila.isEmpty();
    System.out.println("¿La pila está vacía? " + estaVacia);
  }
}
