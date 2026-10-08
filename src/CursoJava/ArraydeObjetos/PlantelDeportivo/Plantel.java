package CursoJava.ArraydeObjetos.PlantelDeportivo;

import java.util.Arrays;

class Plantel {

    private Jugador[] jugadores;
    private int cantidad;

    public Plantel(int capacidadInicial) {
        if (capacidadInicial <= 0) {
            this.jugadores = new Jugador[5];
            System.out.println("El plantel se inicializó con 5 jugadores");
        } else {
            this.jugadores = new Jugador[capacidadInicial];
        }
        this.cantidad = 0;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public int getCapacidad() {
        return this.jugadores.length;
    }

    boolean sumarJugador(Jugador nuevoJugador) {
        this.jugadores[this.cantidad] = nuevoJugador;
        this.cantidad++;
        return true;
    }

    public boolean agregar(Jugador nuevoJugador) {
        if (nuevoJugador != null) {
            if (this.cantidad < this.jugadores.length) {
                return this.sumarJugador(nuevoJugador);
            } else {
                Arrays.copyOf(this.jugadores, this.jugadores.length * 2);
                return this.sumarJugador(nuevoJugador);
            }
        } else {
            System.out.println("Jugador no valido");
            return false;
        }
    }

    public Jugador buscarPorDorsal(int dorsal) {
        for (int i = 0; i < this.cantidad; i++) {
            if (this.jugadores[i].getDorsal() == dorsal) {
                return this.jugadores[i];
            }
        }
        return null;
    }

    public Jugador buscarPorNombre(String nombre) {
        for (int i = 0; i < this.cantidad; i++) {
            if (this.jugadores[i].getNombre().equals(nombre)) {
                return this.jugadores[i];
            }
        }
        return null;
    }

    public boolean eliminarPorDorsal(int dorsal) {
        for (int i = 0; i < this.cantidad; i++) {
            if (this.jugadores[i].getDorsal() == dorsal) {
                for (int j = i; j < this.cantidad - 1; j++) {
                    this.jugadores[j] = this.jugadores[j + 1];
                }
                this.jugadores[this.cantidad - 1] = null;
                this.cantidad--;
                return true;
            }
        }
        return false;
    }

    public void ordenarPorGolesDescendente() {
        for (int i = 0; i < this.cantidad - 1; i++) {
            for (int j = 0; j < this.cantidad - 1 - i; j++) {
                if (this.jugadores[j].getGoles() < this.jugadores[j + 1].getGoles()) {
                    Jugador temp = this.jugadores[j];
                    this.jugadores[j] = this.jugadores[j + 1];
                    this.jugadores[j + 1] = temp;
                }
            }
        }
    }

    public void listar() {
        System.out.println("Listado de jugadores:");
        for (int i = 0; i < this.cantidad; i++) {
            Jugador jugador = this.jugadores[i];
            System.out.println(jugador.getNombre() + jugador.getDorsalString()
                    + jugador.getGolesString());
        }
    }

}
