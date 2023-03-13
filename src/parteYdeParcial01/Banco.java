package parteYdeParcial01;
import java.util.HashSet;
import java.util.Set;

class Banco {

	public static void main(String[] args) {

		Cliente cliente1= new Cliente("Juana", "357159");
		Cliente cliente2= new Cliente("Ricardo", "987456");
		Cliente cliente3= new Cliente("Pelopincho", "252536" );

		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();

		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);

		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.toString());
		}

		clientesDelBanco.remove(cliente2);

	}
}
class Cliente {
	private String nombre;
	private String nroCuenta;
	public Cliente(String nombre, String nroCuenta) {
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", nroCuenta=" + nroCuenta + "]";
	}
}


