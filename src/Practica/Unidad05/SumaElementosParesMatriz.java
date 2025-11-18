package Practica.Unidad05;

public class SumaElementosParesMatriz {
  public static void main(String[] args) {
    int[][] matriz = {
        { 2, 3, 4 },
        { 5, 6, 7 },
        { 8, 9, 10 }
    };

    System.out.println("Matriz original:");
    imprimirMatriz(matriz);
    int sumaPares = calcularSumaElementosPares(matriz);
    System.out.println("La suma de los elementos pares de la matriz es: " + sumaPares);
  }

  // Método para imprimir la matriz
  public static void imprimirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Método para calcular la suma de los elementos pares en la matriz
  public static int calcularSumaElementosPares(int[][] matriz) {
    int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] % 2 == 0) {
          suma += matriz[i][j];
        }
      }
    }
    return suma;
  }
}
