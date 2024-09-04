package CursoJava.ClasesAbstractas;

class Transportes {
  public static void main(String[] args) {

    Terrestre auto = new Terrestre(200, 10, 10000, 4);
    Acuatico barco = new Acuatico(500, 5, 20000, "Lancha");

    auto.mostrarInformacion();
    barco.mostrarInformacion();

  }
}

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

class Terrestre extends Vehiculo {
  private int ruedas;

  public Terrestre(double hp, int stock, double precio, int ruedas) {
    super(hp, stock, precio);
    this.ruedas = ruedas;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("\nHP: " + super.getHp());
    System.out.println("Stock: " + super.getStock());
    System.out.println("Precio: " + super.getPrecio());
    System.out.println("Ruedas: " + ruedas);
  }

  String verCaracteriscas() {
    return "Ruedas: " + ruedas;
  }

}

class Acuatico extends Vehiculo {
  private String tipoCasco;

  public Acuatico(double hp, int stock, double precio, String tipoCasco) {
    super(hp, stock, precio);
    this.tipoCasco = tipoCasco;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("\nHP: " + super.getHp());
    System.out.println("Stock: " + super.getStock());
    System.out.println("Precio: " + super.getPrecio());
    System.out.println("Eslora: " + tipoCasco);
  }

  String verCaracteriscas() {
    return "Tipo de casco: " + tipoCasco;
  }

}