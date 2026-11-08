package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.ej02_banco;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Mantener los clientes del banco en un conjunto sin duplicados.
 * Concepto: 6. hashCode: el que rompe todo cuando falta.
 */
public class Banco {
  private final Set<Cliente> clientes = new HashSet<>();

  /** Devuelve false si ya había un cliente con ese DNI. */
  public boolean agregar(Cliente cliente) {
    return clientes.add(cliente);
  }

  /** Elimina con Iterator.remove(); un for-each lanzaría ConcurrentModificationException. */
  public void eliminarPorNombre(String nombre) {
    Iterator<Cliente> iterador = clientes.iterator();
    while (iterador.hasNext()) {
      if (iterador.next().getNombre().equals(nombre)) {
        iterador.remove();
      }
    }
  }

  public void mostrarNombres() {
    Iterator<Cliente> iterador = clientes.iterator();
    while (iterador.hasNext()) {
      System.out.println(iterador.next().getNombre());
    }
  }

  public void listar() {
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }
  }
}
