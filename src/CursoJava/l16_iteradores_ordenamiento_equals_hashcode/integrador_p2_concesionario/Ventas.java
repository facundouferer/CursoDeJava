package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_concesionario;

/** Cálculo del precio de venta de un vehículo usado. */
interface Ventas {

  /**
   * @param precioBase precio de un vehículo nuevo
   * @param anioActual año en el que se realiza la venta
   * @return precio de venta, descontada la depreciación por años de uso
   */
  double calcularPrecioVenta(double precioBase, int anioActual);
}
