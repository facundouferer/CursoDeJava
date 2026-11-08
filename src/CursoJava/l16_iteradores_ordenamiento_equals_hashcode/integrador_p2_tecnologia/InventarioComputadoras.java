package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_tecnologia;

import java.util.ArrayList;
import java.util.List;

/** Inventario de escritorios y laptops. El número de serie es único en todo el inventario. */
class InventarioComputadoras {

  private final List<Escritorio> escritorios = new ArrayList<>();
  private final List<Laptop> laptops = new ArrayList<>();

  public boolean agregarEscritorio(Escritorio escritorio) {
    if (buscarComputadora(escritorio.getNumeroSerie()) != null) {
      return false;
    }
    return escritorios.add(escritorio);
  }

  public boolean agregarLaptop(Laptop laptop) {
    if (buscarComputadora(laptop.getNumeroSerie()) != null) {
      return false;
    }
    return laptops.add(laptop);
  }

  public boolean actualizarEscritorio(String numeroSerie, Escritorio escritorioActualizado) {
    return reemplazar(escritorios, numeroSerie, escritorioActualizado);
  }

  public boolean actualizarLaptop(String numeroSerie, Laptop laptopActualizada) {
    return reemplazar(laptops, numeroSerie, laptopActualizada);
  }

  private static <T extends Computadora> boolean reemplazar(List<T> lista, String numeroSerie, T nuevo) {
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i).getNumeroSerie().equals(numeroSerie)) {
        lista.set(i, nuevo);
        return true;
      }
    }
    return false;
  }

  public Computadora buscarComputadora(String numeroSerie) {
    for (Escritorio escritorio : escritorios) {
      if (escritorio.getNumeroSerie().equals(numeroSerie)) {
        return escritorio;
      }
    }
    for (Laptop laptop : laptops) {
      if (laptop.getNumeroSerie().equals(numeroSerie)) {
        return laptop;
      }
    }
    return null;
  }

  public boolean eliminarComputadora(String numeroSerie) {
    boolean eliminadoDeEscritorios = escritorios.removeIf(escritorio -> escritorio.getNumeroSerie().equals(numeroSerie));
    boolean eliminadoDeLaptops = laptops.removeIf(laptop -> laptop.getNumeroSerie().equals(numeroSerie));
    return eliminadoDeEscritorios || eliminadoDeLaptops;
  }

  public int getCantidadDeComputadoras() {
    return escritorios.size() + laptops.size();
  }

  public void listarTodasLasComputadoras() {
    System.out.println("=== INVENTARIO DE COMPUTADORAS ===");
    System.out.println("\nAUTOS (" + escritorios.size() + "):");
    escritorios.forEach(System.out::println);
    System.out.println("\nMOTOS (" + laptops.size() + "):");
    laptops.forEach(System.out::println);
    System.out.println("\nTotal de computadoras: " + getCantidadDeComputadoras());
  }
}
