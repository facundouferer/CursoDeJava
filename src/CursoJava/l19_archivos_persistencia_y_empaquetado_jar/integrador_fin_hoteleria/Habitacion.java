package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hoteleria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Habitacion implements MostrarInformacion, Serializable {
    private static final long serialVersionUID = 1L;

    private final int numero;
    private final int cantidadCamas;
    private final int capacidadHuespedes;
    private boolean ocupada;
    private final List<Huesped> huespedes = new ArrayList<>();

    public Habitacion(int numero, int cantidadCamas, int capacidadHuespedes) {
        this.numero = numero;
        this.cantidadCamas = cantidadCamas;
        this.capacidadHuespedes = capacidadHuespedes;
    }

    public int getNumero() {
        return numero;
    }

    public void reservar(List<Huesped> nuevosHuespedes) {
        ocupada = true;
        huespedes.addAll(nuevosHuespedes);
    }

    public void cancelarReserva() {
        ocupada = false;
        huespedes.clear();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Número de habitación: " + numero);
        System.out.println("Cantidad de camas: " + cantidadCamas);
        System.out.println("Capacidad de huéspedes: " + capacidadHuespedes);
        System.out.println("Estado: " + (ocupada ? "Ocupada" : "Disponible"));
        if (ocupada) {
            System.out.println("Huéspedes:");
            for (Huesped huesped : huespedes) {
                huesped.mostrarInformacion();
            }
        }
    }
}
