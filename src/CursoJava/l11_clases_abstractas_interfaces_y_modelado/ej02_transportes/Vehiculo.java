package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej02_transportes;

/** Un "vehículo genérico" no existe: es un concepto, por eso no se puede instanciar. */
public abstract class Vehiculo {
  private final double hp;
  private int stock;
  private final double precio;

  protected Vehiculo(double hp, int stock, double precio) {
    this.hp = hp;
    this.stock = stock;
    this.precio = precio;
  }

  public double getHp() {
    return hp;
  }

  public int getStock() {
    return stock;
  }

  public double getPrecio() {
    return precio;
  }

  public void vender() {
    if (stock > 0) {
      stock--;
    } else {
      System.out.println("No hay stock disponible.");
    }
  }

  /** Dato propio de cada tipo de vehículo. */
  public abstract String verCaracteristicas();

  /** Algoritmo común: lo compartido se resuelve acá y el detalle lo aporta la subclase. */
  public void mostrarInformacion() {
    System.out.println("\nHP: " + hp);
    System.out.println("Stock: " + stock);
    System.out.println("Precio: " + precio);
    System.out.println(verCaracteristicas());
  }
}
