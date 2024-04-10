package viejes.parteZ01ExamenFinalConcesionarias;

import java.util.Set;

class Concesionario extends Edificio {

	private Set<Vendedor> vendedores;
	private Set<Auto> autos;
	private int cantAutosVendidos;

	public Concesionario(String nombre, String calle, int numero, Set<Vendedor> vendedores, Set<Auto> autos) {
		super.nombre = nombre;
		super.calle = calle;
		super.numero = numero;
		this.vendedores = vendedores;
		this.autos = autos;
		this.cantAutosVendidos = 0;
	}

	public String listarVendedores() {

		String listaDeVendedores = "LISTA DE VENDEDORES \n";

		for (Vendedor vendedor : vendedores) {
			listaDeVendedores = listaDeVendedores + vendedor.toString() + "\n";
		}

		return listaDeVendedores;
	}

	public String listarAutos() {
		String listaDeAutos = "LISTA DE AUTOS \n";
		for (Auto auto : autos) {
			listaDeAutos = listaDeAutos + auto.toString() + "\n";
		}
		return listaDeAutos;
	}

	public boolean eliminarVendedor(String nombre) {
		for (Vendedor vendedor : vendedores) {
			if (vendedor.verNombre().equals(nombre)) {
				this.vendedores.remove(vendedor);
				return true;
			}
		}
		return false;
	}

	public boolean vender(Vendedor vendedorBuscado, Auto auto) {
		autos.remove(auto);
		cantAutosVendidos = cantAutosVendidos + 1;

		for (Vendedor vendedor : vendedores) {
			if (vendedor.equals(vendedorBuscado)) {
				vendedor.incrementarVentas(1);
				return true;
			}
		}
		return false;
	}

	public void incorporarVendedor(Vendedor vendedorNuevo) {
		this.vendedores.add(vendedorNuevo);
	}

	public void comprarAuto(Auto autoNuevo) {
		this.autos.add(autoNuevo);
	}

	public int cantidadAutosVendidos() {
		return this.cantAutosVendidos;
	}

}
