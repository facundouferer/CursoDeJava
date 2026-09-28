package CursoJava.ArraydeObjetos.PlantelDeportivo;

class MainPlantel {

    public static void main(String[] args) {

        Jugador[] listaDeJugadores = new Jugador[3];

        listaDeJugadores[0] = new Jugador("Juan", 10, 5);
        listaDeJugadores[1] = new Jugador("Pedro", 9, 3);
        listaDeJugadores[2] = new Jugador("Luis", 8, 2);

        Plantel plantel = new Plantel(3);  

        plantel.agregar(listaDeJugadores[0]);
        plantel.agregar(listaDeJugadores[1]);
        plantel.agregar(listaDeJugadores[2]);

        plantel.listar();

        int dorsalABuscar = 9;
        Jugador jugadorEncontrado = plantel.buscarPorDorsal(dorsalABuscar);
        if (jugadorEncontrado != null) {
            System.out.println(jugadorEncontrado.getNombre() + "-" + jugadorEncontrado.getDorsal() + "- Goles: " + jugadorEncontrado.getGoles());
        } else {
            System.out.println("No se encontró un jugador con el dorsal " + dorsalABuscar);
        }
        
        String nombreABuscar = "Luis";
        jugadorEncontrado = plantel.buscarPorNombre(nombreABuscar);
        if (jugadorEncontrado != null) {
            System.out.println(jugadorEncontrado.getNombre() + "-" + jugadorEncontrado.getDorsal() + "- Goles: " + jugadorEncontrado.getGoles());
        } else {
            System.out.println("No se encontró un jugador con el nombre " + nombreABuscar);
        }

        int dorsalAEliminar = 10;
        boolean eliminado = plantel.eliminarPorDorsal(dorsalAEliminar);
        if (eliminado) {
            System.out.println("Se eliminó el jugador con dorsal " + dorsalAEliminar);
        } else {
            System.out.println("No se encontró un jugador con el dorsal " + dorsalAEliminar);
        }
    }

}
