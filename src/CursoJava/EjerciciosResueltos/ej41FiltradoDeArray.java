package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej41FiltradoDeArray {

  // Método para filtrar el array y eliminar los elementos menores que 0
  public static ArrayList<Integer> filtrarArray(ArrayList<Integer> array) {
    ArrayList<Integer> arrayFiltrado = new ArrayList<>(); // Creamos un nuevo ArrayList para almacenar el array filtrado
    for (int numero : array) { // Iteramos sobre cada elemento del array
      if (numero >= 0) { // Si el elemento es mayor o igual que 0
        arrayFiltrado.add(numero); // Lo agregamos al array filtrado
      }
    }
    return arrayFiltrado; // Retornamos el array filtrado
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>(); // Creamos un ArrayList para almacenar los números
    array.add(10); // Agregamos números al array
    array.add(-3);
    array.add(4);
    array.add(-15);
    array.add(7);

    System.out.println("Array original: " + array); // Imprimimos el array original

    ArrayList<Integer> arrayFiltrado = filtrarArray(array); // Filtramos el array llamando al método filtrarArray

    System.out.println("Array filtrado: " + arrayFiltrado); // Imprimimos el array filtrado
  }

}
