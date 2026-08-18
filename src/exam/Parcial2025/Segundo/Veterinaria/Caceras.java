package exam.Parcial2025.Segundo.Veterinaria;

class Caceras extends Animalito implements Cuidados {

  // Constructor con parámetros
  public Caceras(String especie, int edad, String nombre, double peso) {
    super(especie, edad, nombre, peso);
  }

  // Implementación de la interface Cuidados
  @Override
  public double calcularCostoCuidado(double costoBase, int edadAnimal) {
    // Calcular incremento por años (animales cazadores envejecen más rápido)
    double incrementoEdad = this.edad * 0.08; // 8% por año para cazadores

    // Los animales cazadores tienen un descuento por ser más independientes
    double descuentoCazador = 0.15; // 15% de descuento

    // Calcular costo final
    double costoConEdad = costoBase * (1 + incrementoEdad);
    return costoConEdad * (1 - descuentoCazador);
  }

  // Implementación del método abstracto
  @Override
  public String verTipoDeAnimal() {
    return "🐱";
  }

  // Método toString
  @Override
  public String toString() {
    return especie + "\t" + edad + " años\t" + nombre + "\t" + peso + "kg";
  }
}