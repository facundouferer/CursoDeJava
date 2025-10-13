package CursoJava.ExpresionesLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Personas {
  private String nombre;
  private int anio;

  public Personas(String nombre, int anio) {
    this.nombre = nombre;
    this.anio = anio;
  }

  public String getNombre() {
    return nombre;
  }

  public int getAnio() {
    return anio;
  }

  @Override
  public String toString() {
    return "- " + nombre + " (" + anio + ")";
  }

}

class GestionPersonas {
  public static void main(String[] args) {

    List<Personas> personas = Arrays.asList(
        new Personas("Ana", 2010),
        new Personas("Carlos", 2000),
        new Personas("María", 1995),
        new Personas("Pedro", 2008),
        new Personas("Laura", 1990),
        new Personas("Juan", 2005),
        new Personas("Sofia", 2012));

    System.out.println("=== PERSONAS ===");
    personas.forEach(System.out::println);

    List<Personas> personasMayores = personas.stream()
        .filter(persona -> (2025 - persona.getAnio() >= 18))
        .collect(Collectors.toList());

    System.out.println("\n=== MAYORES DE 18 AÑOS ===");
    personasMayores.forEach(System.out::println);

    System.out.println("\nTotal de personas mayores de edad: " + personasMayores.size());

  }
}
