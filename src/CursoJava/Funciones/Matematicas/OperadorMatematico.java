package CursoJava.Funciones.Matematicas;

public class OperadorMatematico {

  public static int sumar(int a, int b) {
    return a + b;
  }

  public static int restar(int a, int b) {
    return a - b;
  }

  public static int multiplicar(int a, int b) {
    return a * b;
  }

  public static int dividir(int a, int b) {
    return a / b;
  }

  public static int modulo(int a, int b) {
    return a % b;
  }

  public static int potencia(int base, int exponente) {
    return (int) Math.pow(base, exponente);
  }

}
