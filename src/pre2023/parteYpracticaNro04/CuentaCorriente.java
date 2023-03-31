package pre2023.parteYpracticaNro04;

public class CuentaCorriente {
	
	private double saldo;
	private String nombreTitula;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.saldo=saldo;
		this.nombreTitula=nombreTitular;
		this.numeroCuenta=(long) (Math.random()*100);
	}
	
	public void setIngreso(double ingreso) {
		this.saldo=this.saldo+ingreso;
	}
	
	public void setReintegro(double monto) {
		this.saldo=this.saldo-monto;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getDatos() {
		return "\nNOMBRE TITULAR: "+this.nombreTitula+
				"\nSALDO: "+this.saldo+
				"\nNRO CUENTA: "+this.numeroCuenta;
	}

}
