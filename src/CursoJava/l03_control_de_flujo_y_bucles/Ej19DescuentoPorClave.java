package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar un artículo con su precio original y su precio con descuento según su clave
 * (clave 01: 10%, clave 02: 20%).
 * Concepto: 1. Condicionales: if, else if.
 */
public class Ej19DescuentoPorClave {

    public static void main(String[] args) {
        String nombre = "Articulo";
        String clave = "01";
        double precio = 100.0;
        double descuento = 0.0;

        if (clave.equals("01")) {
            descuento = 0.10;
        } else if (clave.equals("02")) {
            descuento = 0.20;
        }

        double precioConDescuento = precio - (precio * descuento);

        System.out.println("Nombre: " + nombre);
        System.out.println("Clave: " + clave);
        System.out.println("Precio: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio con descuento: " + precioConDescuento);
    }
}
