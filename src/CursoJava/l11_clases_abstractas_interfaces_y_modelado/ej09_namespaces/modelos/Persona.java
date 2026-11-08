package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej09_namespaces.modelos;

// Sin modificador: package-private. Solo las clases del paquete "modelos" la ven por su nombre.
class Persona {
  private final String nombre;
  private final int dni;

  public Persona(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public int getDni() {
    return dni;
  }
}
