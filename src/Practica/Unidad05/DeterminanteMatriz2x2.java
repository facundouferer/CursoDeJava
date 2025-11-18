package Practica.Unidad05;

public class DeterminanteMatriz2x2 {
  public static void main(String[] args) {
    int[][] matriz = {
        { 4, 3 },
        { 2, 1 }
    };

    int determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

    System.out.println("El determinante de la matriz 2x2 es: " + determinante);
  }
}
