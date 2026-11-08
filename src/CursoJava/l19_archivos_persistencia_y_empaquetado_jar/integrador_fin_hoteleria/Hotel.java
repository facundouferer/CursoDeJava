package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hoteleria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hotel implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String nombre;
    private final List<Habitacion> habitaciones = new ArrayList<>();

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Optional<Habitacion> buscarHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                return Optional.of(habitacion);
            }
        }
        return Optional.empty();
    }

    public void verListaHabitaciones() {
        System.out.println("Nombre del hotel: " + nombre + "\n");
        System.out.println("LISTA DE HABITACIONES:\n");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarInformacion();
            System.out.println();
        }
    }

    public void guardarReservas(String archivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(this);
            System.out.println("Reservas guardadas en el archivo correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar las reservas en el archivo: " + e.getMessage());
        }
    }

    public static Hotel cargarReservas(String archivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Hotel) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar las reservas desde el archivo: " + e.getMessage());
            return null;
        }
    }
}
