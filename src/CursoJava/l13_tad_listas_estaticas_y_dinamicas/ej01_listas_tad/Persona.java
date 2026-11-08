package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: modelar una persona que se guarda en las listas; dos personas son iguales si tienen el mismo DNI.
 * Concepto: §4 Lista enlazada simple (eliminar y contiene dependen de equals).
 */
public class Persona {

  private final String nombre;
  private final int edad;
  private final int dni;

  public Persona(String nombre, int edad, int dni) {
    this.nombre = nombre;
    this.edad = edad;
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
    Persona otra = (Persona) obj;
    return dni == otra.dni;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(dni);
  }

  @Override
  public String toString() {
    return nombre + " (" + edad + " años)";
  }
}
