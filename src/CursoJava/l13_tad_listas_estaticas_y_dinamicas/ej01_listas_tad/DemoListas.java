package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: usar cada tipo de lista con enteros y mostrar su contenido.
 * Concepto: §6 La tabla que decide (misma idea, cuatro implementaciones con costos distintos).
 */
public class DemoListas {

  public static void main(String[] args) {
    ListaEstatica estatica = new ListaEstatica(5);
    estatica.agregar(10);
    estatica.agregar(20);
    estatica.agregar(30);
    System.out.print("Estática: ");
    estatica.mostrar();

    ListaEnlazadaSimple<Integer> simple = new ListaEnlazadaSimple<>();
    simple.agregarAlFinal(10);
    simple.agregarAlFinal(20);
    simple.agregarAlFinal(30);
    simple.agregarAlInicio(5);
    simple.eliminar(20);
    if (simple.contiene(30)) {
      System.out.println("La lista enlazada simple contiene 30");
    } else {
      System.out.println("La lista enlazada simple no contiene 30");
    }
    System.out.print("Enlazada simple: ");
    simple.mostrar();

    ListaDoblementeEnlazada<Integer> doble = new ListaDoblementeEnlazada<>();
    doble.agregarAlFinal(10);
    doble.agregarAlFinal(20);
    doble.agregarAlFinal(30);
    System.out.print("Doble hacia adelante: ");
    doble.mostrarAdelante();
    System.out.print("Doble hacia atrás: ");
    doble.mostrarAtras();

    ListaCircular<Integer> circular = new ListaCircular<>();
    circular.agregarAlFinal(10);
    circular.agregarAlFinal(20);
    circular.agregarAlFinal(30);
    circular.agregarAlInicio(5);
    System.out.print("Circular: ");
    circular.mostrar();
  }
}
