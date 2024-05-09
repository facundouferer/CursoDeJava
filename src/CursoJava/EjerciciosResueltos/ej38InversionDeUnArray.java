package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej38InversionDeUnArray {

  public static ArrayList<Integer> invertirArray(ArrayList<Integer> array) {
    ArrayList<Integer> arrayInvertido = new ArrayList<>(); // Creamos un nuevo ArrayList para almacenar el array
                                                           // invertido
    for (int i = array.size() - 1; i >= 0; i--) { // Recorremos el array desde el último elemento hasta el primero
      arrayInvertido.add(array.get(i)); // Agregamos cada elemento del array original al nuevo array invertido en orden
                                        // inverso
    }
    return arrayInvertido; // Retornamos el array invertido
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>(); // Creamos un ArrayList para almacenar los elementos del array
    // Agregamos elementos al array
    array.add(1);
    array.add(2);
    array.add(3);
    array.add(4);
    array.add(5);

    System.out.println("Array original: " + array); // Imprimimos el array original

    ArrayList<Integer> arrayInvertido = invertirArray(array); // Invertimos el array llamando al método invertirArray

    System.out.println("Array invertido: " + arrayInvertido); // Imprimimos el array invertido
  }

}
