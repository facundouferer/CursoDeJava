package Practica.Unidad05;

import java.util.ArrayList;

public class IntercalarArrays {
  // Math.min determina cuál es más grande
  public static ArrayList<Object> intercalar(Object[] a1, Object[] a2) {
    ArrayList<Object> resultado = new ArrayList<>();
    int length = Math.min(a1.length, a2.length);
    for (int i = 0; i < length; i++) {
      resultado.add(a1[i]);
      resultado.add(a2[i]);
    }
    if (a1.length > a2.length) {
      for (int i = length; i < a2.length; i++) {
        resultado.add(a1[i]);
      }
    } else if (a2.length > a1.length) {
      for (int i = length; i < a1.length; i++) {
        resultado.add(a2[i]);
      }
    }
    return resultado;
  }

  public static void main(String[] args) {
    Object[] array1 = { "A", "B", "C" };
    Object[] array2 = { 1, 2, 3 };
    ArrayList<Object> resultado = intercalar(array1, array2);
    System.out.println(resultado);
  }
}
