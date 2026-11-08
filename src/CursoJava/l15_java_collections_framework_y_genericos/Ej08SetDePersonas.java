/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Registrar personas en un conjunto sin que se repita ninguna según su DNI.
 * Concepto: Familia Set: HashSet con objetos propios que implementan equals y hashCode.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.HashSet;
import java.util.Set;

public class Ej08SetDePersonas {

  private static final class Persona {
    private final String nombre;
    private final String apellido;
    private final int dni;

    Persona(String nombre, String apellido, int dni) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.dni = dni;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      return dni == ((Persona) obj).dni;
    }

    @Override
    public int hashCode() {
      return Integer.hashCode(dni);
    }

    @Override
    public String toString() {
      return "- " + nombre + " " + apellido + ", DNI: " + dni;
    }
  }

  public static void main(String[] args) {
    Set<Persona> personas = new HashSet<>();

    personas.add(new Persona("Juan", "Pérez", 12345678));
    personas.add(new Persona("María", "Gómez", 87654321));
    personas.add(new Persona("Pedro", "López", 11223344));
    personas.add(new Persona("Carolina", "Díaz", 44332211));

    Persona pedro = new Persona("Pedro", "López", 11223344);
    boolean agregada = personas.add(pedro); // mismo DNI: el Set la rechaza
    System.out.println("¿Se agregó la persona repetida? " + agregada);

    System.out.println("Cantidad de personas: " + personas.size());

    System.out.println("Listado de personas:");
    personas.forEach(persona -> System.out.println(
        "- " + persona.nombre.toUpperCase() + " " + persona.apellido.toUpperCase() + ", DNI: " + persona.dni));

    System.out.println("Búsqueda por objeto:");
    if (personas.contains(pedro)) {
      personas.stream().filter(pedro::equals).forEach(System.out::println);
    }

    System.out.println("Búsqueda por DNI:");
    personas.stream().filter(persona -> persona.dni == 11223344).forEach(System.out::println);
  }
}
