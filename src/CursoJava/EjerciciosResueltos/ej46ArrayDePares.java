package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej46ArrayDePares {

  // Método para encontrar los pares cuya suma sea igual a n
  public static ArrayList<int[]> encontrarPares(int n) {
    ArrayList<int[]> pares = new ArrayList<>(); // Creamos un ArrayList para almacenar los pares

    // Iteramos desde 0 hasta n/2, ya que no necesitamos considerar números mayores
    // que n/2 para encontrar pares
    for (int i = 0; i <= n / 2; i++) {
      int complemento = n - i; // Calculamos el complemento del número actual

      // Agregamos el par [i, complemento] al ArrayList solo si el complemento es
      // mayor o igual que i
      if (complemento >= i) {
        pares.add(new int[] { i, complemento });
      }
    }

    return pares; // Retornamos el ArrayList con los pares cuya suma es igual a n
  }

  public static void main(String[] args) {
    int n = 5; // Número para el cual se buscan los pares

    System.out.println("Pares cuya suma es igual a " + n + ":");
    ArrayList<int[]> pares = encontrarPares(n); // Encontramos los pares llamando al método encontrarPares

    for (int[] par : pares) { // Iteramos sobre cada par en el ArrayList
      System.out.println("[" + par[0] + ", " + par[1] + "]"); // Imprimimos el par
    }
  }

}
