package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej08_veterinaria;

/** Identidad común ("es un"): nombre y el comportamiento que cada animal debe definir. */
public abstract class Animal {
  private final String nombre;

  protected Animal(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public abstract void tipoDeAnimal();

  public abstract void emitirSonido();
}
