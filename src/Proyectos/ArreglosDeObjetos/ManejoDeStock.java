package Proyectos.ArreglosDeObjetos;

public class ManejoDeStock {

    private Producto[] productos;

    // constructor
    public ManejoDeStock() {
        this.productos = new Producto[0];
    }

    public void agregarProducto(Producto productoNuevo) {
        Producto[] nuevosProductos = new Producto[productos.length + 1];
        nuevosProductos[nuevosProductos.length - 1] = productoNuevo;
        for (int i = 0; i < productos.length; i++) {
            nuevosProductos[i] = productos[i];
        }
        this.productos = nuevosProductos;
    }

    public void eliminarProducto(int indice) {
        Producto[] nuevosProductos = new Producto[productos.length - 1];
        for (int i = 0, j = 0; i < productos.length; i++) {
            if (i != indice) {
                nuevosProductos[j++] = productos[i];
            }
        }
        this.productos = nuevosProductos;
    }

    public void venderProducto(String nombre, int cantidad) {
        int indice = this.verID(nombre);
        if (indice != -1) {
            if (productos[indice].getStock() >= cantidad) {
                productos[indice].setStock(cantidad);
            } else {
                System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
            }
        } else {
            System.out.println("El producto " + nombre + " no se encuentra en el stock.");
        }
    }

    public int verID(String nombre) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public void eliminarProducto(String nombre) {
        int indice = this.verID(nombre);
        this.eliminarProducto(indice);
    }

    @Override
    public String toString() {
        String salida = "";
        for (Producto producto : productos) {
            if (producto != null) {
                salida += producto + "\n";
            }
        }
        return salida;
    }

    public String listarProducto() {
        String listadoDeProductos = this.toString();
        return listadoDeProductos;
    }

}