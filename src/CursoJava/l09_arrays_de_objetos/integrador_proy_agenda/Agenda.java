package CursoJava.l09_arrays_de_objetos.integrador_proy_agenda;

/** Agenda de contactos en un array de objetos que se redimensiona al agregar y eliminar. */
public class Agenda {

  private Persona[] personas = new Persona[0];

  public void listarPersonas() {
    System.out.println("Listado de personas");
    for (int i = 0; i < personas.length; i++) {
      System.out.println((i + 1) + ") " + personas[i]);
    }
  }

  public void agregarPersona(Persona persona) {
    Persona[] nueva = new Persona[personas.length + 1];
    System.arraycopy(personas, 0, nueva, 0, personas.length);
    nueva[personas.length] = persona;
    personas = nueva;
  }

  /** Elimina la primera persona con ese nombre exacto; devuelve false si no existe. */
  public boolean eliminarPersona(String nombre) {
    for (int i = 0; i < personas.length; i++) {
      if (personas[i].getNombre().equals(nombre)) {
        Persona[] nueva = new Persona[personas.length - 1];
        System.arraycopy(personas, 0, nueva, 0, i);
        System.arraycopy(personas, i + 1, nueva, i, nueva.length - i);
        personas = nueva;
        return true;
      }
    }
    return false;
  }

  /** Cambia nombre y DNI de la persona en la posición (desde 1) y conserva su teléfono. */
  public void editarPersona(int posicion, String nuevoNombre, int nuevoDni) {
    if (posicion < 1 || posicion > personas.length) {
      System.out.println("Índice de persona inválido.");
      return;
    }
    String telefono = personas[posicion - 1].getTelefono();
    personas[posicion - 1] = new Persona(nuevoNombre, nuevoDni, telefono);
  }

  /** Muestra las personas cuyo nombre contiene el texto, sin distinguir mayúsculas. */
  public void buscarPersona(String texto) {
    boolean encontrada = false;
    for (Persona persona : personas) {
      if (persona.getNombre().toLowerCase().contains(texto.toLowerCase())) {
        System.out.println(persona);
        encontrada = true;
      }
    }
    if (!encontrada) {
      System.out.println("No se encontró ninguna persona con el nombre: " + texto);
    }
  }

  public boolean existeDni(int dni) {
    for (Persona persona : personas) {
      if (persona.getDni() == dni) {
        return true;
      }
    }
    return false;
  }
}
