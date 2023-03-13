package parteXXhilosEnClases;

public class Numeros implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=1000; i++) {
			try {
				
				Thread.sleep(100);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}
