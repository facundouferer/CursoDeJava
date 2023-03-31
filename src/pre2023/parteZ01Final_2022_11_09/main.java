package pre2023.parteZ01Final_2022_11_09;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // TODO code application logic here


            AdminClientes adminClientes = new AdminClientes();

            // menu
            int opcion = 0;
            Scanner leer = new Scanner(System.in);
            do {
                System.out.println("\n ----------------------------------------\n Bienvenido al sistema de clientes");
                System.out.println("1) Crear Cliente");
                System.out.println("2) Listar clientes");
                System.out.println("3) Buscar y listar datos completos de un cliente");
                System.out.println("4) Buscar y eliminar un cliente");
                System.out.println("5) Salir");
                System.out.print("Ingrese una opcion: ");
                opcion = leer.nextInt();
                //leer.nextLine();
                switch (opcion) {
                    case 1:
                        //add Client
                        System.out.println("\n 1) Crear Cliente");
                        adminClientes.agregarCliente();
                        break;
                    case 2:
                        //list of clientes
                        System.out.println("\n 2) Listar clientes");
                        adminClientes.listarClientes();
                        break;
                    case 3:
                        //search a client
                        System.out.println("\n 3) Buscar por nombre y listar datos completos de un cliente");
                        adminClientes.buscarCliente();
                        break;
                    case 4:
                        //delete a client
                        System.out.println("\n 4) Buscar y eliminar un cliente");
                        adminClientes.eliminarCliente();
                        break;
                    case 5:
                        //exit
                        System.out.println("\n 5) Salir");
                        break;
                    default:
                        System.out.println("\n Opcion incorrecta");
                        break;
                }
            } while (opcion != 5);
    }
}
