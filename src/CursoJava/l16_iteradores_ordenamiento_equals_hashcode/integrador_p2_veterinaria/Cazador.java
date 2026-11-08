package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_veterinaria;

class Cazador extends Animalito implements Cuidados {

  private static final double INCREMENTO_POR_EDAD = 0.08;
  private static final double DESCUENTO = 0.15;

  public Cazador(String especie, int edad, String nombre, double peso) {
    super(especie, edad, nombre, peso);
  }

  @Override
  public double calcularCostoCuidado(double costoBase, int edadAnimal) {
    return costoBase * (1 + edadAnimal * INCREMENTO_POR_EDAD) * (1 - DESCUENTO);
  }

  @Override
  public String getTipo() {
    return "Cazador";
  }
}
