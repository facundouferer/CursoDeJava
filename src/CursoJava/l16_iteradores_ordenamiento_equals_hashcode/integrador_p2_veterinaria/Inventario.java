package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_veterinaria;

import java.util.ArrayList;
import java.util.List;

/** Inventario de animales avícolas y cazadores. El nombre es único en todo el inventario. */
class Inventario {

  private final List<Avicola> avicolas = new ArrayList<>();
  private final List<Cazador> cazadores = new ArrayList<>();

  public boolean agregarAvicola(Avicola avicola) {
    if (buscarAnimal(avicola.getNombre()) != null) {
      return false;
    }
    return avicolas.add(avicola);
  }

  public boolean agregarCazador(Cazador cazador) {
    if (buscarAnimal(cazador.getNombre()) != null) {
      return false;
    }
    return cazadores.add(cazador);
  }

  public boolean actualizarAvicola(String nombre, Avicola avicolaActualizado) {
    return reemplazar(avicolas, nombre, avicolaActualizado);
  }

  public boolean actualizarCazador(String nombre, Cazador cazadorActualizada) {
    return reemplazar(cazadores, nombre, cazadorActualizada);
  }

  private static <T extends Animalito> boolean reemplazar(List<T> lista, String nombre, T nuevo) {
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i).getNombre().equals(nombre)) {
        lista.set(i, nuevo);
        return true;
      }
    }
    return false;
  }

  public Animalito buscarAnimal(String nombre) {
    for (Avicola avicola : avicolas) {
      if (avicola.getNombre().equals(nombre)) {
        return avicola;
      }
    }
    for (Cazador cazador : cazadores) {
      if (cazador.getNombre().equals(nombre)) {
        return cazador;
      }
    }
    return null;
  }

  public boolean eliminarAnimal(String nombre) {
    boolean eliminadoDeAvicolas = avicolas.removeIf(avicola -> avicola.getNombre().equals(nombre));
    boolean eliminadoDeCazadors = cazadores.removeIf(cazador -> cazador.getNombre().equals(nombre));
    return eliminadoDeAvicolas || eliminadoDeCazadors;
  }

  public int getCantidadDeAnimales() {
    return avicolas.size() + cazadores.size();
  }

  public void listarTodosLosAnimales() {
    System.out.println("=== INVENTARIO DE ANIMALES ===");
    System.out.println("\nAVÍCOLAS (" + avicolas.size() + "):");
    avicolas.forEach(System.out::println);
    System.out.println("\nCAZADORES (" + cazadores.size() + "):");
    cazadores.forEach(System.out::println);
    System.out.println("\nTotal de animales: " + getCantidadDeAnimales());
  }
}
