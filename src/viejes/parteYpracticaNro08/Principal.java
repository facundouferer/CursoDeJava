package viejes.parteYpracticaNro08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo[] vehiculos = new Vehiculo[5];

		vehiculos[0] = new Moto(60);
		vehiculos[1] = new Coche(60);
		vehiculos[2] = new Moto(160);
		vehiculos[3] = new Coche(200);
		vehiculos[4] = new Coche(80);

		System.out.println(vehiculos[3].acelerar(100));
		System.out.println(vehiculos[3].frenar(60));
		System.out.println(vehiculos[3].plazas());

	}

}
