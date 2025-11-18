package Practica.Unidad05;

public class FuncionConfusa {
  public static void main(String[] args) {
    System.out.println(funcionA(7));
  }

  public static int funcionA(int x) {
    if (x <= 1) {
      return x;
    } else {
      return funcionB(x - 1) + funcionA(x - 2);
    }
  }

  public static int funcionB(int y) {
    if (y <= 2) {
      return y;
    } else {
      return funcionA(y - 1) + funcionB(y - 2);
    }
  }
}
