import java.util.Arrays;

public class RopaShop {
    private static String[] inventario = {"Camisa", "Pantalón", "Vestido", "Blusa", "Chaqueta"};

    public static void main(String[] args) {
        agregarPrenda("Zapatos");
        buscarPrenda("Vestido");
        venderPrenda("Blusa");
        mostrarInventario();
    }

    public static void agregarPrenda(String nombrePrenda) {
        String[] nuevoInventario = Arrays.copyOf(inventario, inventario.length + 1);
        nuevoInventario[nuevoInventario.length - 1] = nombrePrenda;
        inventario = nuevoInventario;
        System.out.println("Prenda agregada: " + nombrePrenda);
        mostrarInventario();
    }

    public static void buscarPrenda(String nombrePrenda) {
        for (String prenda : inventario) {
            if (prenda.equals(nombrePrenda)) {
                System.out.println("Prenda existente");
                return;
            }
        }
        System.out.println("No existe");
    }

    public static void venderPrenda(String nombrePrenda) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].equals(nombrePrenda)) {
                String[] nuevoInventario = new String[inventario.length - 1];
                System.arraycopy(inventario, 0, nuevoInventario, 0, i);
                System.arraycopy(inventario, i + 1, nuevoInventario, i, inventario.length - i - 1);
                inventario = nuevoInventario;
                System.out.println("Prenda vendida: " + nombrePrenda);
                mostrarInventario();
                return;
            }
        }
        System.out.println("No existe la prenda");
    }

    public static void mostrarInventario() {
        System.out.println("Inventario:");
        for (String prenda : inventario) {
            System.out.println(prenda);
        }
        System.out.println("Cantidad de prendas: " + inventario.length);
    }
}
