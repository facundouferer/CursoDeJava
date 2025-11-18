package Practica.Unidad05;

public class MatrizTranspuesta {
  public static void main(String[] args) {
    int[][] matriz = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int[][] transpuesta = new int[matriz[0].length][matriz.length];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        transpuesta[j][i] = matriz[i][j];
      }
    }

    System.out.println("Transpuesta:");
    for (int i = 0; i < transpuesta.length; i++) {
      for (int j = 0; j < transpuesta[i].length; j++) {
        System.out.print(transpuesta[i][j] + " ");
      }
      System.out.println();
    }
  }
}
