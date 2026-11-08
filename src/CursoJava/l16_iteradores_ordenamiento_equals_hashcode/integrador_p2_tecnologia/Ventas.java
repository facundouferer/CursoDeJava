package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_tecnologia;

/** Cálculo del precio de venta de una computadora usada. */
interface Ventas {

  /**
   * @param precioBase precio de una computadora nueva
   * @param anioActual año en el que se realiza la venta
   * @return precio de venta, descontada la depreciación por años de uso
   */
  double calcularPrecioVenta(double precioBase, int anioActual);
}
