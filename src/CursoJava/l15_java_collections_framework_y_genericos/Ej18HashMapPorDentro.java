/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Ver cómo un HashMap elige el bucket con hashCode() y resuelve colisiones con equals().
 * Concepto: hashCode() elige el cajón; equals() elige el elemento dentro del cajón. Con un
 * hashCode mal implementado la clave se busca en el bucket equivocado y el mapa degenera.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class Ej18HashMapPorDentro {

  /** Clave con equals y hashCode coherentes. */
  static final class ClaveBuena {
    private final String texto;

    ClaveBuena(String texto) {
      this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
      return o instanceof ClaveBuena otra && texto.equals(otra.texto);
    }

    @Override
    public int hashCode() {
      return Objects.hash(texto);
    }
  }

  /** Clave con equals pero SIN hashCode: usa el hashCode de Object (identidad). */
  static final class ClaveSinHashCode {
    private final String texto;

    ClaveSinHashCode(String texto) {
      this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
      return o instanceof ClaveSinHashCode otra && texto.equals(otra.texto);
    }
  }

  /** Mini HashMap didáctico: un arreglo de buckets, cada uno con una lista (encadenamiento). */
  static class MiniHashMap<K, V> {
    private static final class Nodo<K, V> {
      final K clave;
      V valor;

      Nodo(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
      }
    }

    private final LinkedList<Nodo<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    MiniHashMap(int capacidad) {
      buckets = new LinkedList[capacidad];
    }

    int indiceDe(K clave) {
      return Math.abs(clave.hashCode() % buckets.length);
    }

    void put(K clave, V valor) {
      int indice = indiceDe(clave);
      if (buckets[indice] == null) {
        buckets[indice] = new LinkedList<>();
      }
      for (Nodo<K, V> nodo : buckets[indice]) {
        if (nodo.clave.equals(clave)) { // equals decide dentro del bucket
          nodo.valor = valor;
          return;
        }
      }
      buckets[indice].add(new Nodo<>(clave, valor));
    }

    V get(K clave) {
      LinkedList<Nodo<K, V>> bucket = buckets[indiceDe(clave)];
      if (bucket == null) {
        return null;
      }
      for (Nodo<K, V> nodo : bucket) {
        if (nodo.clave.equals(clave)) {
          return nodo.valor;
        }
      }
      return null;
    }

    void mostrar() {
      for (int i = 0; i < buckets.length; i++) {
        StringBuilder sb = new StringBuilder("bucket " + i + ": ");
        if (buckets[i] == null) {
          sb.append("vacío");
        } else {
          for (Nodo<K, V> nodo : buckets[i]) {
            sb.append("[").append(nodo.clave).append(" → ").append(nodo.valor).append("] ");
          }
        }
        System.out.println(sb.toString().trim());
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("== hashCode y bucket (capacidad 16) ==");
    for (String clave : new String[] { "gato", "toga", "perro" }) {
      int hash = clave.hashCode();
      // HashMap mezcla los bits altos con los bajos antes de elegir el bucket: h ^ (h >>> 16).
      int mezclado = hash ^ (hash >>> 16);
      System.out.println("\"" + clave + "\".hashCode() = " + hash + " → bucket " + (mezclado & 15));
    }

    System.out.println("\n== Mini HashMap con 4 buckets (hay colisiones) ==");
    MiniHashMap<String, Integer> mini = new MiniHashMap<>(4);
    mini.put("gato", 4);
    mini.put("toga", 9);
    mini.put("perro", 1);
    mini.put("gato", 5); // equals encuentra la clave existente y sobrescribe
    mini.mostrar();
    System.out.println("get(\"gato\") = " + mini.get("gato"));
    System.out.println("get(\"toga\") = " + mini.get("toga"));
    System.out.println("get(\"loro\") = " + mini.get("loro"));

    System.out.println("\n== Clave con equals y hashCode coherentes ==");
    Map<ClaveBuena, String> bueno = new HashMap<>();
    bueno.put(new ClaveBuena("a"), "valor");
    System.out.println("get(new ClaveBuena(\"a\")) = " + bueno.get(new ClaveBuena("a")));

    System.out.println("\n== Clave con equals pero sin hashCode ==");
    Map<ClaveSinHashCode, String> malo = new HashMap<>();
    malo.put(new ClaveSinHashCode("a"), "valor");
    ClaveSinHashCode igual = new ClaveSinHashCode("a");
    System.out.println("equals entre ambas: " + new ClaveSinHashCode("a").equals(igual));
    System.out.println("get(clave equivalente) = " + malo.get(igual) + " (buscó en otro bucket)");
  }
}
