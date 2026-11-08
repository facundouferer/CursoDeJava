package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_concesionario;

import java.util.ArrayList;
import java.util.List;

/** Inventario de autos y motos. La patente es única en todo el inventario. */
class Inventario {

  private final List<Auto> autos = new ArrayList<>();
  private final List<Moto> motos = new ArrayList<>();

  public boolean agregarAuto(Auto auto) {
    if (buscarVehiculo(auto.getPatente()) != null) {
      return false;
    }
    return autos.add(auto);
  }

  public boolean agregarMoto(Moto moto) {
    if (buscarVehiculo(moto.getPatente()) != null) {
      return false;
    }
    return motos.add(moto);
  }

  public boolean actualizarAuto(String patente, Auto autoActualizado) {
    return reemplazar(autos, patente, autoActualizado);
  }

  public boolean actualizarMoto(String patente, Moto motoActualizada) {
    return reemplazar(motos, patente, motoActualizada);
  }

  private static <T extends Vehiculo> boolean reemplazar(List<T> lista, String patente, T nuevo) {
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i).getPatente().equals(patente)) {
        lista.set(i, nuevo);
        return true;
      }
    }
    return false;
  }

  public Vehiculo buscarVehiculo(String patente) {
    for (Auto auto : autos) {
      if (auto.getPatente().equals(patente)) {
        return auto;
      }
    }
    for (Moto moto : motos) {
      if (moto.getPatente().equals(patente)) {
        return moto;
      }
    }
    return null;
  }

  public boolean eliminarVehiculo(String patente) {
    boolean eliminadoDeAutos = autos.removeIf(auto -> auto.getPatente().equals(patente));
    boolean eliminadoDeMotos = motos.removeIf(moto -> moto.getPatente().equals(patente));
    return eliminadoDeAutos || eliminadoDeMotos;
  }

  public int getCantidadDeVehiculos() {
    return autos.size() + motos.size();
  }

  public void listarTodosLosVehiculos() {
    System.out.println("=== INVENTARIO DE VEHÍCULOS ===");
    System.out.println("\nAUTOS (" + autos.size() + "):");
    autos.forEach(System.out::println);
    System.out.println("\nMOTOS (" + motos.size() + "):");
    motos.forEach(System.out::println);
    System.out.println("\nTotal de vehículos: " + getCantidadDeVehiculos());
  }
}
