package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej43SumaDeSubarrays {

  // Método para calcular la suma de subarrays
  public static ArrayList<Integer> sumaSubarrays(ArrayList<Integer> array) {
    ArrayList<Integer> resultado = new ArrayList<>(); // Creamos un nuevo ArrayList para almacenar el resultado
    int suma = 0; // Inicializamos la variable suma
    for (int i = 0; i < array.size(); i++) { // Iteramos sobre cada elemento del array
      suma += array.get(i); // Sumamos el elemento actual al valor de suma
      resultado.add(suma); // Agregamos la suma al resultado
    }
    return resultado; // Retornamos el array con las sumas de subarrays
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>(); // Creamos un ArrayList para almacenar los números
    array.add(1); // Agregamos números al array
    array.add(2);
    array.add(3);
    array.add(4);

    System.out.println("Array original: " + array); // Imprimimos el array original

    ArrayList<Integer> resultado = sumaSubarrays(array); // Calculamos la suma de subarrays llamando al método
                                                         // sumaSubarrays

    System.out.println("Resultado de la suma de subarrays: " + resultado); // Imprimimos el resultado
  }

}
