package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Declarar una interfaz funcional propia e implementarla con una expresión lambda.
 * Concepto: 4. Comparator: todos los otros órdenes (interfaz funcional y lambdas).
 */
public class Ej05InterfazFuncional {

  /** Una interfaz funcional tiene exactamente un método abstracto. */
  @FunctionalInterface
  interface Saludo {
    void saludar();
  }

  public static void main(String[] args) {
    Saludo saludo = () -> System.out.println("Hola desde la expresión lambda");
    saludo.saludar();
  }
}
