package CursoJava.l09_arrays_de_objetos.ej01_plantel_deportivo;

import java.util.Arrays;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: administrar un array de jugadores con capacidad y cantidad separadas.
 * Concepto: 8. Capacidad contra cantidad: el array parcialmente lleno.
 */
class Plantel {

    private static final int CAPACIDAD_POR_DEFECTO = 5;

    private Jugador[] jugadores;
    private int cantidad;

    public Plantel(int capacidadInicial) {
        if (capacidadInicial <= 0) {
            this.jugadores = new Jugador[CAPACIDAD_POR_DEFECTO];
            System.out.println("El plantel se inicializó con capacidad para " + CAPACIDAD_POR_DEFECTO + " jugadores.");
        } else {
            this.jugadores = new Jugador[capacidadInicial];
        }
        this.cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCapacidad() {
        return jugadores.length;
    }

    public boolean agregar(Jugador nuevoJugador) {
        if (nuevoJugador == null) {
            System.out.println("Jugador no válido.");
            return false;
        }
        if (cantidad == jugadores.length) {
            jugadores = Arrays.copyOf(jugadores, jugadores.length * 2);
        }
        jugadores[cantidad] = nuevoJugador;
        cantidad++;
        return true;
    }

    public Jugador buscarPorDorsal(int dorsal) {
        for (int i = 0; i < cantidad; i++) {
            if (jugadores[i].getDorsal() == dorsal) {
                return jugadores[i];
            }
        }
        return null;
    }

    public Jugador buscarPorNombre(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (jugadores[i].getNombre().equals(nombre)) {
                return jugadores[i];
            }
        }
        return null;
    }

    public boolean eliminarPorDorsal(int dorsal) {
        for (int i = 0; i < cantidad; i++) {
            if (jugadores[i].getDorsal() == dorsal) {
                for (int j = i; j < cantidad - 1; j++) {
                    jugadores[j] = jugadores[j + 1];
                }
                jugadores[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    public void ordenarPorGolesDescendente() {
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - 1 - i; j++) {
                if (jugadores[j].getGoles() < jugadores[j + 1].getGoles()) {
                    Jugador auxiliar = jugadores[j];
                    jugadores[j] = jugadores[j + 1];
                    jugadores[j + 1] = auxiliar;
                }
            }
        }
    }

    public void listar() {
        System.out.println("Listado de jugadores:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(jugadores[i]);
        }
    }
}
