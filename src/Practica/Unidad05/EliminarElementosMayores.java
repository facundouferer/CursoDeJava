package Practica.Unidad05;

public class EliminarElementosMayores {

  public static void main(String[] args) {
    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int limite = 4;
    int[] resultado = eliminarElementosMayores(numeros, limite);
    System.out.println("Array resultante:");
    for (int numero : resultado) {
      System.out.print(numero + " ");
    }
  }

  public static int[] eliminarElementosMayores(int[] array, int limite) {
    int conteo = 0;
    for (int num : array) {
      if (num <= limite) {
        conteo++;
      }
    }

    int[] nuevoArray = new int[conteo];
    int indice = 0;
    for (int num : array) {
      if (num > limite) {
        nuevoArray[indice++] = num;
      }
    }
    return nuevoArray;
  }

}
