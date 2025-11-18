package Practica.Unidad01;

public class Test01 {
  public static void main(String[] args) {
    int resultado = suma(7);
    System.out.println(resultado);
  }

  public static int suma(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + suma(n - 1);
    }
  }
}
