package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Mostrar lambdas sin parámetros con Supplier y Runnable, y filtrar una lista con un Stream.
 * Concepto: 4. Comparator: todos los otros órdenes (interfaz funcional y lambdas).
 */
public class Ej06LambdasSinArgumentos {
  public static void main(String[] args) {
    // Supplier: no recibe argumentos y devuelve un valor.
    Supplier<String> saludo = () -> "¡Hola, mundo!";
    System.out.println(saludo.get());

    // Runnable: no recibe argumentos ni devuelve valor, solo ejecuta una acción.
    Runnable mensaje = () -> System.out.println("Este es un mensaje de la expresión lambda.");
    mensaje.run();

    // Lambda como predicado en un Stream: se conservan los números pares.
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    List<Integer> pares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    System.out.println(pares);
  }
}
