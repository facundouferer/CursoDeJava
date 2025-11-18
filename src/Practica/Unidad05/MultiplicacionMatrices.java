package Practica.Unidad05;

public class MultiplicacionMatrices {
  public static void main(String[] args) {
    int[][] matriz1 = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };
    int[][] matriz2 = {
        { 7, 8 },
        { 9, 10 },
        { 11, 12 }
    };

    int[][] resultado = multiplicarMatrices(matriz1, matriz2);

    System.out.println("Producto de las matrices:");
    for (int i = 0; i < resultado.length; i++) {
      for (int j = 0; j < resultado[i].length; j++) {
        System.out.print(resultado[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] multiplicarMatrices(int[][] m1, int[][] m2) {
    int filas1 = m1.length;
    int columnas1 = m1[0].length;
    int columnas2 = m2[0].length;

    int[][] resultado = new int[filas1][columnas2];

    for (int i = 0; i < filas1; i++) {
      for (int j = 0; j < columnas2; j++) {
        for (int k = 0; k < columnas1; k++) {
          resultado[i][j] += m1[i][k] * m2[k][j];
        }
      }
    }
    return resultado;
  }
}
