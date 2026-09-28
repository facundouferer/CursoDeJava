package CursoJava.ClasesAbstractas.Transportes;

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
