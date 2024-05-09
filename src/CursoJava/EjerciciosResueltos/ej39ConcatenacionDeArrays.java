package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej39ConcatenacionDeArrays {

  public static ArrayList<Integer> concatenarArrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {
    ArrayList<Integer> arrayConcatenado = new ArrayList<>(); // Creamos un nuevo ArrayList para almacenar la
                                                             // concatenación
    arrayConcatenado.addAll(array1); // Agregamos todos los elementos del primer array al array concatenado
    arrayConcatenado.addAll(array2); // Agregamos todos los elementos del segundo array al array concatenado
    return arrayConcatenado; // Retornamos el array concatenado
  }

  public static void main(String[] args) {
    ArrayList<Integer> array1 = new ArrayList<>(); // Creamos un ArrayList para el primer array
    array1.add(1); // Agregamos elementos al primer array
    array1.add(2);
    array1.add(3);

    ArrayList<Integer> array2 = new ArrayList<>(); // Creamos un ArrayList para el segundo array
    array2.add(4); // Agregamos elementos al segundo array
    array2.add(5);
    array2.add(6);

    ArrayList<Integer> arrayConcatenado = concatenarArrays(array1, array2); // Concatenamos los dos arrays llamando al
                                                                            // método concatenarArrays

    System.out.println("Array concatenado: " + arrayConcatenado); // Imprimimos el array concatenado
  }

}
