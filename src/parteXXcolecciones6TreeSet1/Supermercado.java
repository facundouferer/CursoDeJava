package parteXXcolecciones6TreeSet1;

import java.util.TreeSet;

public class Supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Productos> ordenaProductos = new TreeSet<Productos>();
		
		Productos pr1 = new Productos(5,"Leche");
		Productos pr2 = new Productos(3,"Cafe");
		Productos pr3 = new Productos(15,"Yerba");
		Productos pr4 = new Productos(1,"Agua");
		Productos pr5 = new Productos(2,"Mate");

		ordenaProductos.add(pr1);
		ordenaProductos.add(pr2);
		ordenaProductos.add(pr3);
		ordenaProductos.add(pr4);
		ordenaProductos.add(pr5);
		
		for (Productos producto : ordenaProductos) {
			System.out.println(producto.getDescripcion());
		}
		
	}

}

/*
 * Implementando la interfaz Comparable podemos hacer
 * que mis objetos al agregarse en la colección
 * se ordene según un parámetro que le indiquemos
 */
class Productos implements Comparable<Productos>{
	
	private int nroProducto;
	private String descripcion;
	
	Productos(int nroProducto, String descripcion) {
		// TODO Auto-generated constructor stub
		this.nroProducto = nroProducto;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.nroProducto + " - " + this.descripcion;
	}
	
	/*
	 * La implementación de Comparable no pide que 
	 * implementemos el método compareTo
	 * donde indicaremos el valor que deseamos
	 * que sea comparado para el ordenamiento
	 */
	
	@Override
	public int compareTo(Productos pr) {
		// ESTO PERMITIRÁ ORDENAR POR NRO DE PRODUCTOS
		return nroProducto-pr.nroProducto;
	}
	
}
