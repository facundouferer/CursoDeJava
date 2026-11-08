/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Modelar un empleado identificado por su ID.
 * Concepto: Cuál elegir: equals, hashCode y compareTo por ID para que funcione en List, Set y TreeSet.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej10_empleados;

public class Empleado implements Comparable<Empleado> {
  private String nombre;
  private final int id;
  private String departamento;

  public Empleado(String nombre, int id, String departamento) {
    this.nombre = nombre;
    this.id = id;
    this.departamento = departamento;
  }

  public String getNombre() {
    return nombre;
  }

  public int getId() {
    return id;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  @Override
  public int compareTo(Empleado otro) {
    return Integer.compare(id, otro.id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    return id == ((Empleado) obj).id;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(id);
  }

  @Override
  public String toString() {
    return "Empleado{nombre='" + nombre + "', id=" + id + ", departamento='" + departamento + "'}";
  }
}
