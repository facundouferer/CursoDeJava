package CursoJava.ArreglosDeObjetos;

class GestorDeProductos {

    public static void main(String[] args) {
        
        ManejoDeStock stock = new ManejoDeStock();

        Producto producto1 = new Producto("Producto 1", 10.99, 100);
        Producto producto2 = new Producto("Producto 2", 5.49, 50);
        Producto producto3 = new Producto("Producto 3", 15.75, 75);

        stock.agregarProducto(producto1, 0);
        stock.agregarProducto(producto2, 1);
        stock.agregarProducto(producto3, 2);

        System.out.println("Lista de productos:");
        System.out.println(stock);

    }
    
}

class ManejoDeStock{

    private Producto [] productos;

    //constructor
    public ManejoDeStock(){ 
        this.productos = new Producto[1];
    }

    public void agregarProducto(Producto product, int indice){
        this.productos[indice] = product;
    }

    public void eliminarProducto(int indice){
        this.productos[indice] = null;
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

    @Override
    public String toString() {
        return stock + " " + nombre + " $" + precio;        
    }
}