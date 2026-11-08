package CursoJava.l09_arrays_de_objetos.ej01_plantel_deportivo;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: representar a un jugador del plantel con datos validados al construirlo.
 */
class Jugador {

    private final String nombre;
    private final int dorsal;
    private final int goles;

    public Jugador(String nombre, int dorsal, int goles) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "Sin nombre";
            System.out.println("El jugador quedó sin nombre.");
        } else {
            this.nombre = nombre;
        }
        if (dorsal <= 0) {
            this.dorsal = 99;
            System.out.println("Se asignó el dorsal 99.");
        } else {
            this.dorsal = dorsal;
        }
        this.goles = Math.max(goles, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getGoles() {
        return goles;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Dorsal: " + dorsal + " - Goles: " + goles;
    }
}
