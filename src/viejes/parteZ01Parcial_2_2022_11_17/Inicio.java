package viejes.parteZ01Parcial_2_2022_11_17;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        int opcion;
        Administrador admin = new Administrador();
        do {
            Administrador.mostrarMenu();
            Scanner leer = new Scanner(System.in);
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                opcion = 0;
            }
            switch (opcion) {
                case 1:
                    System.out.println("Nuevo Contacto");
                    admin.nuevoContacto();
                    break;
                case 2:
                    System.out.println("Listar todos los Contacto");
                    admin.listarContacto();
                    break;
                case 3:
                    System.out.println("Buscar Contacto por nombre o apellido.");
                    admin.buscarContactoNombre();
                    break;
                case 4:
                    System.out.println("Buscar Contacto por DNI.");
                    admin.buscarContactoDNI();
                    break;
                case 5:
                    System.out.println("Buscar y Eliminar Contacto por DNI");
                    admin.eliminarContactoDNI();
                    break;
                case 6:
                    System.out.println("imprimir en un archivo");
                    admin.imprimirEnArchivo();
                    break;
                case 7:
                    System.out.println("Editar Contacto");
                    admin.editarContacto();
                    break;
                case 99:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 99);

        System.out.println("Fin del programa");

    }
}
