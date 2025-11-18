package Practica.Unidad05;

public class FuncionAnidada {
  public static void main(String[] args) {
    System.out.println(funcionX(3, 2));
  }

  public static int funcionX(int a, int b) {
    if (a <= 0) {
      return b;
    } else {
      return funcionY(a - 1, b + 1);
    }
  }

  public static int funcionY(int c, int d) {
    if (d <= 1) {
      return c;
    } else {
      return funcionZ(c - 1, d - 1) + funcionW(c, d);
    }
  }

  public static int funcionZ(int e, int f) {
    if (e <= 1) {
      return f;
    } else {
      return funcionX(e - 1, f + 2);
    }
  }

  public static int funcionW(int g, int h) {
    if (g <= 0) {
      return h;
    } else {
      return funcionX(g - 2, h - 2) + funcionY(g, h - 1);
    }
  }
}
