package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej45MezclaDeArrays {

  // Método para mezclar dos arrays intercalando sus elementos
  public static ArrayList<Object> mezclarArrays(Object[] array1, Object[] array2) {
    ArrayList<Object> resultado = new ArrayList<>(); // Creamos un nuevo ArrayList para almacenar el resultado
    int longitudMinima = Math.min(array1.length, array2.length); // Determinamos la longitud mínima de los dos arrays

    // Iteramos hasta la longitud mínima de los dos arrays
    for (int i = 0; i < longitudMinima; i++) {
      resultado.add(array1[i]); // Agregamos el elemento del primer array al resultado
      resultado.add(array2[i]); // Agregamos el elemento del segundo array al resultado
    }

    // Si uno de los arrays es más largo que el otro, agregamos los elementos
    // restantes al resultado
    for (int i = longitudMinima; i < array1.length; i++) {
      resultado.add(array1[i]);
    }
    for (int i = longitudMinima; i < array2.length; i++) {
      resultado.add(array2[i]);
    }

    return resultado; // Retornamos el array mezclado
  }

  public static void main(String[] args) {
    Object[] array1 = { 'a', 'b', 'c' }; // Primer array
    Object[] array2 = { 1, 2, 3 }; // Segundo array

    System.out.println("Array 1: " + java.util.Arrays.toString(array1)); // Imprimimos el primer array
    System.out.println("Array 2: " + java.util.Arrays.toString(array2)); // Imprimimos el segundo array

    ArrayList<Object> resultado = mezclarArrays(array1, array2); // Mezclamos los dos arrays llamando al método
                                                                 // mezclarArrays

    System.out.println("Resultado de la mezcla: " + resultado); // Imprimimos el resultado
  }

}
