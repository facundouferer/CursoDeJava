package CursoJava.Excepciones;

public class EjemploFinally {
  public static void main(String[] args) {
    try {
      // Código que puede lanzar una excepción
      int resultado = 10 / 0;
    } catch (ArithmeticException e) {
      // Manejar la excepción
      System.out.println("Error: No se puede dividir por cero.");
    } finally {
      // Este código se ejecuta siempre
      System.out.println("Este bloque se ejecuta siempre.");
    }
  }
}
