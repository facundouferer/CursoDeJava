package exam.Parcial2025.Segundo.Concesionario;

public class Menu {

  // Mostrar menú principal con gráficos
  public void mostrarMenuPrincipal() {
    System.out.println("\n" + "=".repeat(50));
    System.out.println("🚗 SISTEMA DE INVENTARIO DE VEHÍCULOS 🏍️");
    System.out.println("=".repeat(50));
    System.out.println("┌──────────────────────────────────────────┐");
    System.out.println("│  1 │  Agregar Auto                       │");
    System.out.println("│  2 │  Agregar Moto                       │");
    System.out.println("│  3 │  Listar todos los vehículos         │");
    System.out.println("│  4 │  Buscar vehículo por patente        │");
    System.out.println("│  5 │  Eliminar vehículo                  │");
    System.out.println("│  6 │  Ver cantidad de vehículos          │");
    System.out.println("│  7 │  Actualizar Auto                    │");
    System.out.println("│  8 │  Actualizar Moto                    │");
    System.out.println("└──────────────────────────────────────────┘");
    System.out.print("➤ Seleccione cualquier letra para finaliza: ");
  }
}