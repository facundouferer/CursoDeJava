package CursoJava.l09_arrays_de_objetos.integrador_proy_agenda;

/** Contacto de la agenda con nombre, DNI y teléfono. */
public class Persona {

  private static final String PREFIJO_TELEFONO = "+549";

  private final String nombre;
  private final int dni;
  private final String telefono;

  public Persona(String nombre, int dni, String telefono) {
    this.nombre = nombre;
    this.dni = dni;
    this.telefono = telefono;
  }

  public String getNombre() {
    return nombre;
  }

  public int getDni() {
    return dni;
  }

  public String getTelefono() {
    return telefono;
  }

  @Override
  public String toString() {
    return nombre + " (" + dni + ") - Teléfono: " + PREFIJO_TELEFONO + telefono;
  }
}
