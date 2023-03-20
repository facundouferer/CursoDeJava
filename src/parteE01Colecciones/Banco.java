package parteE01Colecciones;

import java.util.HashSet;
import java.util.Set;

class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1= new Cliente("Ana Juana", "357159", 1000000);
		Cliente cliente2= new Cliente("Ricardo Ricardo", "987456", 3000);
		Cliente cliente3= new Cliente("Rita Pelopincho", "252536", 1000000);
		Cliente cliente4= new Cliente("Juan Perez", "147357", 15000);

		/*
		 * Tirar error porque hay que importar el paquete Set y porque no se puede instanciar una interface
		 * por lo que hay que instanciar la clase que implementa la clase Set:
		 * HashSet será la ideal porque permite el acceso aleatorio
		 */
		
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();//LA COLECCI�N
		
		/*
		 * Con esta estructura agregamos a la colecci�n los clientes
		 */
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		
		/*
		 * Con un foreach podemos recorrer la colecci�n 
		 * de clientes del banco
		 */
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.toString());
		}

		System.out.println("-----DESPUES DE ELIMINAR UN ELEMENTO------");
		
		clientesDelBanco.remove(cliente2); //eliminar un elemento
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.toString());
		}
		

	}

}

class Cliente {

	private String nombre;
	private String nroCuenta; // como no vamos a realizar operaciones es texto
	private double saldo;

	public Cliente(String nombre, String nroCuenta, double saldo) {
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + "]";
	}

}
