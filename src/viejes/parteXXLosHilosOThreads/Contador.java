package viejes.parteXXLosHilosOThreads;

//PRIMER PASO
public class Contador implements Runnable {

	@Override
	public void run() {

		// TODO Auto-generated method stub

		for (int i = 0; i <= 100; i++) {
			try {

				Thread.sleep(100);
				System.out.print(i + " ");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
