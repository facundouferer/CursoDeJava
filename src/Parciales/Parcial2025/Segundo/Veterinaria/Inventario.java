package Parciales.Parcial2025.Segundo.Veterinaria;

import java.util.ArrayList;

public class Inventario {

  private ArrayList<Avicolas> avicolas;
  private ArrayList<Caceras> caceras;

  public Inventario() {
    this.avicolas = new ArrayList<>();
    this.caceras = new ArrayList<>();
  }

  // ================ MÉTODOS CRUD PARA AVICOLAS ================

  public boolean agregarAvicola(Avicolas avicola) {

    if (!avicolas.stream().anyMatch(a -> a.getNombre().equals(avicola.getNombre()))) {
      avicolas.add(avicola);
      return true;
    }
    return false; // Ya existe un animal avícola con ese nombre
  }

  public boolean actualizarAvicola(String nombre, Avicolas avicolaActualizada) {
    for (int i = 0; i < avicolas.size(); i++) {
      if (avicolas.get(i).getNombre().equals(nombre)) {
        avicolas.set(i, avicolaActualizada);
        return true;
      }
    }
    return false;
  }

  // ================ MÉTODOS CRUD PARA CACERAS ================

  public boolean agregarCacera(Caceras cacera) {
    if (!caceras.stream().anyMatch(c -> c.getNombre().equals(cacera.getNombre()))) {
      caceras.add(cacera);
      return true;
    }
    return false; // Ya existe un animal cazador con ese nombre
  }

  // Actualizar Cacera
  public boolean actualizarCacera(String nombre, Caceras caceraActualizada) {
    for (int i = 0; i < caceras.size(); i++) {
      if (caceras.get(i).getNombre().equals(nombre)) {
        caceras.set(i, caceraActualizada);
        return true;
      }
    }
    return false;
  }

  // ================ MÉTODOS DE CONSULTA GENERAL ================

  public Animalito buscarAnimal(String nombre) {

    for (Avicolas avicola : avicolas) {
      if (avicola.getNombre().equals(nombre)) {
        return avicola;
      }
    }

    for (Caceras cacera : caceras) {
      if (cacera.getNombre().equals(nombre)) {
        return cacera;
      }
    }

    return null;

  }

  public boolean eliminarAnimal(String nombre) {
    // Intentar eliminar de avícolas
    boolean eliminadoDeAvicolas = avicolas.removeIf(avicola -> avicola.getNombre().equals(nombre));
    boolean eliminadoDeCaceras = caceras.removeIf(cacera -> cacera.getNombre().equals(nombre));
    if (eliminadoDeAvicolas || eliminadoDeCaceras) {
      return true;
    }
    return eliminadoDeCaceras;
  }

  public String getCantidadDeAnimales() {
    return "Total de animales: " + (avicolas.size() + caceras.size());
  }

  // Obtener listas completas
  public ArrayList<Avicolas> getAvicolas() {
    return new ArrayList<>(avicolas);
  }

  public ArrayList<Caceras> getCaceras() {
    return new ArrayList<>(caceras);
  }

  // Listar todos los animales
  public void listarTodosLosAnimales() {
    System.out.println("=== INVENTARIO DE ANIMALES ===\n");

    System.out.println("\nAVÍCOLAS (" + avicolas.size() + "):");
    avicolas.forEach(avicola -> System.out.println(avicola.toString()));

    System.out.println("\nCAZADORES (" + caceras.size() + "):");
    caceras.forEach(cacera -> System.out.println(cacera.toString()));

    System.out.println("\nTotal de animales: " + getCantidadDeAnimales());
  }

  // Verificar si existe un animal con ese nombre
  public boolean existeAnimal(String nombre) {
    return buscarAnimal(nombre) != null;
  }
}