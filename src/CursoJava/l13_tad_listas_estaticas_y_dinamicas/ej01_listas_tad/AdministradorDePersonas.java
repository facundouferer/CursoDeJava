package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: administrar una lista de personas, buscando y eliminando por DNI.
 * Concepto: §8 Ejercicio práctico guiado (eliminar en la lista enlazada simple con equals).
 */
public class AdministradorDePersonas {

  public static void main(String[] args) {
    ListaEnlazadaSimple<Persona> personas = new ListaEnlazadaSimple<>();

    personas.agregarAlFinal(new Persona("Ana", 28, 12345678));
    personas.agregarAlFinal(new Persona("Luis", 34, 87654321));
    personas.agregarAlFinal(new Persona("Marta", 22, 11223344));

    System.out.println("Lista de personas:");
    personas.mostrar();

    // Otra instancia con el mismo DNI: equals las considera la misma persona.
    Persona luis = new Persona("Luis", 34, 87654321);

    if (personas.contiene(luis)) {
      System.out.println("Luis está en la lista.");
    } else {
      System.out.println("Luis no está en la lista.");
    }

    System.out.println("Eliminando a Luis...");
    personas.eliminar(luis);
    System.out.println("Lista actualizada de personas:");
    personas.mostrar();
  }
}
