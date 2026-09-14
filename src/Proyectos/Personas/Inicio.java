package Proyectos.Personas;

import java.util.Scanner;

class Inicio {

    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Persona

        Agenda listaDePersonas = new Agenda();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1) Agregar Persona");
            System.out.println("2) Listar Personas");
            System.out.println("3) Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Ingrese el DNI: ");
                    int dni = scanner.nextInt();

                    listaDePersonas.agregarPersona(new Persona(nombre, dni));

                    System.out.println("Persona agregada correctamente.");
                    break;

                case 2:
                    listaDePersonas.listarPersonas();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta. Solo se pueden usar las opciones 1 y 2.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}