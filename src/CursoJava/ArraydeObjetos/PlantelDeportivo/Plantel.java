package CursoJava.ArraydeObjetos.PlantelDeportivo;

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

    public boolean agregar(Jugador nuevoJugador) {
        if (nuevoJugador != null) {
            if (this.cantidad < this.jugadores.length) {
                this.jugadores[this.cantidad] = nuevoJugador;
                this.cantidad++;
                return true;
            } else {
                System.out.println("No hay lugar para agregar un nuevo jugador");
                return false;
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
        Jugador[] jugadoresUnMenos = new Jugador[this.cantidad - 1]; 
        boolean encontrado = false;
        for (int i = 0; i < this.cantidad; i++) {
           
            if (this.jugadores[i].getDorsal() != dorsal) {
                jugadoresUnMenos[i] = this.jugadores[i];
            }else{
                this.jugadores = jugadoresUnMenos;
                this.cantidad--;
                encontrado = true;
            }
        }
        if(encontrado){
            this.jugadores = jugadoresUnMenos;
            return true;
        }
        return false;
    }

}
