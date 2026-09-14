package Proyectos.Personas;
import java.util.Scanner;
import Proyectos.Personas.Util.Utilidades;

class Inicio {

    public static void main(String[] args) {
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
                
                    case 4:
                    System.out.print("Ingrese el nombre de la persona a editar: ");
                    
                    String nombreBuscado = scanner.next();

                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.next();

                    System.out.print("Ingrese el nuevo DNI: ");
                    int nuevoDni = scanner.nextInt();

                    if (listaDePersonas.editarPersona(nombreBuscado, nuevoNombre, nuevoDni)) {
                        System.out.println("Persona editada correctamente.");
                    } else {
                        System.out.println("No se encontró una persona con ese nombre.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el nombre de la persona a buscar: ");

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