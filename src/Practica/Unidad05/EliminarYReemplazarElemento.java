package Practica.Unidad05;

public class EliminarYReemplazarElemento {

  public static void main(String[] args) {
    int[][] matriz = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 5 }
    };

    int elementoAEliminar = 5;
    mostrarMatrizConReemplazo(matriz, elementoAEliminar);
  }

  public static void mostrarMatrizConReemplazo(int[][] matriz, int elemento) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[j][i] == elemento) {
          System.out.print("X ");
        } else {
          System.out.print(matriz[j][i] + " ");
        }
      }
      System.out.println();
    }
  }

}
