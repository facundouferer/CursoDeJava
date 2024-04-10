package viejes.parteZ01Final_2022_11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminClientes {
    private ArrayList<Cliente> clientes;

    public AdminClientes() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombre = leer.nextLine();
        System.out.print("APELLIDO: ");
        String apellido = leer.nextLine();
        System.out.print("DIRECCI�N: ");
        String direccion = leer.nextLine();
        System.out.print("DNI:");
        int dni = leer.nextInt();
        leer.nextLine();
        Cliente cliente = new Cliente(nombre, apellido, direccion, dni);
        this.clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente1 : clientes) {
            System.out.println(cliente1.imprimirInformacion());
        }
    }

    public void buscarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombreCliente = leer.nextLine();
        for (Cliente cliente1 : clientes) {
            if (cliente1.getNombre().equals(nombreCliente)) {
                System.out.println(cliente1.imprimirInformacion());
                break;
            }
        }
    }

    public void eliminarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombreCliente1 = leer.nextLine();
        for (Cliente cliente1 : clientes) {
            if (cliente1.getNombre().equals(nombreCliente1)) {
                clientes.remove(cliente1);
                System.out.println("Cliente eliminado");
                break;
            }
        }
    }
}
