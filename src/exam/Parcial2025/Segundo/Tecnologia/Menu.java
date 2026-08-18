package exam.Parcial2025.Segundo.Tecnologia;

public class Menu {

  // Mostrar menú principal con gráficos
  public void mostrarMenuPrincipal() {
    System.out.println("\\n" + "=".repeat(50));
    System.out.println("🖥️ SISTEMA DE INVENTARIO DE COMPUTADORAS 💻");
    System.out.println("=".repeat(50));
    System.out.println("┌──────────────────────────────────────────┐");
    System.out.println("│  1 │  Agregar Computadora de Escritorio  │");
    System.out.println("│  2 │  Agregar Laptop                     │");
    System.out.println("│  3 │  Listar todas las computadoras      │");
    System.out.println("│  4 │  Buscar computadora por serie       │");
    System.out.println("│  5 │  Eliminar computadora               │");
    System.out.println("│  6 │  Ver cantidad de computadoras       │");
    System.out.println("│  7 │  Actualizar Computadora Escritorio  │");
    System.out.println("│  8 │  Actualizar Laptop                  │");
    System.out.println("└──────────────────────────────────────────┘");
    System.out.print("➤ Seleccione cualquier letra para finalizar: ");
  }
}