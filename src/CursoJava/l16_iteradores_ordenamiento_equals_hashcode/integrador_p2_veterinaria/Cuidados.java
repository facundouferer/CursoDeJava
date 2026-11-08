package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_veterinaria;

/** Cálculo del costo de cuidado de un animal. */
interface Cuidados {

  /**
   * @param costoBase costo base del cuidado
   * @param edadAnimal edad del animal en años
   * @return costo de cuidado, ajustado por la edad y las características del animal
   */
  double calcularCostoCuidado(double costoBase, int edadAnimal);
}
