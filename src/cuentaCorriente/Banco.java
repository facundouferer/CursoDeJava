package cuentaCorriente;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente cta1 = new CuentaCorriente("Facundo", 100);
		CuentaCorriente cta2 = new CuentaCorriente("Carlos", 200);
		
		//transferencia
		cta1.restar(50);
		cta2.sumar(50);
		
		System.out.print(cta1.getInfo());
		System.out.print(cta2.getInfo());
		
		

	}

}
