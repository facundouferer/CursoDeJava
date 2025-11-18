package Parciales.Parcial2025.Segundo.Concesionario;

import java.util.ArrayList;

public class Inventario {

  private ArrayList<Auto> autos;
  private ArrayList<Moto> motos;

  public Inventario() {
    this.autos = new ArrayList<>();
    this.motos = new ArrayList<>();
  }

  // ================ MÉTODOS CRUD PARA AUTOS ================

  public boolean actualizarAuto(String patente, Auto autoActualizado) {
    for (int i = 0; i < autos.size(); i++) {
      if (autos.get(i).getPatente().equals(patente)) {
        autos.set(i, autoActualizado);
        return true;
      }
    }
    return false;
  }

  // ================ MÉTODOS CRUD PARA MOTOS ================

  public boolean agregarMoto(Moto moto) {
    if (!motos.stream().anyMatch(m -> m.getPatente().equals(moto.getPatente()))) {
      motos.add(moto);
      return true;
    }
    return false; // Ya existe una moto con esa patente
  }

  // Actualizar Moto
  public boolean actualizarMoto(String patente, Moto motoActualizada) {
    for (int i = 0; i < motos.size(); i++) {
      if (motos.get(i).getPatente().equals(patente)) {
        motos.set(i, motoActualizada);
        return true;
      }
    }
    return false;
  }

  // ================ MÉTODOS DE CONSULTA GENERAL ================

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
    // Intentar eliminar de autos
    boolean eliminadoDeAutos = autos.removeIf(auto -> auto.getPatente().equals(patente));
    boolean eliminadoDeMotos = motos.removeIf(moto -> moto.getPatente().equals(patente));
    if (eliminadoDeAutos || eliminadoDeMotos) {
      return true;
    }
    return eliminadoDeMotos;
  }

  public String getCantidadDeVehiculos() {
    return "Total de vehículos: " + (autos.size() + motos.size());
  }

  // Obtener listas completas
  public ArrayList<Auto> getAutos() {
    return new ArrayList<>(autos);
  }

  public ArrayList<Moto> getMotos() {
    return new ArrayList<>(motos);
  }

  // Listar todos los vehículos
  public void listarTodosLosVehiculos() {
    System.out.println("=== INVENTARIO DE VEHÍCULOS ===");

    System.out.println("\nAUTOS (" + autos.size() + "):");
    autos.forEach(auto -> System.out.println(auto.toString()));

    System.out.println("\nMOTOS (" + motos.size() + "):");
    motos.forEach(moto -> System.out.println(moto.toString()));

    System.out.println("\nTotal de vehículos: " + getCantidadDeVehiculos());
  }

  // Verificar si existe un vehículo con esa patente
  public boolean existeVehiculo(String patente) {
    return buscarVehiculo(patente) != null;
  }
}