package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hospital;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SistemaHospital {
    private static final String ARCHIVO_PACIENTES = "pacientes.txt";
    private static final Path ARCHIVO_BIENVENIDA = Path.of("archivo.txt");

    private final List<Doctor> doctores = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private final Scanner scanner;

    public SistemaHospital(Scanner scanner) {
        this.scanner = scanner;
        doctores.add(new Doctor("Dr. Juan", "12345678", "01/01/1970", "Cardiología"));
        doctores.add(new Doctor("Dra. María", "87654321", "02/02/1980", "Pediatría"));
        pacientes.add(new Paciente("Paciente 1", "31159753", "01/01/1990", "123456789", "A+"));
    }

    public void iniciar() {
        mostrarBienvenida();
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Listar doctores");
            System.out.println("2. Registrar un nuevo paciente");
            System.out.println("3. Actualizar información personal de un paciente");
            System.out.println("4. Consultar el historial médico de un paciente");
            System.out.println("5. Nuevo historial para un paciente");
            System.out.println("6. Guardar pacientes en un archivo");
            System.out.println("7. Cargar pacientes desde un archivo");
            System.out.println("8. Salir");
            opcion = leerEntero("Elija una opción: ");

            switch (opcion) {
                case 1 -> listarDoctores();
                case 2 -> registrarNuevoPaciente();
                case 3 -> actualizarInformacionPaciente();
                case 4 -> consultarHistorialMedico();
                case 5 -> cargarNuevoHistorial();
                case 6 -> guardarPacientesEnArchivo();
                case 7 -> cargarPacientesDesdeArchivo();
                case 8 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 8);
    }

    private void mostrarBienvenida() {
        if (!Files.exists(ARCHIVO_BIENVENIDA)) {
            return;
        }
        try {
            System.out.println(Files.readString(ARCHIVO_BIENVENIDA));
        } catch (IOException e) {
            System.err.println("No se pudo leer " + ARCHIVO_BIENVENIDA + ": " + e.getMessage());
        }
    }

    private void listarDoctores() {
        for (Doctor doctor : doctores) {
            System.out.println("Nombre: " + doctor.getNombre());
            System.out.println("DNI: " + doctor.getDni());
            System.out.println("Fecha de nacimiento: " + doctor.getFechaNacimiento());
            System.out.println("Especialidad: " + doctor.getEspecialidad());
            System.out.println();
        }
    }

    private void registrarNuevoPaciente() {
        String nombre = leerTexto("Nombre: ");
        String dni = leerTexto("DNI: ");
        if (buscarPaciente(dni).isPresent()) {
            System.out.println("Ya existe un paciente con ese DNI.");
            return;
        }
        String fecha = leerTexto("Fecha de nacimiento (dd/mm/aaaa): ");
        String telefono = leerTexto("Teléfono: ");
        String sangre = leerTexto("Tipo de sangre: ");
        pacientes.add(new Paciente(nombre, dni, fecha, telefono, sangre));
        System.out.println("Paciente registrado correctamente.");
    }

    private void actualizarInformacionPaciente() {
        Optional<Paciente> paciente = pedirPaciente();
        if (paciente.isEmpty()) {
            return;
        }
        paciente.get().setNombre(leerTexto("Nuevo nombre: "));
        paciente.get().setFechaNacimiento(leerTexto("Nueva fecha de nacimiento (dd/mm/aaaa): "));
        paciente.get().setNumeroTelefono(leerTexto("Nuevo teléfono: "));
        System.out.println("Información actualizada correctamente.");
    }

    private void consultarHistorialMedico() {
        Optional<Paciente> paciente = pedirPaciente();
        if (paciente.isPresent()) {
            System.out.println("Historial médico de " + paciente.get().getNombre() + ":");
            paciente.get().verHistorialDeEventos();
        }
    }

    private void cargarNuevoHistorial() {
        Optional<Paciente> paciente = pedirPaciente();
        if (paciente.isPresent()) {
            paciente.get().agregarEvento(leerTexto("Descripción del evento: "));
            System.out.println("Evento agregado al historial.");
        }
    }

    private void guardarPacientesEnArchivo() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ARCHIVO_PACIENTES))) {
            salida.writeObject(pacientes);
            System.out.println("Pacientes guardados en el archivo " + ARCHIVO_PACIENTES + ".");
        } catch (IOException e) {
            System.err.println("Error al guardar pacientes en el archivo: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void cargarPacientesDesdeArchivo() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ARCHIVO_PACIENTES))) {
            pacientes = (List<Paciente>) entrada.readObject();
            System.out.println("Pacientes cargados desde el archivo " + ARCHIVO_PACIENTES + ".");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar pacientes desde el archivo: " + e.getMessage());
        }
    }

    private Optional<Paciente> pedirPaciente() {
        Optional<Paciente> paciente = buscarPaciente(leerTexto("DNI del paciente: "));
        if (paciente.isEmpty()) {
            System.out.println("No se encontró un paciente con ese DNI.");
        }
        return paciente;
    }

    private Optional<Paciente> buscarPaciente(String dni) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDni().equals(dni)) {
                return Optional.of(paciente);
            }
        }
        return Optional.empty();
    }

    private String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    private int leerEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(leerTexto(mensaje));
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero.");
            }
        }
    }
}
