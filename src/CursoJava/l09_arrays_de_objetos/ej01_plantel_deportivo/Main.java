package CursoJava.l09_arrays_de_objetos.ej01_plantel_deportivo;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: cargar un plantel, listarlo, buscar jugadores, eliminar uno y ordenar por goles.
 * Concepto: 4. Recorrer y mostrar, 5. Buscar y 6. Ordenar.
 */
public class Main {

    public static void main(String[] args) {
        Plantel plantel = new Plantel(3);

        plantel.agregar(new Jugador("Juan", 10, 5));
        plantel.agregar(new Jugador("Pedro", 9, 3));
        plantel.agregar(new Jugador("Luis", 8, 2));

        plantel.listar();

        int dorsalABuscar = 9;
        Jugador encontrado = plantel.buscarPorDorsal(dorsalABuscar);
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró un jugador con el dorsal " + dorsalABuscar);
        }

        String nombreABuscar = "Luis";
        encontrado = plantel.buscarPorNombre(nombreABuscar);
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró un jugador con el nombre " + nombreABuscar);
        }

        int dorsalAEliminar = 10;
        if (plantel.eliminarPorDorsal(dorsalAEliminar)) {
            System.out.println("Se eliminó el jugador con dorsal " + dorsalAEliminar);
        } else {
            System.out.println("No se encontró un jugador con el dorsal " + dorsalAEliminar);
        }

        plantel.ordenarPorGolesDescendente();
        plantel.listar();
    }
}
