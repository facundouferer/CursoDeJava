package CursoJava.Excepciones;

public class DivisionPorCero {
  public static void main(String[] args) {
    int numerador = 10;
    int denominador = 0;

    try {
      int resultado = numerador / denominador;
      System.out.println("El resultado es: " + resultado);
    } catch (ArithmeticException e) {
      // Manejar la excepción de división por cero
      System.out.println("Error: No se puede dividir por cero.");
    }
  }
}
