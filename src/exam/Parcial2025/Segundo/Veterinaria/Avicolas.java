package exam.Parcial2025.Segundo.Veterinaria;

class Avicolas extends Animalito implements Cuidados {
  private String tipoPlumaje;

  public Avicolas(String especie, int edad, String nombre, double peso, String tipoPlumaje)
      throws PesoInsuficienteException {
    super(especie, edad, nombre, peso);

    // Validar que el animal avícola tenga al menos 1kg
    if (peso < 1.0) {
      throw new PesoInsuficienteException(
          "Error: Un animal avícola debe tener al menos 1kg de peso. Peso recibido: " + peso + "kg");
    }

    this.tipoPlumaje = tipoPlumaje;
  }

  // Getter
  public String getTipoPlumaje() {
    return tipoPlumaje;
  }

  // Implementación de la interface Cuidados
  @Override
  public double calcularCostoCuidado(double costoBase, int edadAnimal) {
    // Calcular incremento por años (animales mayores necesitan más cuidado)
    double incrementoEdad = this.edad * 0.05; // 5% por año

    // Calcular porcentaje adicional según tipo de plumaje
    double porcentajePlumaje;
    if (tipoPlumaje.equalsIgnoreCase("EXOTICO")) {
      porcentajePlumaje = 0.4;
    } else if (tipoPlumaje.equalsIgnoreCase("COLORIDO")) {
      porcentajePlumaje = 0.3;
    } else {
      porcentajePlumaje = 0.2; // Valor por defecto para plumaje común
    }

    // Calcular costo final
    double costoConEdad = costoBase * (1 + incrementoEdad);
    return costoConEdad * (1 + porcentajePlumaje);
  }

  // Setter
  public void setTipoPlumaje(String tipoPlumaje) {
    this.tipoPlumaje = tipoPlumaje;
  }

  // Implementación del método abstracto
  @Override
  public String verTipoDeAnimal() {
    return "🐦";
  }

  // Método toString
  @Override
  public String toString() {
    return especie + "\t" + edad + " años\t" + nombre + "\t" + peso + "kg\t" + tipoPlumaje
        + " plumaje";
  }
}