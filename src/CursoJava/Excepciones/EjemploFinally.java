package CursoJava.Excepciones;

public class EjemploFinally {
  public static void main(String[] args) {
    try {
      int resultado = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Error: No se puede dividir por cero.");
    } finally {
      System.out.println("Este bloque se ejecuta siempre.");
    }
  }
}
