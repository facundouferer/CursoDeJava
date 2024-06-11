package ExamenesFinales;

import java.util.Scanner;

public class RopaShop {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        String prenda, prendabuscar, borrarprenda;
        String[] inventario = new String[] { "Camisa", "zapatos", "polera", "sandalia", "blusa", "loquesea" };
        System.out.printf("escriba la prenda que desea agregar al arreglo ");
        prenda = sc.nextLine();
        agregarprenda(inventario, prenda);

        System.out.printf("escriba la prenda que desea buscar en el arreglo ");
        prendabuscar = sc.nextLine();
        buscarprenda(inventario, prendabuscar);
        System.out.printf("escriba la prenda que desea vender ");
        borrarprenda = sc.nextLine();
        venderprenda(inventario, borrarprenda);
        mostrarinventario(inventario);
    }

    public static void mostrarinventario(String[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println((i + 1) + " : " + a[i]);
        }
    }

    public static void agregarprenda(String a[], String b) {
        a[5] = b;
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println((i + 1) + " : " + a[i]);
        }
    }

    public static void buscarprenda(String a[], String b) {
        int aux = 0;
        for (int i = 0; i < 6; i++) {

            if (a[i].equals(b)) {
                System.out.println("Prenda existente");
                aux++;
            }
        }
        if (aux == 0) {
            System.out.println("no existe");
        }
    }

    public static void venderprenda(String a[], String b) {
        String[] inventario = new String[6];
        int i;
        for (i = 0; i < 6; i++) {
            if (a[i].equals(b)) {

            }
        }
    }

}
