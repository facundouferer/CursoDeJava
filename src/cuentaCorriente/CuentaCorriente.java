package cuentaCorriente;

public class CuentaCorriente {
	
	String nombre;
	double saldo;
	int nroCuenta;
	
	public CuentaCorriente(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.nroCuenta = (int)(Math.random()*10);		
	}
	
	public String getInfo() {
		
		return ("Nombre: "+this.nombre+"\n"+
				"Saldo: $"+this.saldo);
	}
	
	public void restar(double monto) {
		this.saldo = this.saldo - monto;
	}
	
	public void sumar(double monto) {
		this.saldo = this.saldo + monto;
	}
	

}
