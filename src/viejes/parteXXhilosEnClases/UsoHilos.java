package viejes.parteXXhilosEnClases;

public class UsoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new Numeros();
		Thread hiloUno = new Thread(r);
		hiloUno.start();

	}

}
