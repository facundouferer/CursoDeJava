package parteXXLosHilosOThreads;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new Contador();
		Thread hilo = new Thread(r);
		
		//INICIO DEL HILO
		hilo.start();

	}

}
