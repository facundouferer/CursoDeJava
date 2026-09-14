package Proyectos.Personas;
import java.util.Scanner;
import Proyectos.Personas.Util.Utilidades;

class Inicio {

    static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Persona

        Agenda listaDePersonas = new Agenda();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            Utilidades.mostrarMenu();

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Ingrese el DNI: ");
                    int dni = scanner.nextInt();

                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.next();

                    listaDePersonas.agregarPersona(new Persona(nombre, dni, telefono));

                    System.out.println("Persona agregada correctamente.");
                    break;
                case 2:
                    listaDePersonas.listarPersonas();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la persona a eliminar: ");
                    String nombreEliminar = scanner.next();
                    if (listaDePersonas.eliminarPersona(nombreEliminar))
                        System.out.println("Persona elimindada correctamente.");
                    else
                        System.out.println("Persona no encontrada.");
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la persona a editar: ");
                    break;
                case 5:
                    System.out.print("Ingrese el nombre de la persona a buscar: ");
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta. Solo se pueden usar las opciones 1 y 2.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}