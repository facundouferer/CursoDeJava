/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Guardar personas y operar sobre ellas (alta, búsqueda, edición y baja).
 * Concepto: Familia List: List<Persona> declarada con la interfaz, con búsqueda por recorrido.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej04_directorio;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
  private final List<Persona> personas = new ArrayList<>();

  public void agregarPersona(Persona persona) {
    personas.add(persona);
  }

  public List<Persona> getPersonas() {
    return List.copyOf(personas);
  }

  public Persona buscarPorNombre(String nombre) {
    for (Persona persona : personas) {
      if (persona.getNombre().equals(nombre)) {
        return persona;
      }
    }
    return null;
  }

  public Persona buscarPorDni(int dni) {
    for (Persona persona : personas) {
      if (persona.getDni() == dni) {
        return persona;
      }
    }
    return null;
  }

  /** Reemplaza a la persona con ese DNI; devuelve false si no existe. */
  public boolean editarPersona(String nombre, int dni, int telefono) {
    for (int i = 0; i < personas.size(); i++) {
      if (personas.get(i).getDni() == dni) {
        personas.set(i, new Persona(nombre, dni, telefono));
        return true;
      }
    }
    return false;
  }

  public boolean eliminarPorNombre(String nombre) {
    Persona persona = buscarPorNombre(nombre);
    return persona != null && personas.remove(persona);
  }

  public boolean eliminarPorDni(int dni) {
    Persona persona = buscarPorDni(dni);
    return persona != null && personas.remove(persona);
  }
}
