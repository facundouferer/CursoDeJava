package CursoJava.l05_metodos_y_funciones.integrador_fin_ropashop;

import java.util.Scanner;

/**
 * Integrador – Examen final: Inventario de una tienda de ropa (Lección 5 – Métodos y funciones)
 *
 * Enunciado: Un inventario de seis prendas se guarda en un arreglo. El programa permite reemplazar la
 * última prenda por una nueva, buscar una prenda por nombre, vender una prenda (se libera su lugar) y
 * mostrar el inventario resultante.
 *
 * Concepto: arreglos de String recorridos con for y descomposición del programa en métodos estáticos
 * con parámetros y valor de retorno.
 */
public class RopaShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inventario = { "Camisa", "Zapatos", "Polera", "Sandalia", "Blusa", "Pantalón" };

        System.out.print("Escriba la prenda que desea agregar al inventario: ");
        agregarPrenda(inventario, sc.nextLine().trim());
        mostrarInventario(inventario);

        System.out.print("Escriba la prenda que desea buscar en el inventario: ");
        System.out.println(buscarPrenda(inventario, sc.nextLine().trim()) ? "Prenda existente" : "No existe");

        System.out.print("Escriba la prenda que desea vender: ");
        if (venderPrenda(inventario, sc.nextLine().trim())) {
            System.out.println("Prenda vendida.");
        } else {
            System.out.println("La prenda no está en el inventario.");
        }
        mostrarInventario(inventario);
    }

    static void mostrarInventario(String[] inventario) {
        for (int i = 0; i < inventario.length; i++) {
            System.out.println((i + 1) + " : " + (inventario[i] == null ? "(vacío)" : inventario[i]));
        }
    }

    static void agregarPrenda(String[] inventario, String prenda) {
        inventario[inventario.length - 1] = prenda;
    }

    static boolean buscarPrenda(String[] inventario, String prenda) {
        for (String actual : inventario) {
            if (prenda.equals(actual)) {
                return true;
            }
        }
        return false;
    }

    static boolean venderPrenda(String[] inventario, String prenda) {
        for (int i = 0; i < inventario.length; i++) {
            if (prenda.equals(inventario[i])) {
                inventario[i] = null;
                return true;
            }
        }
        return false;
    }
}
