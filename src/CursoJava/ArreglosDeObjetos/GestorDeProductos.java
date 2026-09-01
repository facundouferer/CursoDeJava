package CursoJava.ArreglosDeObjetos;

class GestorDeProductos {

    public static void main(String[] args) {

        TuiManager tui = new TuiManager();
        tui.menu();

        ManejoDeStock stock = new ManejoDeStock();

        Producto producto1 = new Producto("tomate", 10.99, 100);
        Producto producto2 = new Producto("lechuga", 5.49, 50);
        Producto producto3 = new Producto("cebolla", 15.75, 75);

        stock.agregarProducto(producto1);
        stock.agregarProducto(producto2);
        stock.agregarProducto(producto3);
        

do {
            tui.menu();        int opcion;

            System.out.print("Elegí una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Stock inicial: ");
                    int stockInicial = sc.nextInt();
                    sc.nextLine();
                    stock.agregarProducto(new Producto(nombre, precio, stockInicial));
                    System.out.println("Producto agregado correctamente.");
                    break;

                case 2:
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    stock.eliminarProducto(nombreEliminar);
                    System.out.println("Producto eliminado.");
                    break;

                case 3:
                    System.out.print("Nombre del producto a vender: ");
                    String nombreVender = sc.nextLine();
                    System.out.print("Cantidad a vender: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    stock.venderProducto(nombreVender, cantidad);
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
class TuiManager {
    public void menu (){
        System.out.println("-----MENU PRINCIPAL------");
        System.out.println("1- Agregar productos ");
        System.out.println("2- Eliminar productos ");
        System.out.println("3- Vender productos ");
    }
}


class ManejoDeStock{

    private Producto [] productos;

    //constructor
    public ManejoDeStock(){ 
        this.productos = new Producto[0];
    }

    public void agregarProducto(Producto productoNuevo){
        Producto [] nuevosProductos = new Producto[productos.length + 1];
        nuevosProductos[nuevosProductos.length - 1] = productoNuevo;
        for (int i = 0; i < productos.length; i++) {
            nuevosProductos[i] = productos[i];
        }
        this.productos = nuevosProductos;
    }

    public void eliminarProducto(int indice){
            Producto [] nuevosProductos = new Producto[productos.length - 1];
            for (int i = 0, j = 0; i < productos.length; i++) {
                if(i != indice){
                    nuevosProductos[j++] = productos[i];
                }
            }
        this.productos = nuevosProductos;
    }

    public void venderProducto(String nombre, int cantidad){
        int indice = this.verID(nombre);
        if(indice != -1){
            if(productos[indice].getStock() >= cantidad){
                productos[indice].setStock(cantidad);
            }else{
                System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
            }
        } else{
            System.out.println("El producto " + nombre + " no se encuentra en el stock.");
        }
    }

    public int verID(String nombre){
        for (int i = 0; i < productos.length; i++) {
            if(productos[i].getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

    public void eliminarProducto(String nombre){
        int indice = this.verID(nombre);
        this.eliminarProducto(indice); 
    }



    @Override
    public String toString(){
        String salida = "";
        for (Producto producto : productos) {
            if(producto != null){
                salida += producto + "\n";
            }
        }
        return salida;
    }

    public void listarProducto(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

}

class Producto{
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setStock(int cantidad) {
        this.stock -= cantidad;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return stock + " " + nombre + " $" + precio;        
    }
}