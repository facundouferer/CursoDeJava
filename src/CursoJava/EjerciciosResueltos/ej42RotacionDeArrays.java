package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;
import java.util.Collections;

public class ej42RotacionDeArrays {

  // Método para rotar los elementos del array hacia la derecha n veces
  public static ArrayList<Integer> rotarArray(ArrayList<Integer> array, int n) {
    Collections.rotate(array, n); // Utilizamos el método rotate de la clase Collections para rotar el array
    return array; // Retornamos el array rotado
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>(); // Creamos un ArrayList para almacenar los números
    array.add(1); // Agregamos números al array
    array.add(2);
    array.add(3);
    array.add(4);
    array.add(5);
    array.add(6);
    array.add(7);

    System.out.println("Array original: " + array); // Imprimimos el array original

    int n = 2; // Número de veces que vamos a rotar el array
    ArrayList<Integer> arrayRotado = rotarArray(array, n); // Rotamos el array llamando al método rotarArray

    System.out.println("Array rotado " + n + " veces: " + arrayRotado); // Imprimimos el array rotado
  }

}
