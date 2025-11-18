package Parciales.Parcial2025.Segundo.Veterinaria;

public class Menu {

  // Mostrar menú principal con gráficos
  public void mostrarMenuPrincipal() {
    System.out.println("\n" + "=".repeat(50));
    System.out.println("🐦 SISTEMA DE INVENTARIO DE ANIMALES 🐱");
    System.out.println("=".repeat(50));
    System.out.println("┌──────────────────────────────────────────┐");
    System.out.println("│  1 │  Agregar Animal Avícola             │");
    System.out.println("│  2 │  Agregar Animal Cazador             │");
    System.out.println("│  3 │  Listar todos los animales          │");
    System.out.println("│  4 │  Buscar animal por nombre           │");
    System.out.println("│  5 │  Eliminar animal                    │");
    System.out.println("│  6 │  Ver cantidad de animales           │");
    System.out.println("│  7 │  Actualizar Animal Avícola          │");
    System.out.println("│  8 │  Actualizar Animal Cazador          │");
    System.out.println("└──────────────────────────────────────────┘");
    System.out.print("➤ Seleccione cualquier letra para finalizar: ");
  }
}