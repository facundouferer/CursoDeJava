package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hoteleria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Integrador – Examen final: Hotelería (Lección 19 – Archivos, persistencia y empaquetado JAR)
 *
 * Enunciado: Sistema de reservas de un hotel. El nombre del hotel se lee de un archivo de texto
 * (nombreHotel.txt); desde un menú se listan las habitaciones, se reservan con sus huéspedes, se
 * cancelan las reservas y el estado del hotel se guarda y se carga desde un archivo (reservas.dat).
 *
 * Concepto: lectura de texto con Scanner/File, serialización de objetos con try-with-resources,
 * herencia (Persona/Huesped), interfaz (MostrarInformacion) y colecciones de objetos.
 */
public class Hoteleria {
    private static final String ARCHIVO_NOMBRE = "nombreHotel.txt";
    private static final String ARCHIVO_RESERVAS = "reservas.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(leerNombreHotel());
        hotel.agregarHabitacion(new Habitacion(101, 2, 2));
        hotel.agregarHabitacion(new Habitacion(102, 1, 1));
        hotel.agregarHabitacion(new Habitacion(103, 3, 4));

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ver la lista de habitaciones.");
            System.out.println("2. Reservar una habitación.");
            System.out.println("3. Cancelar una reserva.");
            System.out.println("4. Guardar reservas en un archivo.");
            System.out.println("5. Cargar reservas desde un archivo.");
            System.out.println("6. Salir.");
            opcion = leerEntero(scanner, "Elija una opción: ");

            switch (opcion) {
                case 1 -> hotel.verListaHabitaciones();
                case 2 -> reservar(scanner, hotel);
                case 3 -> cancelar(scanner, hotel);
                case 4 -> hotel.guardarReservas(ARCHIVO_RESERVAS);
                case 5 -> {
                    Hotel cargado = Hotel.cargarReservas(ARCHIVO_RESERVAS);
                    if (cargado != null) {
                        hotel = cargado;
                        System.out.println("Reservas cargadas desde el archivo correctamente.");
                    } else {
                        System.out.println("No se pudieron cargar las reservas desde el archivo.");
                    }
                }
                case 6 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 6);
    }

    private static String leerNombreHotel() {
        try (Scanner entrada = new Scanner(new File(ARCHIVO_NOMBRE))) {
            return entrada.nextLine();
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el nombre del hotel desde el archivo: " + e.getMessage());
            return "Hotel";
        }
    }

    private static void reservar(Scanner scanner, Hotel hotel) {
        int numero = leerEntero(scanner, "Ingrese el número de habitación que desea reservar: ");
        int cantidad = leerEntero(scanner, "Ingrese la cantidad de huéspedes que se hospedarán en la habitación: ");
        List<Huesped> huespedes = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el nombre del huésped " + i + ": ");
            String nombre = scanner.nextLine().trim();
            System.out.print("Ingrese la nacionalidad del huésped " + i + ": ");
            String nacionalidad = scanner.nextLine().trim();
            huespedes.add(new Huesped(nombre, nacionalidad));
        }
        Optional<Habitacion> habitacion = hotel.buscarHabitacion(numero);
        if (habitacion.isPresent()) {
            habitacion.get().reservar(huespedes);
            System.out.println("Habitación reservada correctamente.");
        } else {
            System.out.println("No se encontró la habitación con el número ingresado.");
        }
    }

    private static void cancelar(Scanner scanner, Hotel hotel) {
        int numero = leerEntero(scanner, "Ingrese el número de habitación cuya reserva desea cancelar: ");
        Optional<Habitacion> habitacion = hotel.buscarHabitacion(numero);
        if (habitacion.isPresent()) {
            habitacion.get().cancelarReserva();
            System.out.println("Reserva cancelada correctamente.");
        } else {
            System.out.println("No se encontró la habitación con el número ingresado.");
        }
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = scanner.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero.");
            }
        }
    }
}
