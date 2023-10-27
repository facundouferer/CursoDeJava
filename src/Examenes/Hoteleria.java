package Examenes;
import java.io.*;
import java.util.*;

// Clase principal que contiene el menú
public class Hoteleria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Método para recuperar el nombre del hotel desde un archivo de texto llamado nombreHotel.txt
        String nombreHotel = "";
        try (Scanner entrada = new Scanner(new File("nombreHotel.txt"))) {
            nombreHotel = entrada.nextLine();
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el nombre del hotel desde el archivo: " + e.getMessage());
        }
        Hotel hotel = new Hotel(nombreHotel);

        // Crear habitaciones de ejemplo
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
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    hotel.verListaHabitaciones();
                    break;
                case 2:
                    // Lógica para reservar una habitación
                    System.out.println("Ingrese el número de habitación que desea reservar: ");
                    int numeroHabitacion = scanner.nextInt();
                    System.out.println("Ingrese la cantidad de huéspedes que se hospedarán en la habitación: ");
                    int cantidadHuespedes = scanner.nextInt();
                    List<Huesped> huespedes = new ArrayList<>();
                    for (int i = 0; i < cantidadHuespedes; i++) {
                        System.out.println("Ingrese el nombre del huésped " + (i + 1) + ": ");
                        String nombreHuesped = scanner.next();
                        System.out.println("Ingrese la nacionalidad del huésped " + (i + 1) + ": ");
                        String nacionalidadHuesped = scanner.next();
                        huespedes.add(new Huesped(nombreHuesped, nacionalidadHuesped));
                    }
                    Habitacion habitacion = null;
                    for (Habitacion h : hotel.getHabitaciones()) {
                        if (h.getNumero() == numeroHabitacion) {
                            habitacion = h;
                            break;
                        }
                    }
                    if (habitacion != null) {
                        habitacion.reservarHabitacion(huespedes);
                        System.out.println("Habitación reservada exitosamente.");
                    } else {
                        System.out.println("No se encontró la habitación con el número ingresado.");
                    }

                    break;
                case 3:
                    // Lógica para cancelar una reserva
                    System.out.println("Ingrese el número de habitación que desea cancelar la reserva: ");
                    numeroHabitacion = scanner.nextInt();
                    habitacion = null;
                    for (Habitacion h : hotel.getHabitaciones()) {
                        if (h.getNumero() == numeroHabitacion) {
                            habitacion = h;
                            break;
                        }
                    }
                    if (habitacion != null) {
                        habitacion.cancelarReserva();
                        System.out.println("Reserva cancelada exitosamente.");
                    } else {
                        System.out.println("No se encontró la habitación con el número ingresado.");
                    }

                    break;
                case 4:
                    hotel.guardarReservasEnArchivo("reservas.dat");
                    break;
                case 5:
                    hotel = Hotel.cargarReservasDesdeArchivo("reservas.dat");
                    if (hotel != null) {
                        System.out.println("Reservas cargadas desde archivo exitosamente.");
                    } else {
                        System.out.println("Error al cargar las reservas desde el archivo.");
                    }
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

// Clase abstracta Persona
abstract class Persona implements Serializable {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarInformacion();
}

// Clase Huéspedes que extiende de Persona e implementa MostrarInformación
class Huesped extends Persona implements MostrarInformacion, Serializable {
    private String nacionalidad;

    public Huesped(String nombre, String nacionalidad) {
        super(nombre);
        this.nacionalidad = nacionalidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}

// Interfaz para MostrarInformación
interface MostrarInformacion {
    void mostrarInformacion();
}

// Clase Habitación que implementa MostrarInformación
class Habitacion implements MostrarInformacion, Serializable {
    private int numero;
    private int cantidadCamas;
    private int capacidadHuespedes;
    private boolean ocupada;
    private List<Huesped> huespedes;

    public Habitacion(int numero, int cantidadCamas, int capacidadHuespedes) {
        this.numero = numero;
        this.cantidadCamas = cantidadCamas;
        this.capacidadHuespedes = capacidadHuespedes;
        this.ocupada = false;
        this.huespedes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void reservarHabitacion(List<Huesped> huespedes) {
        this.ocupada = true;
        this.huespedes.addAll(huespedes);
    }

    public void cancelarReserva() {
        this.ocupada = false;
        this.huespedes.clear();
    }

    public void agregarHuesped(Huesped huesped) {
        this.huespedes.add(huesped);
    }

    public void eliminarHuesped(int indice) {
        if (indice >= 0 && indice < this.huespedes.size()) {
            this.huespedes.remove(indice);
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Número de Habitación: " + numero);
        System.out.println("Cantidad de Camas: " + cantidadCamas);
        System.out.println("Capacidad de Huéspedes: " + capacidadHuespedes);
        System.out.println("Estado: " + (ocupada ? "Ocupada" : "Disponible"));

        if (ocupada) {
            System.out.println("Huéspedes:");
            for (Huesped huesped : huespedes) {
                huesped.mostrarInformacion();
            }
        }
    }
}

// Clase Hotel
class Hotel implements Serializable {
    private String nombreHotel;
    private List<Habitacion> habitaciones;

    public Hotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    // Devuelve el ArrayList de habitaciones
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void verListaHabitaciones() {
        System.out.println("Nombre del Hotel: " + nombreHotel + "\n");
        System.out.println("LISTA DE HABITACIONES: \n");

        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarInformacion();
            System.out.println();
        }
    }

    public void guardarReservasEnArchivo(String nombreArchivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(this);
            System.out.println("Reservas guardadas en archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar las reservas en el archivo: " + e.getMessage());
        }
    }

    public static Hotel cargarReservasDesdeArchivo(String nombreArchivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (Hotel) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar las reservas desde el archivo: " + e.getMessage());
            return null;
        }
    }
}
