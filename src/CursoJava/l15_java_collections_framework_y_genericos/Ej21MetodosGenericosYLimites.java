/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Escribir métodos genéricos, acotar el tipo con extends y usar comodines (wildcards).
 * Concepto: Un método genérico declara su parámetro de tipo antes del retorno; <T extends
 * Comparable<T>> permite usar compareTo; ? extends T lee y ? super T escribe.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Ej21MetodosGenericosYLimites {

  public static <T> T primero(List<T> lista) {
    if (lista.isEmpty()) {
      throw new NoSuchElementException("Lista vacía");
    }
    return lista.get(0);
  }

  // T tiene que ser comparable, así podemos usar compareTo
  public static <T extends Comparable<T>> T maximo(List<T> lista) {
    T mayor = lista.get(0);
    for (T elemento : lista) {
      if (elemento.compareTo(mayor) > 0) {
        mayor = elemento;
      }
    }
    return mayor;
  }

  // ? extends Number: se puede leer como Number (List<Integer>, List<Double>...)
  public static double sumar(List<? extends Number> numeros) {
    double total = 0;
    for (Number n : numeros) {
      total += n.doubleValue();
    }
    return total;
  }

  // ? super Integer: se pueden agregar Integer (List<Integer>, List<Number>, List<Object>)
  public static void agregarUnoDosTres(List<? super Integer> destino) {
    destino.add(1);
    destino.add(2);
    destino.add(3);
  }

  public static void main(String[] args) {
    List<String> nombres = List.of("Zorro", "Ana", "Pedro");
    List<Integer> numeros = List.of(7, 3, 9, 4);

    System.out.println("primero(nombres) = " + primero(nombres));
    System.out.println("primero(numeros) = " + primero(numeros));
    try {
      primero(new ArrayList<String>());
    } catch (NoSuchElementException e) {
      System.out.println("primero(vacía) lanza: " + e.getMessage());
    }

    System.out.println("\nmaximo(nombres) = " + maximo(nombres));
    System.out.println("maximo(numeros) = " + maximo(numeros));

    System.out.println("\nsumar(List<Integer>) = " + sumar(numeros));
    System.out.println("sumar(List<Double>) = " + sumar(List.of(1.5, 2.5)));

    List<Number> destinoNumber = new ArrayList<>();
    List<Object> destinoObject = new ArrayList<>();
    agregarUnoDosTres(destinoNumber);
    agregarUnoDosTres(destinoObject);
    System.out.println("\nagregarUnoDosTres en List<Number>: " + destinoNumber);
    System.out.println("agregarUnoDosTres en List<Object>: " + destinoObject);
  }
}
