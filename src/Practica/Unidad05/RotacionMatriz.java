package Practica.Unidad05;

public class RotacionMatriz {

  public static int[][] rotarMatriz(int[][] matriz) {
    int n = matriz.length;
    int[][] matrizRotada = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrizRotada[n - 1 - i][n - 1 - j] = matriz[i][j];
      }
    }

    return matrizRotada;
  }

  // Método para imprimir la matriz
  public static void imprimirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) { // Iterar sobre las filas de la matriz
      for (int j = 0; j < matriz[0].length; j++) { // Iterar sobre las columnas de la matriz
        System.out.print(matriz[i][j] + " "); // Imprimir el valor de cada elemento
      }
      System.out.println(); // Imprimir una nueva línea después de cada fila
    }
  }

  public static void main(String[] args) {
    int[][] matriz = { // Matriz de entrada
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println("Matriz original:");
    imprimirMatriz(matriz); // Imprimir la matriz original

    int[][] matrizRotada = rotarMatriz(matriz); // Rotar la matriz

    System.out.println("Matriz rotada 90 grados en sentido horario:");
    imprimirMatriz(matrizRotada); // Imprimir la matriz rotada
  }
}
