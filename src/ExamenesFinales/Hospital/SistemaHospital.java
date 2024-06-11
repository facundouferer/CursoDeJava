package ExamenesFinales.Hospital;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaHospital {
    private List<Doctor> doctores = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {
        SistemaHospital sistema = new SistemaHospital();
        sistema.cargarDoctores();
        sistema.cargarPacientes();
        sistema.mostrarMenu();
    }

    private void cargarDoctores() {
        // Cargar los doctores desde un archivo o definirlos directamente en el c�digo.
        // Ejemplo:
        Doctor doctor1 = new Doctor("Dr. Juan", "12345678", "01/01/1970", "Cardiolog�a");
        Doctor doctor2 = new Doctor("Dra. Mar�a", "87654321", "02/02/1980", "Pediatr�a");
        doctores.add(doctor1);
        doctores.add(doctor2);
    }

    private void cargarPacientes() {
        // Cargar los pacientes desde un archivo o definirlos directamente en el c�digo.
        // Ejemplo:
        Paciente paciente1 = new Paciente("Paciente 1", "31159753", "01/01/1990", 123456789, 1);
        pacientes.add(paciente1);
    }

    private void mostrarMenu() {
        while (true) {
            LeerFichero accesoExternos = new LeerFichero();
            System.out.println(accesoExternos.leeDatos());
            System.out.println("Men�:");
            System.out.println("1. Listar Doctores");
            System.out.println("2. Registrar un nuevo paciente");
            System.out.println("3. Actualizar informaci�n personal de un paciente");
            System.out.println("4. Consultar el historial m�dico de un paciente");
            System.out.println("5. Nuevo historial para un paciente");
            System.out.println("6. Guardar Historial de pacientes en archivo");
            System.out.println("7. Cargar Historial de pacientes desde archivo");
            System.out.println("8. Salir");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    listarDoctores();
                    break;
                case 2:
                    registrarNuevoPaciente();
                    break;
                case 3:
                    actualizarInformacionPaciente();
                    break;
                case 4:
                    consultarHistorialMedico();
                    break;
                case 5:
                    cargarNuevoHistorial();
                    break;
                case 6:
                    guardarPacientesEnArchivo();
                    break;
                case 7:
                    cargarPacientesDesdeArchivo();
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opci�n no v�lida. Por favor, elija una opci�n v�lida.");
            }
        }
    }

    private void listarDoctores() {
        for (Doctor doctor : doctores) {
            System.out.println("Nombre: " + doctor.nombre);
            System.out.println("DNI: " + doctor.DNI);
            System.out.println("Fecha de Nacimiento: " + doctor.fechaNacimiento);
            System.out.println("Especialidad: " + doctor.especialidad);
            System.out.println();
        }
    }

    private void registrarNuevoPaciente() {
        // Implementar la l�gica para registrar un nuevo paciente.
    }

    private void actualizarInformacionPaciente() {
        // Implementar la l�gica para actualizar la informaci�n de un paciente.
    }

    private void consultarHistorialMedico() {
        // Implementar la l�gica para consultar el historial m�dico de un paciente.
    }

    private void cargarNuevoHistorial() {
        // Implementar la l�gica para cargar un nuevo historial m�dico para un paciente.
    }

    private void guardarPacientesEnArchivo() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("pacientes.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(pacientes);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Pacientes guardados en el archivo pacientes.txt.");
        } catch (IOException e) {
            System.out.println("Error al guardar pacientes en el archivo.");
        }
    }

    private void cargarPacientesDesdeArchivo() {
        try {
            FileInputStream fileInputStream = new FileInputStream("pacientes.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            pacientes = (List<Paciente>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Pacientes cargados desde el archivo pacientes.txt.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar pacientes desde el archivo.");
        }
    }
}

class Persona {
    String nombre;
    String DNI;
    String fechaNacimiento;
}

class Doctor extends Persona {
    String especialidad;

    public Doctor(String nombre, String DNI, String fechaNacimiento, String especialidad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidad = especialidad;
    }
}

interface Informacion {
    void verHistorialDeEventos();
}

class Paciente extends Persona implements Informacion {
    int numeroTelefono;
    int tipoSangre;
    List<String> historialMedico;

    public Paciente(String nombre, String DNI, String fechaNacimiento, int numeroTelefono, int tipoSangre) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.tipoSangre = tipoSangre;
        this.historialMedico = new ArrayList<>();
    }

    public void verHistorialDeEventos() {
        for (String evento : historialMedico) {
            System.out.println(evento);
        }
    }
}

class LeerFichero {

    public String leeDatos() {
        StringBuilder contenido = new StringBuilder();
        try {
            /* Entrada es el flujo de datos. El tunel por donde ir?n los datos. */
            FileReader entrada = new FileReader("archivo.txt");

            int caracter = entrada.read(); /*
                                            * nos devuelve el n?mero correspondeinte al caracter UNICODE o -1 si est? en
                                            * el final
                                            */

            while (caracter != -1) { /*
                                      * Preguntamos por -1 para saber cuando termina. caracter tiene el nro
                                      * equivalente al codigo UNICODE de cada letra.
                                      */
                char letra = (char) caracter;
                contenido.append(letra); // Agregar el caracter al contenido
                caracter = entrada.read();
            }
            entrada.close(); /* Siempre hay que cerrar los bufers o accesos a ficheros externos. */

        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenido.toString();
    }

}