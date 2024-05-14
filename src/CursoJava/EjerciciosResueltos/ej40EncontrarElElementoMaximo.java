package CursoJava.EjerciciosResueltos;

import java.util.ArrayList;

public class ej40EncontrarElElementoMaximo {

  public static int buscarMaximo(ArrayList<Integer> array) {
    int maximo = array.get(0);
    for (int i = 1; i < array.size(); i++) {
      if (array.get(i) > maximo) {
        maximo = array.get(i);
      }
    }
    return maximo;
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();
    array.add(6);
    array.add(2);
    array.add(12);
    array.add(1);
    array.add(12);
    array.add(3);
    int maximo = buscarMaximo(array);
    System.out.println("El elemento máximo del array es: " + maximo);
  }

}
