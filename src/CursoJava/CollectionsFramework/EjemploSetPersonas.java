package CursoJava.CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

class Persona {
  String nombre, apellido;
  int dni;

  public Persona(String nombre, String apellido, int dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Persona otra = (Persona) obj;
    return this.dni == otra.dni;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(dni);
  }

  @Override
  public String toString() {
    return "- " + this.nombre + " " + this.apellido + ", DNI: " + this.dni;
  }

}

class EjemploSetPersonas {

  public static void main(String[] args) {

    Set<Persona> personas = new HashSet<>();

    personas.add(new Persona("Juan", "Perez", 12345678));
    personas.add(new Persona("Maria", "Gomez", 87654321));
    personas.add(new Persona("Pedro", "Lopez", 11223344));
    personas.add(new Persona("Carolina", "Diaz", 44332211));

    Persona pedro = new Persona("Pedro", "Lopez", 11223344);
    personas.add(pedro); // Duplicado

    System.out.println("Personas: " + personas.size());

    System.out.println("Listado de Personas:");
    personas.forEach(persona -> System.out
        .println("- " + persona.nombre.toUpperCase() + " " + persona.apellido.toUpperCase() + ", DNI: " + persona.dni));

    System.out.println("Busqueda por Objeto:");
    for (Persona p : personas) {
      if (p.equals(pedro)) {
        System.out.println(p);
      }
    }

    System.out.println("Busqueda por DNI:");
    for (Persona p : personas) {
      if (p.dni == 11223344) {
        System.out.println(p);
      }
    }

  }

}
