package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Realizar las cuatro operaciones aritméticas con lambdas sobre una interfaz funcional propia.
 * Concepto: 4. Comparator: todos los otros órdenes (interfaz funcional y lambdas).
 */
public class Ej07OperacionesConLambdas {

  @FunctionalInterface
  interface OperacionBinaria<T, U, R> {
    R aplicar(T primero, U segundo);
  }

  public static void main(String[] args) {
    OperacionBinaria<Integer, Integer, Integer> suma = (a, b) -> a + b;
    OperacionBinaria<Integer, Integer, Integer> resta = (a, b) -> a - b;
    OperacionBinaria<Integer, Integer, Integer> multiplicacion = (a, b) -> a * b;
    OperacionBinaria<Integer, Integer, Double> division = (a, b) -> (b != 0) ? (double) a / b : Double.NaN;

    int num1 = 10;
    int num2 = 5;

    System.out.println("Operaciones aritméticas:");
    System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma.aplicar(num1, num2));
    System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta.aplicar(num1, num2));
    System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion.aplicar(num1, num2));
    System.out.println("División: " + num1 + " / " + num2 + " = " + division.aplicar(num1, num2));
  }
}
