package Practica.Unidad05;

public class DiagonalPrincipalMatriz {
  public static void main(String[] args) {
    int[][] matriz = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println("Elementos de la diagonal principal:");
    for (int i = 0; i < matriz.length; i++) {
      System.out.println(matriz[i][i]);
    }
  }
}
