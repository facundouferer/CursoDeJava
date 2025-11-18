package Parciales.Parcial2025.Segundo.Tecnologia;

import java.util.ArrayList;

public class InventarioComputadoras {

  private ArrayList<Escritorio> escritorios;
  private ArrayList<Laptop> laptops;

  public InventarioComputadoras() {
    this.escritorios = new ArrayList<>();
    this.laptops = new ArrayList<>();
  }

  // ================ MÉTODOS CRUD PARA ESCRITORIOS ================

  public boolean agregarEscritorio(Escritorio escritorio) {
    if (!escritorios.stream().anyMatch(e -> e.getNumeroSerie().equals(escritorio.getNumeroSerie()))) {
      escritorios.add(escritorio);
      return true;
    }
    return false; // Ya existe un escritorio con ese número de serie
  }

  public boolean actualizarEscritorio(String numeroSerie, Escritorio escritorioActualizado) {
    for (int i = 0; i < escritorios.size(); i++) {
      if (escritorios.get(i).getNumeroSerie().equals(numeroSerie)) {
        escritorios.set(i, escritorioActualizado);
        return true;
      }
    }
    return false;
  }

  // ================ MÉTODOS CRUD PARA LAPTOPS ================

  public boolean agregarLaptop(Laptop laptop) {
    if (!laptops.stream().anyMatch(l -> l.getNumeroSerie().equals(laptop.getNumeroSerie()))) {
      laptops.add(laptop);
      return true;
    }
    return false; // Ya existe una laptop con ese número de serie
  }

  // Actualizar Laptop
  public boolean actualizarLaptop(String numeroSerie, Laptop laptopActualizada) {
    for (int i = 0; i < laptops.size(); i++) {
      if (laptops.get(i).getNumeroSerie().equals(numeroSerie)) {
        laptops.set(i, laptopActualizada);
        return true;
      }
    }
    return false;
  }

  // ================ MÉTODOS DE CONSULTA GENERAL ================

  public boolean eliminarComputadora(String numeroSerie) {
    // Intentar eliminar de escritorios
    boolean eliminadoDeEscritorios = escritorios
        .removeIf(escritorio -> escritorio.getNumeroSerie().equals(numeroSerie));
    boolean eliminadoDeLaptops = laptops.removeIf(laptop -> laptop.getNumeroSerie().equals(numeroSerie));

    return eliminadoDeEscritorios || eliminadoDeLaptops;
  }

  public String getCantidadDeComputadoras() {
    return "Total de computadoras: " + (escritorios.size() + laptops.size());
  }

  // Obtener listas completas
  public ArrayList<Escritorio> getEscritorios() {
    return new ArrayList<>(escritorios);
  }

  public ArrayList<Laptop> getLaptops() {
    return new ArrayList<>(laptops);
  }

  // Listar todas las computadoras
  public void listarTodasLasComputadoras() {
    System.out.println("=== INVENTARIO DE COMPUTADORAS ===");

    System.out.println("\\nCOMPUTADORAS DE ESCRITORIO (" + escritorios.size() + "):");
    escritorios.forEach(escritorio -> System.out.println(escritorio.toString()));

    System.out.println("\\nLAPTOPS (" + laptops.size() + "):");
    laptops.forEach(laptop -> System.out.println(laptop.toString()));

    System.out.println("\\n" + getCantidadDeComputadoras());
  }

  // Verificar si existe una computadora con ese número de serie
  public boolean existeComputadora(String numeroSerie) {
    return buscarComputadora(numeroSerie) != null;
  }
}