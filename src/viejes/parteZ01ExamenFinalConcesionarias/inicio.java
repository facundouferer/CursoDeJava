package viejes.parteZ01ExamenFinalConcesionarias;

import java.util.HashSet;
import java.util.Set;

class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vendedor vendedor01 = new Vendedor("Carlos", 36258789);
		Vendedor vendedor02 = new Vendedor("Francisco", 15263487);
		Vendedor vendedor03 = new Vendedor("Pedro", 85852258);
		Vendedor vendedor04 = new Vendedor("Tulio", 32456789);
		Vendedor vendedor05 = new Vendedor("Cicerón", 15357951);

		Set<Vendedor> vendedores = new HashSet<Vendedor>();

		vendedores.add(vendedor01);
		vendedores.add(vendedor02);
		vendedores.add(vendedor03);
		vendedores.add(vendedor04);
		vendedores.add(vendedor05);

		Auto auto01 = new Auto(3, "ford", 2020, 254654);
		Auto auto02 = new Auto(4, "toyota", 1985, 254654);
		Auto auto03 = new Auto(3, "Fiat", 1987, 254654);
		Auto auto04 = new Auto(4, "FORDIS", 2019, 254654);
		Auto auto05 = new Auto(3, "card", 2018, 254654);

		Set<Auto> autos = new HashSet<Auto>();

		autos.add(auto01);
		autos.add(auto02);
		autos.add(auto03);
		autos.add(auto04);
		autos.add(auto05);

		Concesionario concesionario = new Concesionario("Autos NEA", "Av. 9 de Julio", 258, vendedores, autos);

		System.out.println("1) Lista los vendedores de la concesionaria \n");
		System.out.println(concesionario.listarVendedores());

		System.out.println("2) Eliminar un vendedor indicando el nombre. \n");
		concesionario.eliminarVendedor("Pedro");

		System.out.println("3) Lista todos los autos que tienen para la venta la concesionaria. \n");
		System.out.println(concesionario.listarAutos());

		System.out.println("4) Vender un auto. \n");
		concesionario.vender(vendedor03, auto04);
		System.out.println(concesionario.listarAutos());

		System.out.println("5) Ver la cantidad de vehículos vendidos. \n");
		System.out.println(concesionario.cantidadAutosVendidos());

		System.out.println("6) Incorporar un vendedor a la concesionaria. \n");
		Vendedor vendedor06 = new Vendedor("Alberto García", 15485265);
		concesionario.incorporarVendedor(vendedor06);
		System.out.println(concesionario.listarVendedores());

		System.out.println("7) Comprar auto para a la concesionaria. \n");
		Auto auto06 = new Auto(3, "TerobitMov", 2017, 99999999);
		concesionario.comprarAuto(auto06);

		System.out.println("8) Implementar la interface paraPersona en la clase Vendedores. \n");

		System.out.println("9) Mover un auto. \n");
		auto03.mover(40);

	}

}
