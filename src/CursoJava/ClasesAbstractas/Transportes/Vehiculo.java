package CursoJava.ClasesAbstractas.Transportes;

abstract class Vehiculo {
  private double hp;
  private int stock;
  private double precio;

  public Vehiculo(double hp, int stock, double precio) {
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
    this.stock--;
  }

  abstract String verCaracteriscas();

  public abstract void mostrarInformacion();

}
