package Proyectos.Personas.Util;

import java.util.Scanner;

import Proyectos.Personas.Agenda;
import Proyectos.Personas.Persona;

 public final class UtilidadesPersona {

    public static void mostrarMenu() {
        System.out.println("1) Listar Personas");
        System.out.println("2) Agregar Persona");
        System.out.println("3) Eliminar Persona");
        System.out.println("4) Editar Persona");
        System.out.println("5) otrogrupo");
        System.out.println("6) Salir");
        System.out.println("7) Buscar Persona");
    }

    public static String caracteristica(String telefono) {
        String prefijo = "+549";
        return prefijo + telefono;
    }

    public static void agregarPersona(Agenda agenda, Scanner scanner) {
        System.out.println("\nAgregar Persona");

        scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();

        agenda.agregarPersona(new Persona(nombre, dni, telefono));
    }

    public static void editarPersona(Agenda agenda, Scanner scanner) {
        System.out.println("\nEditar Persona");
        
        agenda.listarPersonas();

        System.out.print("Ingrese el número de índice de la persona a editar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();

        System.out.print("Ingrese el nuevo DNI: ");
        int nuevoDni = scanner.nextInt();
        scanner.nextLine();
        agenda.editarPersona(indice, nuevoNombre, nuevoDni);
    }

    public static void buscarPersona(Agenda agenda, Scanner scanner) {
        System.out.println("\nBuscar Persona");
        scanner.nextLine();
        System.out.print("Ingrese el texto o apellido a buscar: ");
        String texto = scanner.nextLine();

        agenda.buscarPersona(texto);
    }
}
