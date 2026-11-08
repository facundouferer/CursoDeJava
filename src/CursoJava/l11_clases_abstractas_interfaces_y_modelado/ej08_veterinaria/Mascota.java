package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej08_veterinaria;

/** Capacidad ("es capaz de"): cualquier animal puede firmarla. */
public interface Mascota {
  void jugar();

  default void saludar() {
    System.out.println("Hola, soy tu mascota!");
  }

  default void despedirse() {
    System.out.println("Adiós, hasta luego!");
  }
}
