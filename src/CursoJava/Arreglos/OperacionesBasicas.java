package CursoJava.Arreglos;

import java.util.ArrayList;

class Persona {
  private String nombre;
  private int dni;
  private int tel;

  public Persona(String nombre, int dni, int tel) {
    this.nombre = nombre;
    this.dni = dni;
    this.tel = tel;
  }

  public int getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Edad: " + dni + ", Teléfono: " + tel;
  }

}

class Directorio {

  ArrayList<Persona> personas;

  public Directorio() {
    personas = new ArrayList<>();
  }

  public void agregarPersona(Persona persona) {
    personas.add(persona);
  }

  public void listarPersonas() {
    System.out.println("Listado de personas");
    for (Persona persona : personas) {
      System.out.println(persona);
    }
  }

  public Persona buscarPorNombre(String nombre) {
    Persona personaEncontrada = null;
    for (Persona persona : personas) {
      if (persona.getNombre().equals(nombre)) {
        personaEncontrada = persona;
        break;
      }
    }
    return personaEncontrada;
  }

  public Persona buscarPorDni(int dni) {
    Persona personaEncontrada = null;
    for (Persona persona : personas) {
      if (persona.getDni() == dni) {
        personaEncontrada = persona;
        break;
      }
    }
    return personaEncontrada;
  }

  public void editarPersona(String nombre, int dni, int tel) {
    for (Persona persona : personas) {
      if (persona.getDni() == dni) {
        Persona personaAEditar = new Persona(nombre, dni, tel);
        personas.set(personas.indexOf(persona), personaAEditar);
        break;
      }
    }
  }

  public void eliminarPorNombre(String nombre) {
    Persona personaAEliminar = this.buscarPorNombre(nombre);

    if (personaAEliminar != null) {
      personas.remove(personaAEliminar);
    }
  }

  public void eliminarPorDni(int dni) {
    Persona personaAEliminar = this.buscarPorDni(dni);

    if (personaAEliminar != null) {
      personas.remove(personaAEliminar);
    }
  }

}

public class OperacionesBasicas {
  public static void main(String[] args) {

    Directorio directorio = new Directorio();

    Persona persona1 = new Persona("Juan", 12345678, 12345678);
    Persona persona2 = new Persona("Pedro", 87654321, 87654321);
    Persona persona3 = new Persona("Maria", 12348765, 12348765);

    directorio.agregarPersona(persona1);
    directorio.agregarPersona(persona2);
    directorio.agregarPersona(persona3);

    directorio.listarPersonas();

    Persona personaEncontrada = directorio.buscarPorDni(12348765);
    System.out.println("Persona Encontrada" + personaEncontrada);

    directorio.buscarPorNombre("Juan");
    System.out.println("Persona Encontrada" + personaEncontrada);

    directorio.eliminarPorNombre("Pedro");
    directorio.listarPersonas();
  }
}
