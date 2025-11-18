package Practica.Unidad05;

import java.util.ArrayList;
import java.util.List;

public class SumaElementosMatriz {
  public static void main(String[] args) {

    List<List<Integer>> matriz = new ArrayList<>();

    List<Integer> fila1 = new ArrayList<>();
    fila1.add(1);
    fila1.add(2);
    fila1.add(3);
    matriz.add(fila1);

    List<Integer> fila2 = new ArrayList<>();
    fila2.add(4);
    fila2.add(5);
    fila2.add(6);
    matriz.add(fila2);

    List<Integer> fila3 = new ArrayList<>();
    fila3.add(7);
    fila3.add(8);
    fila3.add(9);
    matriz.add(fila3);

    int suma = 0;
    // Sumar los elementos de la matriz
    for (List<Integer> fila : matriz) {
      for (Integer elemento : fila) {
        suma += elemento;
      }
    }

    System.out.println("La suma de todos los elementos de la matriz es: " + suma);
  }
}
