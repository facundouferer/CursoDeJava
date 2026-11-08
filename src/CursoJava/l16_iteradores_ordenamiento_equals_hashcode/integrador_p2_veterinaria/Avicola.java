package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_veterinaria;

class Avicola extends Animalito implements Cuidados {

  private static final double PESO_MINIMO = 1.0;
  private static final double INCREMENTO_POR_EDAD = 0.05;

  private final String tipoPlumaje;

  public Avicola(String especie, int edad, String nombre, double peso, String tipoPlumaje)
      throws PesoInsuficienteException {
    super(especie, edad, nombre, peso);
    if (peso < PESO_MINIMO) {
      throw new PesoInsuficienteException(
          "Un animal avícola debe pesar al menos " + PESO_MINIMO + " kg. Peso recibido: " + peso
              + " kg");
    }
    this.tipoPlumaje = tipoPlumaje.toUpperCase();
  }

  public String getTipoPlumaje() {
    return tipoPlumaje;
  }

  @Override
  public double calcularCostoCuidado(double costoBase, int edadAnimal) {
    double adicionalPorPlumaje;
    if (tipoPlumaje.equals("EXOTICO")) {
      adicionalPorPlumaje = 0.4;
    } else if (tipoPlumaje.equals("COLORIDO")) {
      adicionalPorPlumaje = 0.3;
    } else {
      adicionalPorPlumaje = 0.2;
    }
    return costoBase * (1 + edadAnimal * INCREMENTO_POR_EDAD) * (1 + adicionalPorPlumaje);
  }

  @Override
  public String getTipo() {
    return "Avícola";
  }

  @Override
  public String toString() {
    return super.toString() + "\tplumaje " + tipoPlumaje;
  }
}
