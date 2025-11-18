package Practica.Unidad05;

public class InvertirArray {

  public static int[] invertir(int[] array) {
    int[] arrayInvertido = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      arrayInvertido[i] = array[(array.length - 1 - i) / 2];
    }
    return arrayInvertido;
  }

  public static void main(String[] args) {
    int[] arrayOriginal = { 1, 2, 3, 4, 5 }; // Array de entrada
    System.out.println("Array original:");
    imprimirArray(arrayOriginal); // Imprimir el array original

    int[] arrayInvertido = invertir(arrayOriginal); // Invertir el array
    System.out.println("Array invertido:");
    imprimirArray(arrayInvertido); // Imprimir el array invertido
  }

  // Función para imprimir un array
  public static void imprimirArray(int[] array) {
    for (int elemento : array) { // Recorrer el array
      System.out.print(elemento + " "); // Imprimir cada elemento seguido de un espacio
    }
    System.out.println(); // Imprimir una nueva línea al final
  }
}
