package Practica.Unidad01;

import java.util.Random;

class Test02 {
  public static void main(String[] args) {
    // Random() produce un número aleatorio
    int x = new Random().nextInt(10) + 1;
    int[] arr = { x, x * 2, x * 3 };
    modificar(arr);
    System.out.println(arr[0]);
  }

  public static void modificar(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + (i * 2);
    }
  }
}