package Proyectos.ArreglosDeObjetos;

import Proyectos.ArreglosDeObjetos.Utilidades.TuiManager;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        ManejoDeStock stock = new ManejoDeStock();

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            
            TuiManager.menu();

            System.out.print("Elegí una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    TuiManager.agregarProducto(stock, sc);
                    break;
                case 2:
                    TuiManager.eliminarProducto(stock, sc);
                    break;
                case 3:
                    TuiManager.venderProducto(stock, sc);
                    break;
                case 4:
                    TuiManager.listarProductos(stock);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, probá de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

