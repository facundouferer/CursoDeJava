package Practica.Unidad05;

public class ConfusionParametros {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    intercambiar(a, b);
    System.out.println("a = " + a + ", b = " + b);
  }

  public static void intercambiar(int x, int y) {
    int temp = x;
    x = y++;
    y = temp++;
    System.out.println("x = " + x + ", y = " + y);
  }
}