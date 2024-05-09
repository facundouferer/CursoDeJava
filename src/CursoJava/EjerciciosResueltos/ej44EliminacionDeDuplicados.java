package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej44EliminacionDeDuplicados {

  // Método para eliminar duplicados de un ArrayList
  public static ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> array) {
    ArrayList<Integer> resultado = new ArrayList<>(); // Creamos un nuevo ArrayList para almacenar los elementos únicos
    for (int elemento : array) { // Iteramos sobre cada elemento del array original
      if (!resultado.contains(elemento)) { // Verificamos si el elemento no está en el resultado
        resultado.add(elemento); // Si no está, lo agregamos al resultado
      }
    }
    return resultado; // Retornamos el array sin duplicados
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>(); // Creamos un ArrayList para almacenar los números
    array.add(1); // Agregamos números al array
    array.add(2);
    array.add(3);
    array.add(2); // Agregamos un duplicado
    array.add(4);
    array.add(3); // Agregamos otro duplicado

    System.out.println("Array original: " + array); // Imprimimos el array original

    ArrayList<Integer> resultado = eliminarDuplicados(array); // Eliminamos los duplicados llamando al método
                                                              // eliminarDuplicados

    System.out.println("Array sin duplicados: " + resultado); // Imprimimos el resultado
  }

}
