package Practica.Unidad01;

class Test04 {
  public static void main(String[] args) {
    int resultado = multiplicar(3, 4);
    System.out.println(resultado);
  }

  public static int multiplicar(int a, int b) {
    if (b == 0) {
      return 0;
    } else {
      return a + multiplicar(a, b - 1);
    }
  }
}
