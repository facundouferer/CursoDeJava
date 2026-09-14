package Proyectos.Personas;

import java.util.Scanner;
import Proyectos.Personas.Util.UtilidadesPersona;

class Inicio {

    public static void main(String[] args) {
        Agenda listaDePersonas = new Agenda();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            UtilidadesPersona.mostrarMenu();

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    listaDePersonas.listarPersonas();
                    break;

                case 2:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Ingrese el DNI: ");
                    int dni = scanner.nextInt();

                    if (listaDePersonas.buscarPorDni(dni)) {
                        System.out.println("Error: Ya existe una persona registrada con el DNI " + dni + ".");
                        break;
                    }

                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.next();

                    listaDePersonas.agregarPersona(new Persona(nombre, dni, telefono));

                    System.out.println("Persona agregada correctamente.");
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la persona a eliminar: ");
                    String nombreEliminar = scanner.next();
                    if (listaDePersonas.eliminarPersona(nombreEliminar))
                        System.out.println("Persona eliminada correctamente.");
                    else
                        System.out.println("Persona no encontrada.");
                    break;

                case 4:
                    UtilidadesPersona.editarPersona(listaDePersonas, scanner);
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                case 7:
                    UtilidadesPersona.buscarPersona(listaDePersonas, scanner);
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}