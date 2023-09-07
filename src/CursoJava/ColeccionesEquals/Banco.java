package CursoJava.ColeccionesEquals;

import java.util.HashSet;
import java.util.Set;

class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1= new Cliente("Ana Juana", "357159", 1000000, 35147852);
		Cliente cliente2= new Cliente("Ricardo Ricardo", "987456", 3000, 36987456);
		Cliente cliente3= new Cliente("Rita Pelopincho", "252536", 1000000, 98951159);
		Cliente cliente4= new Cliente("Ricardo Ricardo", "987456", 3000, 36987459);
		
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();//LA COLECCI�N

		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		
		if(cliente2.equals(cliente4)) {
			System.out.print("son iguales");
		}else {
			System.out.print("NO son iguales");
		}

	}

}

class Cliente {

	private String nombre;
	private String nroCuenta; // como no vamos a realizar operaciones es texto
	private double saldo;
	private int dni;

	public Cliente(String nombre, String nroCuenta, double saldo, int dni) {
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + ", dni=" + dni + "]";
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}


	@Override
	public boolean equals(Object obj) {
		Cliente other = (Cliente) obj;
		if (obj instanceof Cliente) { //para ver que obj sea un objeto de tipo Cliente
			if (this.dni == other.dni) return true;
			else return false;
		} else {
			return false;
		}
	}

}
